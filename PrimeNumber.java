import java.util.Scanner;
public class PrimeNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int num,count=0;
System.out.println("Enter any positive number");//Input from user
num=input.nextInt();
for(int i=1;i<=num;i++){
if(num%i==0)
{
    count++;
}
}
if(count==2)
{
    System.out.println("Prime number");

}
else{
    System.out.println("Not prime number");
}
input.close();
}

}