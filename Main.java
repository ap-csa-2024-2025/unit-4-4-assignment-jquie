import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String str = "Peter Piper picked a pack of pickle peppers.";
    int count = 0;
    for (i = 0; i < str.length() - 1; i++)
    {
      String letter = str.substring(i, i+2);
      if (letter.equals("pa")||letter.equals("pe")||letter.equals("pi")||letter.equals("po")||letter.equals("pu"))
      {
        count++;
      }
    }
  System.out.println("I found p and a vowel " + count + "times.");


    String s = "Peter Piper picked a pack of pickle peppers.";    
    String s2 = "";
    final String badLetters = "etaio"; 
    for (i = 0; i < s.length(); i++)
    {
      String letter = s.substring(i, i+1);
     if (badLetters.indexOf(letter) == -1)
     {
      s2 += letter;
     }
    }
  }

  public static boolean isPrime(int N)
  {
    // TODO: Replace and write your code below
    return false;
  }
}
