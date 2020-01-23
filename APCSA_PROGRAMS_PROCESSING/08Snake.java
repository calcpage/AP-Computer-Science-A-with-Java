public class Snake
{
	private int scl;
	private int x;
	private int y;
	private int xDir;
	private int yDir;
	private int total;
	private ArrayList<Segment> tail;
	
	public Snake(int scl)
	{
		this.scl = scl;
		xDir = 1;
		yDir = 0;
		total = 0; 
		newLocation();
		tail = new ArrayList<Segment>();
	}
	
	public void newLocation()
	{
		int cols = width/scl;
		int rows = height/scl;
		x = floor(random(cols))*scl;
		y = floor(random(rows))*scl;
	}
	
	public void update()
	{
		//x += xDir*scl;
		//y += yDir*scl;
		//if((total>0) && !(total == tail.size()))
		//{
			//tail.add(new Segment(x,y,scl));
		//}
		if(total>0)
		{
			if(total == tail.size() && !tail.isEmpty())
			{
				tail.remove(0);
			}
			tail.add(new Segment(x,y,scl));
		}
		x += xDir*scl;
		y += yDir*scl;
	}
	
	public void show()
	{
		fill(255);
		rect(x, y, scl, scl);
		for(Segment p: tail)
		{
			rect(p.getX(), p.getY(), scl, scl);
		}
	}
	
	public void setDir(int dx, int dy)
	{
		xDir = dx;
		yDir = dy;
	}
	
	public int getTotal()
	{
		return total;
	}

	public void death()
	{
		for(int i = 0; i < tail.size(); i++)
		{
			if((x==tail.get(i).getX()) && (y==tail.get(i).getY()))
			{
				total = 0;
				tail.clear();
			}
		}	
	}

	public boolean eat(Food f)
	{
		if ((this.x==f.getX()) && (this.y==f.getY()))
		{
			total++;
			return true;
		}
		return false;
	}


}







