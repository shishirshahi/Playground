import java.util.Scanner;//import required packages
class Faculty
{
  public void salary(int baseSalary)
  {
   System.out.println("Base Salary: "+baseSalary); //write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
   System.out.println("CSE Faculty: " + (baseSalary + 3000)); //write your CSE class statements
  }
}
class IT extends CSE
{
  public void salary(int baseSalary)
  {
 System.out.println("IT Faculty: " + (baseSalary + 5000));   //write your IT class statements
  }
}
class ECE extends IT
{
  public void salary(int baseSalary)
  {
  System.out.println("ECE Faculty: " + (baseSalary + 4500));  //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int baseSalary = sc.nextInt();
    if(baseSalary > 0)
    {
    Faculty obj1 = new Faculty();
    obj1.salary(baseSalary);
       CSE obj2 = new CSE();
    obj2.salary(baseSalary);
       IT obj3 = new IT();
    obj3.salary(baseSalary);
     ECE obj4 = new ECE();
    obj4.salary(baseSalary);
    }
    else
    {
      System.out.println("null");
    }//implement your required concept here
  }
}