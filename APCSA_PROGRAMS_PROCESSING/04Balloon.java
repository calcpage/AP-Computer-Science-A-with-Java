//BalloonTester.pde MrG 2018.0206 
Balloon[] bunch;

void setup()
{
  smooth();
  size(1400,1000);
  bunch = new Balloon[200];
  for(int i=0; i<bunch.length; i++)
  {
    bunch[i] = new Balloon();
  }
}

void draw()
{
  background(255);
  for(int i=0; i<bunch.length; i++)
  {
    bunch[i].update();
    bunch[i].checkEdges();
    bunch[i].display();
  }
}