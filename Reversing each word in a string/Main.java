import java.util.Scanner;
class Main
{
  public static void reverseword(String str)
  {
    String[]words =str.split(" ");
    String reversedstring = "" ;
    for(int i=0; i < words.length ; i++)
    {
      String word =words[i];
      String reverseword = "" ;
      for(int j=word.length() - 1; j >= 0; j--)
      {
        reverseword = reverseword+word.charAt(j);
      }
      reversedstring =reversedstring+reverseword + " ";
    }
    System.out.println(reversedstring);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    reverseword(str);//your code here;
  }
}