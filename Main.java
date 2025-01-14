import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
   // Problem 1 
    String str = "Peter Piper picked a pack of pickle peppers.";
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++)
    {
      String letter = str.substring(i, i+2);
      if (letter.equals("pa")||letter.equals("pe")||letter.equals("pi")||letter.equals("po")||letter.equals("pu"))
      {
        count++;
      }
    }
  System.out.println("I found p and a vowel " + count + "times.");

// Problem 2
    Scanner sc = new Scanner(System.in);
String input;
String other = "";

System.out.println("Input String:");
input = sc.nextLine();

for (int i = 0; i < input.length(); i++)
{
  String ch = input.substring(i, i+1);
  if (! (ch.equals("e") || ch.equals("t") || ch.equals("a") || ch.equals("i") || ch.equals("o")) )
  {
    other += ch;
  }
}
System.out.println(other);

  //Problem 3
  Scanner user = new Scanner(System.in);
  System.out.println("Enter two strings:");
  String ans1 = user.nextLine();
  String ans2 = user.nextLine();
  String output = "";
  if (ans1.length() == ans2.length())
  {
    for (int i = ans1.length()-1; i >= 0; i--)
    {
      output += ans2.substring(i, i+1) + ans1.substring(i, i+1);
    }
  }
  else
  {
    System.out.println("error");
  } 
  System.out.println(output); 
  }
}
