//Write a program to check whether the input number is prime or not
// package used for input format.
import java.util.Scanner;



class PrimeNo{


// Main function 
      public static void main(String arg[])
      {

          System.out.println("Enter the number to check prime");

      //Input method by the Scanner Class

        Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
int i ;

//for loop method:-
for( i =2;i<no;i++)
{
if(no%i==0)
{

// Break keyword which is used toh break the statement.
break;
}
}
if(i==no)
{
System.out.println("Number is Prime");
}
else
{
System.out.println("Number is not Prime");
}
}
}
