import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
     int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
      if( n1 > n2 && n1 > n3)
      {
        System.out.print( n1 );
      }
      else if( n2 > n1 && n2 > n3 )
      {
        System.out.print( n2 );
      }
      else
        System.out.print( n3 );// Type your code here
    }
}