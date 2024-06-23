import java.util.Scanner;
public class Count
{
public static void main(String Args[])
{
	System.out.println("\n Riya Shah  \t 170410107108");
	int vowel=0, cons=0;
	Scanner s1=new Scanner(System.in);
	System.out.println("\nEnter the string:");
	String s=s1.nextLine();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			vowel++;
		}
		else if(ch==' ')
		{	}
		else
		{
			cons++;
		}
	}
	System.out.println("\nNo. of Vowels="+vowel);
	System.out.println("No. of Consonants="+cons);
}
}
