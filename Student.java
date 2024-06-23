import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
class Student
{
public static void main(String st[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Riya Shah \t 170410107108");
	try
	{
	 FileOutputStream fout=new FileOutputStream("StdFile.txt");
	
	String str1="\n Name = Riya \n Department = Computer \n Er No = 108 \n Class = TYCE2 \n";
	//System.out.println("Enter Student Information : ");
	//str1=sc.nextLine();

	//byte b[]=(str1+"\n").getBytes();
	byte b[]=str1.getBytes();
	fout.write(b);
	fout.close();

	FileInputStream fin=new FileInputStream("StdFile.txt");
	int i;
	
	while((i=fin.read())!=-1)
	{
	System.out.print((char)i);
	}
	fin.close();
	
	}
	catch(Exception e)
	{
	 System.out.println(e);
	}
}
}