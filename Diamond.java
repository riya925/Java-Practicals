import java.util.Scanner;
class Diamond
{
public static void main(String args[])
{
	System.out.println("\n Riya Shah \t 170410107108");
	int i,j,k,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=n-i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(i=n-1;i>=1;i--)
	{
		for(j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}