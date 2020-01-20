//Rot13b.java           MrG             2019.0131
public class Rot13b
{
    private int[] textIn;
    private int[] textOut;

    public Rot13b(String s)
    {
        textIn = new int[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            textIn[i]=(int)(s.charAt(i));
        }

        textOut = new int[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            textOut[i]=encrypt((char)textIn[i]);
        }
    }

    public String getTextIn()
    {
        String temp = "";
        for(int i=0; i<textIn.length; i++)
        {
            temp+=(char)textIn[i];
        }
        return temp;
    }

    public String getTextOut()
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
        else if(Character.isLowerCase(ch))
             {
                return (char)(((ch-'a')+13)%26+'a');
             }
        return ch;
    }
}
