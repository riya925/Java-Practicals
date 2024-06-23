import java.util.*;
public class capital
{
	public static void main(String[] st)
	{
		Scanner in=new Scanner(System.in);
		String s=new String();
		System.out.println("\n Riya Shah \t 170410107108");
		System.out.print("\n Enter a line: ");
 		s=in.nextLine();
		System.out.print("\n");
		char c;
		int cx=0;
		for(int i=0;i<s.length();i++)
		{
		c=s.charAt(i);
 		if(Character.isUpperCase(c)&&(i==0||Character.isWhitespace(s.charAt(i-1))))
			{
				cx++;
			}
		}
		System.out.println("total  number of words start with capital letters are :"+cx);
	}
  }