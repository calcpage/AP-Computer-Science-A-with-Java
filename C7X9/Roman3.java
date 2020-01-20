//Roman3.java MrG 2018.0320
public class Roman3 extends Object implements Comparable<Roman3>
{
    private int[] digits;
    private final String[][] table={
        {""    ,""    ,""    ,""    ,""    ,""},
        {"i"   ,"x"   ,"c"   ,"m"   ,"X"   ,"C"},
        {"ii"  ,"xx"  ,"cc"  ,"mm"  ,"XX"  ,"CC"},
        {"iii" ,"xxx" ,"ccc" ,"mmm" ,"XXX" ,"CCC"},
        {"iv"  ,"xl"  ,"cd"  ,"mV"  ,"XL"  ,"CD"},
        {"v"   ,"l"   ,"d"   ,"V"   ,"L"   ,"D"},
        {"vi"  ,"lx"  ,"dc"  ,"Vm"  ,"LX"  ,"DC"},
        {"vii" ,"lxx" ,"dcc" ,"Vmm" ,"LXX" ,"DCC"},
        {"viii","lxxx","dccc","Vmmm","LXXX","DCCC"},
        {"ix"  ,"xc"  ,"cm"  ,"mX"  ,"XC"  ,"CM"}
    };
    public Roman3(int num)
    {
        digits = new int[6];
        for(int i=0; i<6; i++)
        {
            digits[i]=num%10;
            num/=10;
        }

    }
    public String getDigits()
    {
        String temp="";
        for(int n:digits)
        {
            temp+=n;
        }
        return temp;
    }
    public int getNum()
    {
        int temp=0;

        for(int i=0; i<6; i++)
        {
            temp+=digits[i]*Math.pow(10,i);
        }

        return temp;
    }
    public int compareTo(Roman3 other)
    {
        return this.getNum()-other.getNum();
    }
    public boolean equals(Object other)
    {
        Roman3 temp = (Roman3)other;
        return temp.compareTo(this)==0;
    }
    public String toString()
    {
        String temp="";

        for(int r=1; r<10; r++)
        {
            for(int c=0; c<6; c++)
            {
                if(digits[c]==r)
                {
                    temp=table[r][c]+" "+temp;
                    //temp+=table[r][c];
                }
            }
        }

        return temp;
    }
    public Roman3 add(Roman3 other)
    {
        return new Roman3(getNum()+other.getNum());
    }
    public Roman3 sub(Roman3 other)
    {
        return new Roman3(getNum()-other.getNum());
    }
    public Roman3 mul(Roman3 other)
    {
        return new Roman3(getNum()*other.getNum());
    }
}