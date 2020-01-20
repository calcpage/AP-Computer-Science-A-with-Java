//RPS.java      MrG     2018.1115
public class RPS
{
    private String person;
    private String computer;
    private static int personWins = 0;
    private static int numRounds = 0;

    public RPS(String person, String computer)
    {
        this.person=person;
        this.computer=computer;
        numRounds++;
    }

    public String getPerson()
    {
        return person;
    }

    public String getComputer()
    {
        return computer;
    }

    public String toString()
    {
        String temp="";

        if(person.equals(computer))
        {
            temp = "It's A Tie!";
        }
        if(person.equals("r") && computer.equals("p"))
        {
            temp = "Computer Wins!";
        }
        if(person.equals("r") && computer.equals("s"))
        {
            temp = "Person Wins!";
            personWins++;
        }
        if(person.equals("p") && computer.equals("r"))
        {
            temp = "Person Wins!";
            personWins++;
        }
        if(person.equals("p") && computer.equals("s"))
        {
            temp = "Computer Wins!";
        }
        if(person.equals("s") && computer.equals("r"))
        {
            temp = "Computer Wins!";
        }
        if(person.equals("s") && computer.equals("p"))
        {
            temp = "Person Wins!";
            personWins++;
        }

        return temp;
    }

    public double getPercent()
    {
        return (double)personWins/numRounds*100;
    }
}