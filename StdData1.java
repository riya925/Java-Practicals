import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
class StdData1
{
	public static void main(String st[])
	{
	System.out.println("\n Riya Shah \t 170410107108");
	try
	{
		FileInputStream fin=new FileInputStream("StdFile.txt");
		DataInputStream din=new DataInputStream(fin);
		FileOutputStream fout=new FileOutputStream("DataFile1.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		String s1;
		s1="\n\nStudent Name-ABC \nEnrollment Number=123 \nClass-TYCE2";
		while((s1=din.readLine())!=null)
		{
			byte b[]=s1.getBytes();
			dout.write(b);
		}
		dout.close();
		din.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}