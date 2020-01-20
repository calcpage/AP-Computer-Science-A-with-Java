//RPS.java  MrG 2018.0124
public class RPS
{
    private String person;
    private String computer;
    public static int numRounds=0;
    public static int personWins=0;

    /**
     * Constructor
     * @param person "r" or "p" or "s"
     * @param computer "r" or "p" or "s"
     * postCondition: 1 round of the game is instantiated
     */
    public RPS(String person, String computer)
    {
        this.person = person;
        this.computer = computer;
        numRounds++;
    }

    /**
     * Accessor
     * preCondition: person is "r" or "p" or "s"
     * @return "r" or "p" or "s"
     */
    public String getPerson()
    {
        return person;
    }

    /**
     * Accessor
     * preCondition: computer is "r" or "p" or "s"
     * @return "r" or "p" or "s"
     */
    public String getComputer()
    {
        return computer;
    }

    /**
     * Accessor
     * preCondition: this round is instantiated
     * @return how many rounds have been played
     */
    public int getNumRounds()
    {
        return numRounds;
    }

    /**
     * Accessor
     * preCondition: this round is instantiated
     * @return how many times person beat computer
     */
    public int getPersonWins()
    {
        return personWins;
    }

    /**
     * Accessor
     * preCondition: person is "r" or "p" or "s"
     * preCondition: computer is "r" or "p" or "s"
     * @return "It's a Tie!" or "Person Wins!!" or "Computer Wins!!!"
     */
    public String toString()
    {
        String temp = "";
        if(person.equals(computer))
        {
            temp = "It's a Tie!";
        }

        if(person.equals("r")&&computer.equals("s"))
        {
            temp = "Person Wins!!";
            personWins++;
        }
        if(person.equals("r")&&computer.equals("p"))
        {
            temp = "Computer Wins!!!";
        }

        if(person.equals("p")&&computer.equals("r"))
        {
            temp = "Person Wins!!";
            personWins++;
        }
        if(person.equals("p")&&computer.equals("s"))
        {
            temp = "Computer Wins!!!";
        }

        if(person.equals("s")&&computer.equals("p"))
        {
            temp = "Person Wins!!";
            personWins++;
        }
        if(person.equals("s")&&computer.equals("r"))
        {
            temp = "Computer Wins!!!";
        }

        return temp;
    }
}