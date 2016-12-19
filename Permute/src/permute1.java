import java.io.*;
public class permute1
{
	public static int j=1;
	//File f=null;
	//BufferedWriter wr=null;
	PrintWriter pw=null;
	
    private void permutation(String prefix, String str) throws IOException
    {
    	//int j=1;.0
    	
    	int n = str.length();
        if (n == 0) 
        {
        	try
    		{
    		//f=new File("C:/Users/HARSHA VARDHANA/Permute/newfile.txt");
    		pw = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/HARSHA VARDHANA/Permute/finpermute.txt",true)));
    		
    		//wr=new BufferedWriter(new FileWriter(f));
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
        	System.out.print(j+" ");
            System.out.println(prefix);
            pw.print(j+" ");
            pw.println(prefix);
            pw.close();
            //wr.newLine();
            j++;
        }
        else {
            for (int i = 0; i < n; i++)
            	{
            	//System.out.println(i);
            	
                 permutation(prefix + str.charAt(i),str.substring(0, i) + str.substring(i+1));
                
            	}
        }
        
    }
    public static void main(String[] args) {
        permute1 p=new permute1();
    	try
    	{
        p.permutation("", "abcdefghij");
    	} 
    	catch(IOException e)
    	{
    		e.printStackTrace(); 
    	}
    }
}