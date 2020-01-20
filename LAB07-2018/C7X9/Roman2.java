//Roman2.java                MrG                 2019.0328
public class Roman2 implements Comparable<Roman2>
{
    private int num;
    private int[] digits;

    public Roman2(int num)
    {
        this.num = num;
        digits = new int[6];
        for(int i = 0; i<digits.length; i++)
        {
            digits[i]=num%10;
            //num = num/10;
            num/=10;
        }
    }

    public int getNum()
    {
        return num;
    }

    public String toString()
    {
        String temp = "";

        if(digits[5] == 1){temp += "C";}
        if(digits[5] == 2){temp += "CC";}
        if(digits[5] == 3){temp += "CCC";}
        if(digits[5] == 4){temp += "CD";}
        if(digits[5] == 5){temp += "D";}
        if(digits[5] == 6){temp += "DC";}
        if(digits[5] == 7){temp += "DCC";}
        if(digits[5] == 8){temp += "DCCC";}
        if(digits[5] == 9){temp += "CM";}

        if(digits[4] == 1){temp += " X";}
        if(digits[4] == 2){temp += " XX";}
        if(digits[4] == 3){temp += " XXX";}
        if(digits[4] == 4){temp += " XL";}
        if(digits[4] == 5){temp += " L";}
        if(digits[4] == 6){temp += " LX";}
        if(digits[4] == 7){temp += " LXX";}
        if(digits[4] == 8){temp += " LXXX";}
        if(digits[4] == 9){temp += " XC";}

        if(digits[3] == 1){temp += " m";}
        if(digits[3] == 2){temp += " mm";}
        if(digits[3] == 3){temp += " mmm";}
        if(digits[3] == 4){temp += " mV";}
        if(digits[3] == 5){temp += " V";}
        if(digits[3] == 6){temp += " Vm";}
        if(digits[3] == 7){temp += " Vmm";}
        if(digits[3] == 8){temp += " Vmmm";}
        if(digits[3] == 9){temp += " mX";}

        if(digits[2] == 1){temp += " c";}
        if(digits[2] == 2){temp += " cc";}
        if(digits[2] == 3){temp += " ccc";}
        if(digits[2] == 4){temp += " cd";}
        if(digits[2] == 5){temp += " d";}
        if(digits[2] == 6){temp += " dc";}
        if(digits[2] == 7){temp += " dcc";}
        if(digits[2] == 8){temp += " dccc";}
        if(digits[2] == 9){temp += " cm";}

        if(digits[1] == 1){temp += " x";}
        if(digits[1] == 2){temp += " xx";}
        if(digits[1] == 3){temp += " xxx";}
        if(digits[1] == 4){temp += " xl";}
        if(digits[1] == 5){temp += " l";}
        if(digits[1] == 6){temp += " lx";}
        if(digits[1] == 7){temp += " lxx";}
        if(digits[1] == 8){temp += " lxxx";}
        if(digits[1] == 9){temp += " xc";}

        if(digits[0] == 1){temp += " i";}
        if(digits[0] == 2){temp += " ii";}
        if(digits[0] == 3){temp += " iii";}
        if(digits[0] == 4){temp += " iv";}
        if(digits[0] == 5){temp += " v";}
        if(digits[0] == 6){temp += " vi";}
        if(digits[0] == 7){temp += " vii";}
        if(digits[0] == 8){temp += " viii";}
        if(digits[0] == 9){temp += " ix";}

        return temp;
    }

    public Roman2 add(Roman2 other)
    {
        return new Roman2(this.getNum()+other.getNum());
    }

    public Roman2 sub(Roman2 other)
    {
        return new Roman2(this.getNum()-other.getNum());
    }

    public Roman2 mul(Roman2 other)
    {
        return new Roman2(this.getNum()*other.getNum());
    }

    public int compareTo(Roman2 other)
    {
        return num - other.getNum();
    }

    public boolean equals(Object other)
    {
        Roman2 temp = (Roman2)other;
        return this.compareTo(temp)==0;
    }
}