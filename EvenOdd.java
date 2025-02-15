import java.util.Scanner;
public class EvenOdd{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter an Integer number:");//Input from user
int num=input.nextInt();
if(num%2==0){

    System.out.println("Even Number");
}
else
{
 
    System.out.println("Odd Number");
}
input.close();//closing scanner
}
}