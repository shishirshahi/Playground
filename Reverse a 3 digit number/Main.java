import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int first=n1/100;
    int sec=(n1/10)%10;
    int third=(n1%10);
    int n2=(third*100)+(sec*10)+(first*1);
    System.out.println(n2);
    //Type your code here
  }
}