import java.io.*; 
import java.util.HashSet; 
public class Duplicate
{ 
    public static void main(String[] args) throws IOException  
    { 
        PrintWriter pw = new PrintWriter("riyaout.txt"); 
        BufferedReader br = new BufferedReader(new FileReader("riyain.txt")); 
        String line = br.readLine(); 
        HashSet<String> hs = new HashSet<String>(); 
           
        while(line != null) 
        { 
            if(hs.add(line)) 
                pw.println(line); 
              
            line = br.readLine();     
        } 
        pw.flush();  
        br.close(); 
        pw.close(); 
        System.out.println("\n Riya Shah \t 170410107108");
        System.out.println("File operation performed successfully"); 
    } 
}