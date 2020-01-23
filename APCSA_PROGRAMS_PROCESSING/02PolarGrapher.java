double t,dt;

void setup() {
	size(500, 500);
	background(100);
	translate(width/2,height/2);
	line(0,-250,0,250);
	line(-250,0,250,0);
	t=0;
	dt=.01;
}

void draw() {
	translate(width/2,height/2);
	//polar graph of r=50+50*cos(t)
	//x=r*cos(t), y=r*sin(t)
	point((50+50*cos(t))*cos(t),(50+50*cos(t))*sin(t));
	println("("+t+", "+(50+50*cos(t))+")");
	t+=dt;
}