import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int first=(n1/100);
      int third=(n1%10);
      int sum=first+third;
      System.out.println(sum);// Type your code here
	}
}