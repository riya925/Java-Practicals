import java.io.*;
class Seven 
{
public static void main(String[] args) 
{
String name = "Riya";
System.out.println("\n Riya Shah \t 170410107108");
try 
{
	FileOutputStream f1 = new FileOutputStream("file.txt");
	DataOutputStream d1 = new DataOutputStream(f1);
	d1.writeUTF(name);
	d1.close();
	FileInputStream fi1 = new FileInputStream("file.txt");
	DataInputStream di1 = new DataInputStream(fi1);
	String name1 = di1.readUTF();
	System.out.println("\nName: " + name1);
}
catch (Exception e) 
{
	System.out.println(e);
}
}}