import java.util.Scanner;
public class Add
{
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);//scanner object for taking input from the user
      int num1;//declare first integer variable
      System.out.println("Enter the first number:");//taking first integer variable value from user
      num1=input.nextInt();// read and store first integer variable value 
      int num2;//declare second integer variable
      System.out.println("Enter the second number:"); //taking second integer variable from user
      num2=input.nextInt();//read and store second integer variable value
     int sum= num1+num2;//declare third integer variable then add first two integer varible value and store it third. 

      System.out.println("The sum of two numbers="+sum);//print the sum value

     input.close();//close scanner

    }
}