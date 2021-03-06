public class Tree
{
	public float length;
	public float angle;
	public float ratio;
	
	public Tree(float length, float angle, float ratio)
	{
		this.length = length;
		this.angle = angle;
		this.ratio = ratio;
	}
	
	void branch()
	{
		line(0,0,0,-length);
		
		while(length>5)
		{
			translate(0, -length);
		  rotate(angle);
		  length*=ratio;
		  line(0,0,0,-length);
		}
	}
}
		/*
		//angle = 120;
		//branch_ratio = 0.75;
		//angle = mouseX;
		//branch_ratio = mouseY/1000;
		//angle = random(TWO_PI);
		//println("angle = " + angle);
		//branch_ratio = random(height/1000);
		//println("branch_ratio = " + branch_ratio);
  	line(0,0,0,-length);
  	translate(0, -length);
  	if (length > 5)
		{
    	pushMatrix();
    	rotate(angle);
			stroke(160,50,50);
			length *= branch_ratio;
    	branch();
    	popMatrix();
    	pushMatrix();
    	rotate(-angle);
			stroke(160,50,50);
    	length *= branch_ratio;
    	branch();
    	popMatrix();
  	}	
		else
		{
			stroke(0,128,0);
			ellipse(0,-length,5,5);
		}
	}
	*/