void setup()
{
  size(1200,1024);
}

void draw()
{
  //background(0);
  stroke(random(256),random(256),random(256));
  fill(random(256),random(256),random(256));
  ellipse(random(2*width/3-width/3)+width/3,random(2*height/3-height/3)+height/3,random(width),random(height));
}