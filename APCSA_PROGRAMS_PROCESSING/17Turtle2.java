public class Turtle2 {

  String todo;
  float len;
  float theta;

  public Turtle2(String s, float l, float t) {
    todo = s;
    len = l; 
    theta = t;
  } 

  public void render() {
    stroke(0);
		strokeWeight(2);
		//translate(width/2, height);
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

	public void initPos(float x, float y) {
		translate(x, y);
	}
	
	public void initDir(float angle) {
		rotate(angle);
	}
	
	public void setTheta(float t) {
		theta = t;
	}
	
  public void setLen(float l) {
    len = l; 
  } 

  public void changeLen(float percent) {
    len *= percent; 
  }

  public void setToDo(String s) {
    todo = s; 
  }

}