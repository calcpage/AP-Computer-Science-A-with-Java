public class Segment
{
	private int scl;
	private int x;
	private int y;
	
	public Segment(int x, int y, int scl)
	{
		this.scl = scl;
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void show()
	{
		fill(255,0,0);
		rect(x, y, scl, scl);
	}
}