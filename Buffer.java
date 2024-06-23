import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.*;

public class Buffer
{
public static void main(String args[]) throws Exception
{
	FileWriter fw=new FileWriter("XYZ.txt");
	FileReader fr=new FileReader("XYZ.txt");

	BufferedWriter bw=new BufferedWriter(fw);
	BufferedReader br=new BufferedReader(fr);
	System.out.println("\n Riya Shah \t 170410107108");
	String s1="\nStudent name : Riya \nStudent ErNo : 170410107108 \nStudent Class : TYCE-2";
	
	for(int i=0;i<s1.length();i++)
	{
	char ch=s1.charAt(i);
	if(ch>=97 && ch<=122)
	{
	bw.write(ch-32);
	}
	else
	{
	bw.write(ch);
	}
	}
	bw.close();

	String s2=br.readLine();
	//System.out.println(s2);
	while (s2 != null)
	{
		System.out.println(s2);
		s2=br.readLine();
	}
}
}
