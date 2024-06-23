import java.util.Scanner;
class Numeric
{
public static void sum(int x, int y)
{
	System.out.println(x + y);
}

public static void sub(int x, int y)
{
	System.out.println(x-y);
}

public static void mul(int x, int y)
{
	System.out.println(x*y);
}

public static void div(int x, int y)
{
	System.out.println(x/y);
}

public static void mod(int x, int y)
{
	System.out.println(x%y);
}

public static void main(String Args[])
{
	System.out.println("Vaidehi Vani\t\t170410107123");

	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of x:");
	int x=s1.nextInt();
	System.out.println("Enter the value of y:");
	int y=s1.nextInt();
	System.out.println("a. Addition");
	System.out.println("b. Subtraction");
	System.out.println("c. Multiplication");
	System.out.println("d. Division");
	System.out.println("e. Modulo");
	System.out.println("Select choice:");

	String s2=s1.next();
      	char ch=s2.charAt(0);
	switch(ch)
	{
		case 'a': 	sum(x, y);
		    		break;
		case 'b':	sub(x, y);
		     		break;
		case 'c':	mul(x, y);
		    		break;
		case 'd':	div(x, y);
		  		break;
		case 'e':	mod(x, y);
				break;
		default:
			System.out.println("Enter between 'a' and 'e'.");
			break;
	}			
}
}
