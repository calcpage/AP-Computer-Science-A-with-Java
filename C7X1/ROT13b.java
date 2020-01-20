//ROT13b.java   MrG     2018.0201
public class ROT13b
{
    private int[] textIn;
    private int[] textOut;

    public ROT13b(String s)
    {
        textIn = new int[s.length()];
        textOut = new int[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            textIn[i]=(int)s.charAt(i);
        }
        for(int i=0; i<s.length(); i++)
        {
            textOut[i]=encrypt((char)textIn[i]);
        }
    }

    public int[] getTextIn()
    {
        return textIn;
    }

    public String toString()
    {
        String temp = "";
        for(int i=0; i<textOut.length; i++)
        {
            temp+=(char)textOut[i];
        }
        return temp;
    }

    private char encrypt(char ch)
    {
        if(Character.isUpperCase(ch))
        {
            return (char)(((ch-'A')+13)%26+'A');
        }

        if(Character.isLowerCase(ch))
        {
            return (char)(((ch-'a')+13)%26+'a');
        }

        return ch;
    }
}