Turtle2 turtle;

void setup() {
  size(600, 600);
	//turtle = new Turtle2("F",width,radians(60));
	//turtle = new Turtle2("F-F++F-F",width/3,radians(60));
	//turtle = new Turtle2("F-F++F-F-F-F++F-F++F-F++F-F-F-F++F-F",width/9,radians(60));
	turtle = new Turtle2("F-F++F-F-F-F++F-F++F-F++F-F-F-F++F-F-F-F++F-F-F-F++F-F++F-F++F-F-F-F++F-F++F-F++F-F-F-F++F-F++F-F++F-F-F-F++F-F-F-F++F-F-F-F++F-F++F-F++F-F-F-F++F-F",width/27,radians(60));
	
	
	//turtle = new Turtle2("F[+F+F+F-][-F-F-F]F+F+",height/4,radians(60));
  //turtle = new Turtle2("FF+[+F-F-F]-[-F+F+F]", height/4, radians(25));
  //smooth();
	//turtle = new Turtle("F", height/3, radians(45));
}

void draw() {
  background(255);  
  stroke(0);
	strokeWeight(4);
	rect(0,0,width,height);
	//translate(0, height/2);
	turtle.initPos(width/3, height/3);
	//rotate(PI/2);
	turtle.initDir(radians(90));
	turtle.setLen(width/81);
  //translate(width/2, height);
  //rotate(-PI/2);
  turtle.render();
	rotate(radians(120));
	turtle.render();
	rotate(radians(120));
	turtle.render();
  noLoop();
}