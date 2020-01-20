//Line.java             MrG             2018.1212
public class Line extends Object implements Comparable
{
    private double m;
    private double b;

    /**
     * Constructor
     * @param m ...
     * @param b ...
     * postCondition: instantiates a Line object!
     */
    public Line(double m, double b)
    {
        this.m=m;
        this.b=b;
    }

    /**
     * Constructor
     * @param x ...
     * @param y ...
     * @param m ...
     * postCondition: instantiates a Line object!
     */
    public Line(double x, double y, double m)
    {
        this(m,y-x*m);
        //this.m=m;
        //b=y-x*m;
    }

    /**
     * Constructor
     * @param x1 ...
     * @param y1 ...
     * @param x2
     * @param y2
     * postCondition: instantiates a Line object!
     */
    public Line(double x1, double y1, double x2, double y2)
    {
        this(x1,y1,(y2-y1)/(x2-x1));
    }

    /**
     * Accessor
     * preCondition: m is initialized
     * @return m the slope!
     */
    public double getM()
    {
        return m;
    }

    /**
     * Accessor
     * preCondition: m and b are initialized
     * @return a the x-intercept!
     */
    private double getA()
    {
        //0=m*x+b
        return -b/m;
    }

    /**
     * Accessor
     * preCondition: m and b are initialized
     * @return area of the triangle formed by the line, the x-axis and the y-axis!
     */
    private double getArea()
    {
        return 0.5*getA()*getB();
    }

    /**
     * Accessor
     * preCondition: b is initialized
     * @return b the y-intercept!
     */
    public double getB()
    {
        return b;
    }

    /**
     * Accessor
     * preCondition: m and b are initialized for this and other object
     * @param other is another line object
     * @return x the abcissa of the POI of 2 lines!
     */
    public double getX(Line other)
    {
        return (other.getB()-b)/(m-other.getM());
    }

    /**
     * Accessor
     * preCondition: m and b are initialized for this and other object
     * @param other is another line object
     * @return y the ordinate of the POI of 2 lines!
     */
    public double getY(Line other)
    {
        return m*getX(other)+b;
    }

    /**
     * Predicate
     * preCondition: m is initialized for this and other object
     * @param other is another line object
     * @return true iff both slopes are the same!
     */
    public boolean isParallel(Line other)
    {
        return this.m==other.getM();
    }

    /**
     * Predicate
     * preCondition: m is initialized for this and other object
     * @param other is another line object
     * @return true iff both slopes are NOT the same!
     */
    public boolean intersects(Line other)
    {
        return !this.isParallel(other);
    }

    /**
     * Accessor
     * preCondition: m and b are initialized
     * @return equation of the line as a String!
     */
    public String toString()
    {
        return "y = " + m + "*x + " + b;
    }

    /**
     * Predicate
     * preCondition: m and b are initialized for this and other object
     * @param other is another line object
     * @return true iff both slopes are the same and both y-intercepts are the same!
     */
    public boolean equals(Object other)
    {
        Line temp = (Line)other;
        return this.m==temp.getM() && this.b==temp.getB();
    }

    /**
     * Accessor
     * preCondition: m and b are initialized for this and other object
     * @param other is another line object
     * @return <0 if this area is less than other area
     * @return 0 if this area equals other area
     * @return >0 if this area is greater than other area
     */
    public int compareTo(Object other)
    {
        Line temp = (Line)other;
        return (int)(this.getArea()-temp.getArea());
        //return Math.floor(this.getArea()-temp.getArea());
    }
}
