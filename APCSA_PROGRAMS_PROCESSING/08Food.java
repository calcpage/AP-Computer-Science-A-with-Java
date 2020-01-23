public class Food
{
	private int scl;
	private int x;
	private int y;
	
	public Food(int scl)
	{
		this.scl = scl;
		newLocation();
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void newLocation()
	{
		int cols = width/scl;
		int rows = height/scl;
		x = floor(random(cols))*scl;
		y = floor(random(rows))*scl;
	}
	
	public void show()
	{
		fill(255,0,0);
		rect(x, y, scl, scl);
	}
}
		
		
		