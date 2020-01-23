class Planet {
  ArrayList tail;
  PVector rpos, pos, acc, vel;
  float R = 10;

  Planet() {
    pos = new PVector(mouseX+scenter.x-width/2, mouseY+scenter.y-height/2); 
    initialize();
  }

  Planet(float _x, float _y) {
    pos = new PVector(_x, _y);
    initialize();
  }

  void initialize() {
    acc = new PVector(0, 0);
    rpos = new PVector(0, 0); 
    vel = new PVector(mouseX-pmouseX, mouseY-pmouseY);
    tail = new ArrayList();
  }

  void move() {
    pos.add(vel);
    vel.add(acc);
    vel.mult(1.0/(FRICTION+1.0));

    acc = new PVector();

    for (int i = 0 ; i < p.size();i++) {
      if (i!=p.indexOf(this)) {
        Planet other = (Planet)p.get(i);
        float d = 1.0+dist(pos.x, pos.y, other.pos.x, other.pos.y);
        PVector dir = new PVector(other.pos.x-pos.x, other.pos.y-pos.y);
        dir.normalize();
        dir.mult(ATT_FORCE / pow(d, 0.95));
        acc.add(dir);
      }
    }

    center.x += (pos.x-center.x)/(p.size()+0.0);
    center.y += (pos.y-center.y)/(p.size()+0.0);

    tail.add(new PVector(pos.x, pos.y));

    if (tail.size()>TAIL_LENGTH)
      tail.remove(0);

    getDimm();
  }

  void deflect() {
    PVector dd = new PVector(sx, sy);
    dd.mult(0.0001);
    acc.sub(dd);
  }

  void getDimm() {
    l = min(pos.x, l);
    r = max(pos.x, r);
    t = min(pos.y, t);
    b = max(pos.y, b);
  }  

  void draw() {
    fill(0);
    noStroke();
    ellipse(pos.x, pos.y, R, R);
    rpos = new PVector(screenX(pos.x, pos.y), screenY(pos.x, pos.y));
  }

  void drawTail() {
    noFill();
    beginShape();
    for (int i = 0 ; i < tail.size();i++) {
      PVector tmp = (PVector)tail.get(i);
      // strokeWeight(map(i, 0, tail.size(), 1, r/2.0));
      stroke(0, map(i, 0, tail.size(), 0, 255));
      vertex(tmp.x, tmp.y);
    }
    endShape();
  }
}