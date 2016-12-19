import java.io.*;

public class permute3 
{
	PrintWriter pw=null; 
	public permute3()
	{
		try
		{
		//f=new File("C:/Users/HARSHA VARDHANA/Permute/newfile.txt");
		pw = new PrintWriter("C:/Users/HARSHA VARDHANA/Permute/finpermute.txt");
		//wr=new BufferedWriter(new FileWriter(f));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void permute( String input)
	{
	  int inputLength = input.length();
	  boolean[ ] used = new boolean[ inputLength ];
	  StringBuffer outputString = new StringBuffer();
	  char[ ] in = input.toCharArray( );
	  
	  doPermute ( in, outputString, used, inputLength, 0 );

	}

	  void doPermute ( char[ ] in, StringBuffer outputString, 
	                    boolean[ ] used, int inputLength, int level)
	  {
	     if( level == inputLength) {
	     System.out.println ( outputString.toString()); 
	     
	     return;
	     }

	    for( int i = 0; i < inputLength; ++i )
	    {       

	       if( used[i] ) continue;

	       outputString.append( in[i] );      
	       used[i] = true;       
	       doPermute( in,   outputString, used, inputLength, level + 1 );       
	       used[i] = false;       
	         outputString.setLength(outputString.length() - 1 );   
	    }
	 }


public static void main(String[] args)
{
	permute3 p= new permute3();
	p.permute("1234567890");
}

            

}

