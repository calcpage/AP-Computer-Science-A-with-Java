import javax.swing.JOptionPane;

public class Hello3
{
    public static void main(String[] args)
    {
        String myName = JOptionPane.showInputDialog("name? ");
        System.out.print("How about a nice game of chess, ");
        System.out.println(myName + "?");
        System.exit(0);
    }
}