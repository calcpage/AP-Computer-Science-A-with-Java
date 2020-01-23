class Turtle {
  float x;
  float y;
  float angle;
  boolean penUp;
  color penColor;

  Turtle() {
    x = width / 2;
    y = height / 2;
    angle = 0.0;
    penUp = false;
    penColor = color(0);
		strokeWeight(2);
  }

  void penDown() {
    penUp = false;
  }

  void penUp() {
    penUp = true;
  }

  void setColor(color c) {
    penColor = c;
  }

  void left(float degrees) {
    right(-degrees);
  }

  void right(float degrees) {
    angle += degrees;
  }

  void forward(float dist) {
    float dx = dist * cos(radians(angle));
    float dy = dist * sin(radians(angle));
    if (!penUp) {
      stroke(penColor);
      line(x, y, x + dx, y + dy);
    }
    x += dx;
    y += dy;
  }
} 