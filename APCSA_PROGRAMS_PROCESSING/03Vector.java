class Vector
{
  int x;
  int y;
  
  Vector(int x, int y)
  {
     this.x=x;
     this.y=y;
  }
  
  void display()
  {
    line(0,0,x,y);    
  }
  
  void add(Vector other)
  {
    x+=other.x;
    y+=other.y;
  }
  
  void mul(int s)
  {
    x*=s;
    y*=s;
  }
  
  void sub(Vector other)
  {
    other.mul(-1);
    this.add(other);    
  }
  
  double mag()
  {
    return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
  }
  
  double dir()
  {
    return Math.atan((double)y/x);      
  }
}