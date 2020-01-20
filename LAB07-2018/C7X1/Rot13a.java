//Rot13a.java           MrG             2019.0131
public class Rot13a
{
    private String textIn;
    private String textOut;

    public Rot13a(String s)
    {
        textIn=s;
        textOut="";

        for(int i=0; i<s.length(); i++)
        {
            textOut+=encrypt(s.charAt(i));
        }
    }

    public String getTextIn()
    {
        return textIn;
    }

    public String getTextOut()
    {
        return textOut;
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
