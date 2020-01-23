LSystem2 lsys;
Turtle2 turtle;

void setup() {
  size(600, 400);
  
	//fass curves
	/*
	Rule2[] ruleset = new Rule2[2];
  ruleset[0] = new Rule2("F","GF+GFG+FG-F-GFGFG-FGFG+");
  ruleset[1] = new Rule2("G","-GFGF+GFGFG+F+GF-GFG-FG");
  lsys = new LSystem2("-G",ruleset);
  turtle = new Turtle2(lsys.getSentence(),width/8,PI/2);
	*/
	
	//koch curves
	/*
	Rule2[] ruleset = new Rule2[1];
  ruleset[0] = new Rule2("F","F-F+F+FF-F-F+F");
  lsys = new LSystem2("F-F-F-F",ruleset);
  turtle = new Turtle2(lsys.getSentence(),width/8,PI/3);
	*/
	
	//seirpinski gasket
	/*
  Rule2[] ruleset = new Rule2[2];
  ruleset[0] = new Rule2("F","F--F--F--G");
  ruleset[1] = new Rule2("G","GG");
  lsys = new LSystem2("F--F--F",ruleset);
  turtle = new Turtle2(lsys.getSentence(),width,TWO_PI/3);
	*/
	
  //trees + p25, p28 in abop?
	
  Rule2[] ruleset = new Rule2[1];
  ruleset[0] = new Rule2("F", "FF+[+F-F-F]-[-F+F+F]");
	//ruleset[0] = new Rule2("F","F[F]-F+F[--F]+F-F");
  lsys = new LSystem2("F", ruleset);
  turtle = new Turtle2(lsys.getSentence(), height/4, radians(25));
  
	
	//turtle.render();
	
  //smooth();
}

void draw() {
	noLoop();
  background(255);  
  stroke(0);
	strokeWeight(2)
  rect(0,0,width,height);
  translate(width/2, height);
  //rotate(-PI/2);
	for(int i = 0; i < 3; i++)
	{
    lsys.generate();
		println(lsys.getSentence());
    turtle.setToDo(lsys.getSentence());
    turtle.changeLen(0.4);
		turtle.render();
	}
	//turtle.render();
}