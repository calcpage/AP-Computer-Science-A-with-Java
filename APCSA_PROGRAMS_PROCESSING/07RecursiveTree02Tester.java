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
  Tree.branch(height/3, mouseX, mouseY/1000);
}