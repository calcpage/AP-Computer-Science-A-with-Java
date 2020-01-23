public class Grid
{
	private int scl;
	
	public Grid(int scl)
	{
		this.scl=scl;
	}
	
	public void show()
	{
		fill(127);
		rect(0,0,width,height);
		stroke(0,255,0);
		
		for(int r=0; r<height; r+=scl)
		{
			line(0,r,width,r);
		}
		
		for(int c=0; c<width; c+=scl)
		{
			line(c,0,c,height);
		}
	}
}

