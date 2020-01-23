class Turtle2 {

  String todo;
  float len;
  float theta;

  Turtle2(String s, float l, float t) {
    todo = s;
    len = l; 
    theta = t;
  } 

  void render() {
    stroke(150,150,50);
		strokeWeight(2);
		//translate(width/2, height/2);
    for (int i = 0; i < todo.length(); i++) {
      String s = todo.substring(i,i+1);
			//changeLen(0.95);
      if (s.equals("F")) {
        line(0,0,0,-len);
        translate(0,-len);
      } 
			else if (s.equals("G")) {
				translate(0,-len);
			}
      else if (s.equals("+")) {
        rotate(theta);
      } 
      else if (s.equals("-")) {
        rotate(-theta);
      } 
      else if (s.equals("[")) {
        pushMatrix();
      } 
      else if (s.equals("]")) {
        popMatrix();
      }
    } 
  }

  void setLen(float l) {
    len = l; 
  } 

  void changeLen(float percent) {
    len *= percent; 
  }

  void setToDo(String s) {
    todo = s; 
  }

}