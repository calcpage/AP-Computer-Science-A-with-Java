Tree t;

void setup()
{
	noLoop();
  size(500,500);
	background(0);
	fill(128);
	rect(0,0,width,height);
	t = new Tree(height/3, 120, 0.65);
	
}

void draw()
{
  translate(width/2, height);
	stroke(160,50,50);
  t.branch();
}