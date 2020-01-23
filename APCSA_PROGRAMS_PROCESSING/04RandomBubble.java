//MrG   2017.1031 randomBubble.pde
float x;
float y;
float w;
float h;
float maxX;
float minX;
float maxY;
float minY;

void setup()
{
  size(1600,1200);
}

void draw()
{
  background(random(256),random(256),random(256));
  maxX=3*width/4;
  minX=1*width/4;
  x=random(maxX-minX+1)+minX;
  maxY=3*height/4;
  minY=1*height/4;
  y=random(maxY-minY+1)+minY;
  w=random(200);
  h=random(300);
  stroke(random(256),random(256),random(256));
  fill(random(256),random(256),random(256));
  ellipse(x,y,w,h);
}