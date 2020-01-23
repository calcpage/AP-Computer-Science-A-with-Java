float angle;
float ratio;
 
void setup()
{
  size(500,500);
}
 
void draw()
{
  background(0);
  fill(128);
  rect(0,0,width,height);
  translate(width/2, height);
  stroke(160,50,50);
  branch(height/3);
}
 
void branch(float length)
{
  angle = PI/6;
  ratio = 0.65;
  //angle = mouseX;
  //ratio = mouseY/1000;
  line(0,0,0,-length);
  translate(0, -length);
  if (length > 5)
  {
    pushMatrix();
    rotate(angle);
    stroke(160,50,50);
    branch(length * ratio);
    popMatrix();
    pushMatrix();
    rotate(-angle);
    stroke(160,50,50);
    branch(length * ratio);
    popMatrix();
  }
  else
  {
    stroke(0,128,0);
    ellipse(0,-length,5,5);
  }
}