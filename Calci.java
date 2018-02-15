import java.lang.System;
import java.util.Scanner;

public class Calc{
public static void main(String[] args)
{
int a,b,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers on which the operations are to be performed ");
a=s.nextInt();
b=s.nextInt();
float result;
System.out.print("Enter\n 1.Addition \n2.Substration \n3.Multiplication \n4.Division \n5.Modulo operation\n");
n=s.nextInt();
switch(n)
{
	case 1:System.out.println("The result of addition is"+(a+b));
	       break;
	case 2:result=(a-b);
	       System.out.println("sub of 2 num is:"+result);
	       break;
	case 3:System.out.println("The result of multiplication is"+(a*b));
	       break;
	case 4:result=(a/b);
	       System.out.println("div of 2num is:"+result);
	       break;
	case 5:System.out.println("The result of modulo operation is"+(a%b));
	       break;
	default:System.out.println("Enter a valid operation");
}
sc.close();
}

}