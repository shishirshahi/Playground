import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
      int marks = sc.nextInt();
      if(marks >= 85)
      {
        System.out.print("A");
      }
        else if(marks >= 75)
        {
           System.out.print("B");
        }
        else if(marks >= 65)
        {
          System.out.print("C");
        }
        else if(marks >= 55)
        {
          System.out.println("D");
        }
        else if(marks >= 45)
        {
          System.out.println("E");
        }
        else
           System.out.println("Fail");	// Type your code here
    }
}