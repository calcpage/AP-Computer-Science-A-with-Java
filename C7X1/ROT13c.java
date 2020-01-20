//ROT13c.java   MrG     2018.0201
import java.util.ArrayList;
public class ROT13c
{
    private ArrayList<Integer> textIn;
    private ArrayList<Integer> textOut;

    public ROT13c(String s)
    {
        textIn = new ArrayList<Integer>();
        textOut = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++)
        {
            textIn.add((int)s.charAt(i));
        }
        for(int i=0; i<s.length(); i++)
        {
            textOut.add(encrypt(textIn.get(i).intValue()));
        }
    }

    //public int[] getTextIn()
    //{
        //return textIn;
    //}

    public String toString()
    {
        String temp = "";
        for(int i=0; i<textOut.size(); i++)
        {
            temp+=(char)textOut.get(i).intValue();
        }
        return temp;
    }

    private int encrypt(int ch)
    {
        if(Character.isUpperCase(ch))
        {
            return (((ch-'A')+13)%26+'A');
        }

        if(Character.isLowerCase(ch))
        {
            return (((ch-'a')+13)%26+'a');
        }

        return ch;
    }
}