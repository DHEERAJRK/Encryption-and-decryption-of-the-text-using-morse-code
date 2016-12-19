import java.util.*;
public class sen 
{
	
	static double uniqno()
	{
		ArrayList<Integer> al1= new ArrayList<Integer>();
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sn.nextLine();
		char[] chrarr = str.toCharArray();
		for(int i=0; i<chrarr.length;i++)
		{
			al1.add((int)chrarr[i]);
		}
		System.out.println(al1);
		int k=0; double j=0;
		for(int r=0; r<chrarr.length-1;r++)
		{
			if(k==0)
			{
				j=(int) pairfns.Cantor(al1.get(k),al1.get(k+1));
			  	k++;
			  	System.out.println(j);
			}
			else
			{
				j=pairfns.Cantor(al1.get(k),(int)j);
				System.out.println(k);
				//System.out.println(j);	
				
				k++;
			}
		}
		return j;
	}
	
	public static void main(String[] args)
	{
		System.out.println(sen.uniqno());
	}

}
