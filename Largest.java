import java.util.Scanner;
public class Largest{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int num1,num2,num3;
//Input Three number from user
System.out.println("Enter First Positive Number");
num1=input.nextInt();
System.out.println("Enter Second Positive Number");
num2=input.nextInt();
System.out.println("Enter Third Positive Number");
num3=input.nextInt();
if(num1>num2&&num1>num3){
    System.out.println("Largest Number="+num1);
}
else if(num2>num1&&num2>num3){
    System.out.println("Largest Number="+num2);
}
else{
    System.out.println("Largest Number="+num3);
}
input.close();//closing Scanner
}

}