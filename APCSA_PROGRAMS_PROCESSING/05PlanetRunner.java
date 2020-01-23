float ATT_FORCE = 20;
int TAIL_LENGTH = 133;
float FRICTION =  0.006;
float FOLLOW_SPEED = 30.0;
int C_TRAIL_LENGTH = 3000;
float sx, sy;
PVector center, scenter;
//ArrayList centrail;
//ArrayList p;
ArrayList<PVector> centrail;
ArrayList<Planet> p;
float zoom = 1.0;
float ratio = 1.0;
float l, r, t, b;

void setup() {
  size(1500, 700, P2D);
  center = new PVector(0, 0);
  scenter = new PVector(0, 0);
	//centrail = new ArrayList();
  //p = new ArrayList();
  centrail = new ArrayList<PVector>();
  p = new ArrayList<Planet>();
  for (int i = 0 ; i < 5;i++){
		p.add(new Planet(random(width), random(height)));
	}
}

void draw() {
  background(128);
	fill(255);
	rect(0,0,width,height);
  
	scenter.x += (center.x-scenter.x) / FOLLOW_SPEED;
  scenter.y += (center.y-scenter.y) / FOLLOW_SPEED;

  pushMatrix();

  translate(-scenter.x+width/2, -scenter.y+height/2);

  noFill();
  stroke(#ff1100);

  for (int i = 1 ; i < centrail.size();i++) {
    //PVector tmp1 = (PVector)centrail.get(i-1);
    //PVector tmp2 = (PVector)centrail.get(i);
		PVector tmp1 = centrail.get(i-1);
    PVector tmp2 = centrail.get(i);
    stroke(#ff1100, map(i, 0, centrail.size(), 5, 90));
    line(tmp1.x, tmp1.y, tmp2.x, tmp2.y);
  }

  fill(#ff1100);
  ellipse(center.x, center.y, 5, 5);

  noFill();

  l = t = 10000.0;
  r = b = -10000.0;

  for (int i = 0 ; i < p.size();i++) {
    //Planet tmp = (Planet)p.get(i);
		Planet tmp = p.get(i);
    tmp.move();
  }

  for (int i = 0 ; i < p.size();i++) {
    //Planet tmp = (Planet)p.get(i);
		Planet tmp = p.get(i);
    tmp.drawTail();
  }

  for (int i = 0 ; i < p.size();i++) {
    //Planet tmp = (Planet)p.get(i);
		Planet tmp = p.get(i);
    tmp.draw();
  }

  sx = (r-l);
  sy = (b-t);

  if (sx > width || sy > height) {
    ratio = ((width/sx+1.0) / (height/sy+1.0))/2.0;
  }

  noFill();

  centrail.add(new PVector((center.x), (center.y)));

  if (centrail.size()>C_TRAIL_LENGTH)
    centrail.remove(0); 
	
  popMatrix();
}

void mousePressed() {
  if (mouseButton==LEFT) {
    p.add(new Planet());
  }
  else {
    if (p.size()>=1)
      p.remove(p.size()-1);
  }
}