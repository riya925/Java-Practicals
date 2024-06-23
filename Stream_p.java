import java.util.Scanner;
public class Stream_p
{
	public static void main(String [] args)
	{
		int i,j,k;
		String s1="";
		Scanner s=new Scanner(System.in);
		System.out.println("\n Riya Shah \t 170410107108");
		System.out.print("\nENTER ONE STRING : ");
		s1=s.next();
		for(i=0;i<s1.length();i++)
		{
			for(k=s1.length();k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(""+s1.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}