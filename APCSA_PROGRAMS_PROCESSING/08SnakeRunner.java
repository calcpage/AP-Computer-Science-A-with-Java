Grid g;
Food f;
Snake s;

void setup(){
	size(500,500);
	g = new Grid(20);
	f = new Food(20);
	s = new Snake(20);
	frameRate(10);
}

void draw(){
	background(0);
	g.show();
	f.show();
	if(s.eat(f)){
		f.newLocation();
	}
	
	s.death();
	s.update();
	s.show();
	
	fill(0);
	textSize(32);
	text("Score = " + s.getTotal(),10,30);
}

void keyPressed(){
	if(keyCode == UP){
		s.setDir(0,-1);
	} else if(keyCode == DOWN){
		s.setDir(0,1);
	} else if(keyCode == LEFT){
		s.setDir(-1,0);
	} else if(keyCode == RIGHT){
		s.setDir(1,0);
	}
}





