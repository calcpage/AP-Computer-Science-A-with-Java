//Purse.java    MrG     2018.0213
import java.util.ArrayList;
public class Purse
{
    private ArrayList<String> coins;

    public Purse()
    {
        coins = new ArrayList<String>();
    }

    public void addCoin(String name)
    {
        coins.add(name);
    }

    public String toString()
    {
        if(coins.size()==0)
        {
            return "Purse[]";
        }

        String temp = "Purse[";
        for(String coin:coins)
        {
            temp+=coin+", ";
        }
        return temp.substring(0,temp.length()-2)+"]";
    }
/*
    public String toString()
    {
        String temp = "Purse[";
        for(int i = 0; i<coins.size(); i++)
        {
            temp+=coins.get(i)+", ";
        }
        return temp.substring(0,temp.length()-2)+"]";
    }
*/

    //public void reverse()
    //{
        //???
    //}

    public void transfer(Purse other)
    {
        for(int i=0; i<other.getCoins().size(); i++)
        {
            addCoin(other.getCoins().remove(0));
        }
        //other.getCoins().clear();
    }

    public ArrayList<String> getCoins()
    {
        return coins;
    }

    public boolean sameCoins(Purse other)
    {
        if(coins.size()!=other.getCoins().size())
        {
            return false;
        }

        int Q1=0,D1=0,N1=0,P1=0;
        for(String coin:coins)
        {
            if(coin.equals("Quarter")){Q1++;}
            if(coin.equals("Dime")){D1++;}
            if(coin.equals("Nickel")){N1++;}
            if(coin.equals("Penny")){P1++;}
        }

        int Q2=0,D2=0,N2=0,P2=0;
        for(int i=0; i<coins.size(); i++)
        {
            if(other.coins.get(i).equals("Quarter")){Q2++;}
            if(other.coins.get(i).equals("Dime")){D2++;}
            if(other.coins.get(i).equals("Nickel")){N2++;}
            if(other.coins.get(i).equals("Penny")){P2++;}
        }

        return Q1==Q2&&D1==D2&&N1==N2&&P1==P2;
    }
}












