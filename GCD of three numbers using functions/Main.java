import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
       int n2 = in.nextInt();  
       System.out.println(gcd_of_two_numbers(n1,n2));
    }
  public static int gcd_of_two_numbers(int n1,int n2)
  {
    int min_element, gcd = 1;
    if(n1 < n2)
    {
      min_element = n1;
    }
    else
    {
      min_element = n2;
    }
    while( min_element >= 1)
    {
      if((n1 % min_element == 0) && (n2 % min_element == 0))
      {
        gcd = min_element;
        break;
      }
      min_element--;
    }
    return gcd;
  }
}// Type your code here