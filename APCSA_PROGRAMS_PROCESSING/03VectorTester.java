Vector a;
Vector b;
void setup()
{
  size(500,500);
  a=new Vector(-90,-120);
  b=new Vector(150,30);
  background(0);
  strokeWeight(5);
}

void draw()
{
  noLoop();
  translate(width/2,height/2);
  stroke(0,255,0);
  a.display();
  stroke(0,255,0);
  b.display();
  //a.add(b);
  //stroke(255,0,0);
  //a.display();
  //b.mul(2);
  //stroke(0,255,0);
  //b.display();
  a.sub(b);
  stroke(255,255,255);
  a.display();
  println("magnitude of a is: " + a.mag());
  println("direction of a is: " + a.dir());
}