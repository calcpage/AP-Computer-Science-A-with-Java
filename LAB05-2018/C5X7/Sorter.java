//Sorter.java               MrG                 2018.1207
public class Sorter
{
    private String s1;
    private String s2;
    private String s3;

    public Sorter(String s1, String s2, String s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public String getFirst()
    {
        String temp="";
        if(s1.compareTo(s2)<0 && s1.compareTo(s3)<0)
        {
            temp=s1;
        }
        if(s2.compareTo(s1)<0 && s2.compareTo(s3)<0)
        {
            temp=s2;
        }
        if(s3.compareTo(s2)<0 && s3.compareTo(s1)<0)
        {
            temp=s3;
        }
        return temp;
    }

    public String getThird()
    {
        String temp="";
        if(s1.compareTo(s2)>0 && s1.compareTo(s3)>0)
        {
            temp=s1;
        }
        if(s2.compareTo(s1)>0 && s2.compareTo(s3)>0)
        {
            temp=s2;
        }
        if(s3.compareTo(s2)>0 && s3.compareTo(s1)>0)
        {
            temp=s3;
        }
        return temp;
    }

    public String getSecond()
    {
        String temp="";
        if(!s1.equals(getFirst()) && !s1.equals(getThird()))
        {
            temp=s1;
        }
        if(!s2.equals(getFirst()) && !s2.equals(getThird()))
        {
            temp=s2;
        }
        if(!s3.equals(getFirst()) && !s3.equals(getThird()))
        {
            temp=s3;
        }
        return temp;
    }
}