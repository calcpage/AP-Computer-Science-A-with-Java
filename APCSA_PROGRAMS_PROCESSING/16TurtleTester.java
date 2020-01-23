Turtle t;

void setup() {
  size(800, 800);
  t = new Turtle();
  noLoop();  // only call draw() once
}

void draw() {
  background(255);
	stroke(0);
	rect(0,0,width,height);
	t.setColor(color(255, 0, 0));
 	//triangle();
	//square();
	//squares();
	//star();
	crazy();
	//polygon(8,50);
	//polygons(10,120);
	//koch(100, 60);
}

void koch(int s, int a) {
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	t.right(2*a);
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	
	t.left(a);
	
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	t.right(2*a);
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	
	t.right(2*a);
	
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	t.right(2*a);
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	
	t.left(a);
	
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
	t.right(2*a);
	t.forward(s/3);
	t.left(a);
	t.forward(s/3);
}

void triangle() {
	for (int i = 0; i < 3; i++) {
		t.forward(150);
		t.left(120);
	}
	//t.forward(150);
  //t.left(120);
  //t.forward(150);
  //t.left(120);
  //t.forward(150);
}

void polygon(int n, int s) {
	for (int i = 0; i < n; i++) {
		t.forward(s);
		t.left(360/n);
	}
}

void square() {
	for (int i = 0; i < 4; i++) {
		t.forward(100);
		t.right(90);
	}
  //t.forward(100);
  //t.right(90);
  //t.forward(100);
  //t.right(90);
  //t.forward(100);
  //t.right(90);
  //t.forward(100);
}

void squares() {
	int i = 0;
  while (i < 36) {
    square();
    t.right(10);
    i++;
  }
}

void polygons(int n, int s) {
	int i = 0;
  while (i < 36) {
    polygon(n,s);
    t.right(10);
    i++;
  }
}

void star() {
	for (int i = 0; i < 5; i++) {
		t.forward(200);
		t.left(216);
	}
}

void crazy() {
	for( int i = 0; i < 350; i++) {
		t.forward(i);
		t.left(98);
	}
}


