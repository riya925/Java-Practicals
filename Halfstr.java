import java.util.Scanner;
class HalfStr
{
public static void main(String Args[])
{
	System.out.println("\n Riya Shah \t 170410107108");
	Scanner s1=new Scanner(System.in);
	System.out.println("\nEnter the string:");
	String s=s1.nextLine();
	for(int i=s.length()/2;i<s.length();i++)
	{
		char ch=s.charAt(i);
		System.out.print(ch);
	}
	System.out.println();
}
}
