
import java.util.*;
import java.util.Scanner;

public class sen2 
{
	
	static ArrayList<Integer> al1=new ArrayList<>();
	
	public static double uniqno1(char[] chrarr)
	{
		
		
		for(int i=0; i<chrarr.length;i++)
		{
			al1.add((int)chrarr[i]);
		}
		//System.out.println(al1);
		int k=0;double l=0; double j=0;
		for(int r=0; r<=chrarr.length-1;r++)
		{
			
				j=(int) pairfns.Cantor(al1.get(0),al1.get(k)) ;
				//System.out.println(k);
				//System.out.println();
				//System.out.println(j);
				l=l+j;
				//System.out.println(l);
			  	k++;
			  	//System.out.println(j);
			
		}
		return l;
		
	}
	
	
		
		
		
    
	
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		String str=sn.nextLine();
		char chrarr[]=str.toCharArray();
		
		
		
	}
}