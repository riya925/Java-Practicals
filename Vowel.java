import java.util.Scanner;
public class Vowel
{
	public static void main(String [] st)
	{
		int a=0,e=0,i=0,o=0,u=0,j;
		int ta=0,te=0,ti=0,to=0,tu=0;
		String s1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Riya Shah \t 170410107108");
		while(true)
		{
			a=0;e=0;i=0;o=0;u=0;
			System.out.println("\nENTER STRING : ");
			s1=sc.nextLine();
			if(s1.equals("quit"))
			{
				break;
			}
			else
			{
				for(j=0;j<s1.length();j++)
				{
					if(s1.charAt(j)=='a'){
					a++; ta++; }
					else if(s1.charAt(j)=='i'){
				i++;ti++;}
					else if(s1.charAt(j)=='e'){
					e++; te++;}
					else if(s1.charAt(j)=='o'){
					o++; to++;}
					else if(s1.charAt(j)=='u'){
					u++; tu++;}
				}
				System.out.println("A VOWEL = "+a);
				System.out.println("E VOWEL = "+e);
				System.out.println("I VOWEL = "+i);
				System.out.println("O VOWEL = "+o);
				System.out.println("U VOWEL = "+u);
			}
		}
		System.out.println("TOTAL A VOWEL = "+ta);
		System.out.println("TOTAL E VOWEL = "+te);
		System.out.println("TOTAL I VOWEL = "+ti);
		System.out.println("TOTAL O VOWEL = "+to);
		System.out.println("TOTAL U VOWEL = "+tu);
	}
}