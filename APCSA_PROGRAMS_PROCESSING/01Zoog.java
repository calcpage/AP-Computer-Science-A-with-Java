void setup()
{
	size(500,500);
	strokeWeight(4);
}

void draw() 
{
	clearScreen();
	drawFace();
	drawMouth();
	drawEyes();
	drawNose();
}

void clearScreen()
{
	background(0);
}

void drawFace()
{
	stroke(255,0,0);
	fill(255,255,0);
	ellipse(mouseX,mouseY,500,500);
}

void drawMouth()
{
	stroke(0,255,0);
	fill(255,0,255);
	rect(mouseX-100,mouseY+100,200,50);
}

void drawEyes()
{
	stroke(0,0,255);
	fill(0,255,255);
	ellipse(mouseX-100,mouseY-100,150,100);
	ellipse(mouseX+100,mouseY-100,150,100);
}

void drawNose()
{
	triangle(mouseX-30,mouseY,mouseX+30,mouseY,mouseX,mouseY+40);
}