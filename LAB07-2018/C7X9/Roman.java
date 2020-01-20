//Roman.java                MrG                 2019.0328
public class Roman implements Comparable<Roman>
{
    private int num;

    public Roman(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return num;
    }

    public String toString()
    {
        String temp = "";
        int ones = num%10;
        int tens = num/10;

        if(tens == 1){temp += "x";}
        if(tens == 2){temp += "xx";}
        if(tens == 3){temp += "xxx";}
        if(tens == 4){temp += "xl";}
        if(tens == 5){temp += "l";}
        if(tens == 6){temp += "lx";}
        if(tens == 7){temp += "lxx";}
        if(tens == 8){temp += "lxxx";}
        if(tens == 9){temp += "xc";}

        temp += " ";

        if(ones == 1){temp = "i";}
        if(ones == 2){temp += "ii";}
        if(ones == 3){temp += "iii";}
        if(ones == 4){temp += "iv";}
        if(ones == 5){temp += "v";}
        if(ones == 6){temp += "vi";}
        if(ones == 7){temp += "vii";}
        if(ones == 8){temp += "viii";}
        if(ones == 9){temp += "ix";}

        return temp;
    }

    public Roman add(Roman other)
    {
        return new Roman(this.getNum()+other.getNum());
    }

    public Roman sub(Roman other)
    {
        return new Roman(this.getNum()-other.getNum());
    }

    public Roman mul(Roman other)
    {
        return new Roman(this.getNum()*other.getNum());
    }

    public int compareTo(Roman other)
    {
        return num - other.getNum();
    }

    public boolean equals(Object other)
    {
        Roman temp = (Roman)other;
        return this.compareTo(temp)==0;
    }
}