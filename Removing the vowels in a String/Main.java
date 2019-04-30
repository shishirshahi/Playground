import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   String str,r;
    Scanner scan = new Scanner(System.in);
    str = scan.nextLine();
    r = removevowels(str);
    System.out.print(r);
  }
  public static String removevowels(String s)
  {
    String finalString = "";
    int i;
    for(i = 0; i < s.length(); i++)
    {
      if(! isvowel(Character.toLowerCase(s.charAt(i))))
      {
        finalString = finalString + s.charAt(i);
      }
    }
    return finalString;
  }
  public static boolean isvowel(char c)
  {
    String vowels = "aeiou";
    int i;
    for(i = 0; i < 5 ; i++)
    {
      if( c == vowels.charAt(i))
      {
        return true;
      }
    }
    return false;
  }
}//type your code here