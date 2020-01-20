//ROT13c.java           MrG             2019.0131
import java.util.ArrayList;
public class Rot13c
{
    private ArrayList<Integer> textIn;
    private ArrayList<Integer> textOut;

    /**
     * Constructor
     * @ param s: the text to encode
     * PostCondition: textIn is an ArrayList<Integer> based on ascii codes of each char in text
     * PostCondition: textOut is an ArrayList<Integer> based on encrypted ascii codes from textIn
     */
    public Rot13c(String s)
    {
        textIn = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++)
        {
            //textIn[i]=(int)(s.charAt(i));
            textIn.add((int)(s.charAt(i)));
        }

        textOut = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++)
        {
            textOut.add(encrypt(textIn.get(i)));
        }
    }

    /**
     * Accessor
     * preCondition: ROT13 object has been instantiated
     * @ return temp String representing inputted text (like toString())
     */
    public String getTextIn()
    {
        String temp = "";
        for(int i=0; i<textIn.size(); i++)
        {
            temp+=(char)textIn.get(i).intValue();
        }
        return temp;
    }

    /**
     * Accessor
     * preCondition: ROT13 object has been instantiated
     * @ return temp String representing encrypted text (like toString())
     */
    public String getTextOut()
    {
        String temp = "";
        for(int i=0; i<textOut.size(); i++)
        {
            temp+=(char)textOut.get(i).intValue();
        }
        return temp;
    }
/*
    //for debugging
    public ArrayList<Integer> getTextIn()
    {
        return textIn;
    }

    //for debugging
    public ArrayList<Integer> getTextOut()
    {
        return textOut;
    }
*/

    /**
     * Hybrid Method
     * @ param ch char to encrypt
     * @ return encrypted char
     */
    private int encrypt(int ch)
    {
        if(Character.isUpperCase(ch))
        {
            return (((ch-65)+13)%26+65);
        }
        else if(Character.isLowerCase(ch))
             {
                return (((ch-97)+13)%26+97);
             }
        return ch;
    }
}
