import java.util.Scanner;
public class Palindrom
{
public static void main(String Args[])
{
	System.out.println("\n Riya Shah \t 170410107108");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s1=scan.next();
	StringBuffer s2=new StringBuffer(s1);
	s2.reverse();
	if(s1.equals(s2.toString()))
	{
		System.out.println("String is a palindrome.");
	}
	else
	{
		System.out.println("String is not a palindrome");
	}
}
}
