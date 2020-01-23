public class Tree
{
	public static void branch(float length, float angle, float ratio)
	{
		//float angle = PI/6;
		//float ratio = 0.65;
		//angle = mouseX;
		//ratio = mouseY/1000;
  	line(0,0,0,-length);
  	translate(0, -length);
  	if (length > 5)
		{
    	pushMatrix();
    	rotate(angle);
			stroke(160,50,50);
    	branch(length * ratio, angle, ratio);
    	popMatrix();
    	pushMatrix();
    	rotate(-angle);
			stroke(160,50,50);
    	branch(length * ratio, angle, ratio);
    	popMatrix();
  	}
		else
		{
			stroke(0,128,0);
			ellipse(0,-length,5,5);
		}
	}
}
