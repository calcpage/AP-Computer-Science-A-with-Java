public class GOL
{
	private boolean[][] grid;
	
	public GOL(int w, int h)
	{
		grid = new boolean[h][w];
		
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[r].length; c++)
			{
				if(random(1)<0.3)
				{
					grid[r][c] = true;
				}
				else
				{
					grid[r][c] = false;
				}
			}
		}
	}
	
	public void render()
	{
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[r].length; c++)
			{
				double xScl = width/grid[r].length;
				double yScl = height/grid.length;
				if(grid[r][c])
				{
					//fill(255,0,0);
					fill(255);
				}
				else
				{
					//fill(0,255,0);
					fill(0);
				}
				rect(c*xScl,r*yScl,xScl,yScl);
			}
		}
	}
	
	public void update()
	{
		boolean[][] tempGrid = new boolean[grid.length][grid[0].length];
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[r].length; c++)
			{
				int n = getCount(r,c);
				if((n==0 || n == 1) && grid[r][c])
				{
					tempGrid[r][c] = false;
				}
				if((n == 2 || n == 3) && grid[r][c])
				{
					tempGrid[r][c] = true;
				}
				if(n > 3 && grid[r][c])
				{
					tempGrid[r][c] = false;
				}
				if(n == 3 && !grid[r][c])
				{
					tempGrid[r][c] = true;
				}
			}
		}
		grid = tempGrid;
	}
	
	private int getCount(int r, int c)
	{
		int count = 0;
		for(int x = -1; x < 2; x++)
		{
			for(int y = -1; y < 2; y++)
			{
				int xLoc = r+x;
				int yLoc = c+y;
				if(xLoc<0){xLoc+=grid[0].length;}
				if(yLoc<0){yLoc+=grid.length;}
				if(grid[xLoc%grid[0].length][yLoc%grid.length])
				{
					count++;
				}
			}
		}
		if(grid[r][c])
		{
			return count-1;
		}
		return count;
	}
}
	

