//LSystemTester.java        MrG         2019.0530
public class LSystemTester
{
  public static void main(String[] args)
  {
    Rule2[] ruleset = new Rule2[2];
    ruleset[0] = new Rule2("A","ABA");
    ruleset[1] = new Rule2("B","BBB");
    LSystem2 lsys = new LSystem2("A", ruleset);

    //Rule2[] ruleset = new Rule2[1];
    //ruleset[0] = new Rule2("F","FF-F++F-F");
    //LSystem2 lsys = new LSystem2("F", ruleset);

    System.out.println("generation = " + lsys.getGeneration());
    System.out.println("sentence = " + lsys.getSentence());

    for(int gen = 1; gen <= Integer.parseInt(args[0]); gen++)
    {
      lsys.generate();
      System.out.println("generation = " + lsys.getGeneration());
      System.out.println("sentence = " + lsys.getSentence());
    }
  }
}
