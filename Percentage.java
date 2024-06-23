public class Percentage
{
public static void main(String [] st)
{
	int i;
	int a[] = new int[st.length];
	float per,total=0;
	for(i=0;i<st.length;i++)
	{
		a[i]=Integer.parseInt(st[i]);
		total+=a[i];
	}
	per=total/6;
	System.out.println("\n Riya shah  \t 170410107108");
	System.out.println("\nMarks of 6 Subjects : ");
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
	System.out.println("\nTotal Marks = "+total);
	System.out.println("Percentage = "+per+"%");	
}
}
