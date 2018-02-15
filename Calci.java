import java.lang.System;
import java.util.Scanner;

public class Calc{
public static void main(String[] args)
{
int a,b,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter\n 1.Addition \n2.Substration \n3.Multiplication \n4.Division \n5.Modulo operation\n");
n=s.nextInt();
switch(n)
{
	case 1:System.out.println("The result of addition is"+(a+b));
	       break;
	case 3:System.out.println("The result of multiplication is"+(a*b));
	       break;
	case 5:System.out.println("The result of modulo operation is"+(a%b));
	       break;
	default:System.out.println("Enter a valid operation");
}
sc.close();
}

