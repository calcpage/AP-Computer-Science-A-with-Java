//ROT13.java    MrG     2018.0131
public class ROT13
{
    private String textIn;
    private String textOut;

    public ROT13(String s)
    {
        textIn = s;
        textOut = "";

        for(int i=0; i<textIn.length(); i++)
        {
            textOut += encrypt(textIn.charAt(i));
        }
    }

    public String toString()
    {
        return textOut;
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







