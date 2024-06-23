import java.util.Scanner;
public class Count2
{
public static void main(String Args[])
{
	System.out.println("\n Riya Shah \t 170410107108");
	int word=0;
	Scanner s1=new Scanner(System.in);
	System.out.println("\nEnter the string:");
	String s=s1.nextLine();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='A' && ch<='Z')
		{
			word++;
		}
		
	}
	System.out.println("\nNo. of Words starts with capital ="+word);
}
}
