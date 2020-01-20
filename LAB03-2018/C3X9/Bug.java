//Bug.java      MrG     2018.1026
public class Bug
{
    private int pos;
    private int dir;

    /**
     * Constructor
     * @param initPos Starting point of Bug
     * postCondition:   instantiates a Bug
    */
    public Bug(int initPos)
    {
        pos=initPos;
        dir=1;
    }

    /**
     * Accessor
     * preCondition: Bug has been instantiated
     * @return the current position of the Bug
    */
    public int getPos()
    {
        return pos;
    }

    public void moveBug()
    {
        pos+=dir;
    }

    public void turnBug()
    {
        dir=-dir;
    }
}