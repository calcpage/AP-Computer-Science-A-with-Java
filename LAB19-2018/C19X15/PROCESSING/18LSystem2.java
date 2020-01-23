//LSystem2.java      MrG       2019.0530
class LSystem2
{

  String sentence;     // The sentence (a String)
  Rule2[] ruleset;      // The ruleset (an array of Rule objects)
  int generation;      // Keeping track of the generation #

  // Construct an LSystem with a startin sentence and a ruleset
  LSystem2(String axiom, Rule2[] r)
  {
    sentence = axiom;
    ruleset = r;
    generation = 0;
  }

  // Generate the next generation
  void generate()
  {
    // An empty StringBuffer that we will fill
    String nextgen = "";
    // For every character in the sentence
    for (int i = 0; i < sentence.length(); i++)
    {
      // What is the character
      String s = sentence.substring(i,i+1);
      // We will replace it with itself unless it matches one of our rules
      String replace = "" + s;
      // Check every rule
      for (int j = 0; j < ruleset.length; j++)
      {
        String a = ruleset[j].getA();
        // if we match the Rule, get the replacement String out of the Rule
        if (a.equals(s))
        {
          replace = ruleset[j].getB();
          break;
        }
      }
      // Append replacement String
      nextgen+=replace;
    }
    // Replace sentence
    sentence = nextgen;
    // Increment generation
    generation++;
  }

  String getSentence()
  {
    return sentence;
  }

  int getGeneration()
  {
    return generation;
  }
}