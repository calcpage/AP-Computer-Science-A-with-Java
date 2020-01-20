//Roman3.java                MrG                 2019.0328
public class Roman3 implements Comparable<Roman3>
{
    private int num;
    private int[] digits;
    private final String[][] table = {
    {" ",      " ",      " ",      " ",      " ",      " "},
    {"i",      "x",      "c",      "m",      "X",      "C"},
    {"ii",     "xx",     "cc",     "mm",     "XX",     "CC"},
    {"iii",    "xxx",    "ccc",    "mmm",    "XXX",    "CCC"},
    {"iv",     "xl",     "cd",     "mV",     "XL",     "CD"},
    {"v",      "l",      "d",      "V",      "L",      "D"},
    {"vi",     "lx",     "dc",     "Vm",     "LX",     "DC"},
    {"vii",    "lxx",    "dcc",    "Vmm",    "LXX",    "DCC"},
    {"viii",   "lxxx",   "dccc",   "Vmmm",   "LXXX",   "DCCC"},
    {"ix",     "xc",     "cm",     "mX",     "XC",     "CM"}
    };

    public Roman3(int num)
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

        for(int r = 0; r < table.length; r++)
        {
            for(int c = 0; c < table[0].length; c++)
            {
                if(digits[c] == r)
                {
                    //if(digits[1]==2) {temp += " xx";}
                    //temp += " " + table[r][c];
                    temp = " " + table[r][c] + temp;
                }

            }
        }

        return temp;
    }

    public Roman3 add(Roman3 other)
    {
        return new Roman3(this.getNum()+other.getNum());
    }

    public Roman3 sub(Roman3 other)
    {
        return new Roman3(this.getNum()-other.getNum());
    }

    public Roman3 mul(Roman3 other)
    {
        return new Roman3(this.getNum()*other.getNum());
    }

    public int compareTo(Roman3 other)
    {
        return num - other.getNum();
    }

    public boolean equals(Object other)
    {
        Roman3 temp = (Roman3)other;
        return this.compareTo(temp)==0;
    }
}

//{" ",      " ",      " ",      " ",      " ",      " "},
//temp = " " + table[r][c] + temp;