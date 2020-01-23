GOL game;

void setup()
{
	size(500,500);
	game = new GOL(50,50);
}

void draw()
{
	//background(0,0,255);
	background(127);
	game.render();
	game.update();
}