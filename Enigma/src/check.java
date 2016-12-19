import java.util.ArrayList;

public class check 
{
	
	public static void chkpair2()
{
		ArrayList<String> al=new ArrayList<> ();
	//int k=0; 
	for(int i=(int)'a';i<=(int)'z';i++)
	{
		for(int j=(int)'a';j<=(int)'z';j++)
		{
			for(int k=(int)'a';k<=(int)'z';k++)
			{
			//System.out.println((int)'a');
			String a= Character.toString((char)i);
			String b= Character.toString((char)j);
			String c= Character.toString((char)k);
			
			//System.out.print(a);
			//System.out.print(b);
			//System.out.println();
			//String st=a+b;
			al.add(a+b+c);
			}
    	}
		
	}
	System.out.print(al);
	
	//for(int i=0; i<al.size();i++)
	//{
		//System.out.println(pairfns.Cantor((int)al.get(k).charAt(0),(int)al.get(k).charAt(1)));
		//k++;
	//}
	//System.out.print(k);
}

 
public static void main(String[] args)
{
    check.chkpair2();  	
}
}