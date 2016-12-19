import java.util.*;
public class Morse 
{
	Scanner in=new Scanner(System.in);
	String[] strarr;
	public void compute()
	{
		ArrayList<Character> alp=new ArrayList<Character>();
		//ArrayList<Integer> ch2=new ArrayList<Integer>();
		for(int i=97;i<123;i++)
		{
			char c=(char)i;
			alp.add(c);
		}
		//System.out.println(alp);
		System.out.println("Enter a sentence");
		String str=in.nextLine();
		strarr=str.split("");
		//for(int i=0;i<strarr.length;i++)
		//{
			//System.out.print(strarr[i]);
	    //}
		
	}
	public int uniq1()
	{
		double d=pairfns.pair2((int)strarr[0].charAt(0),(int)strarr[1].charAt(0));
		System.out.println((int)strarr[0].charAt(0));
		System.out.println((int)strarr[1].charAt(0));
		System.out.println(d);
		int d1=(int) d;
		return d1;
	}
	
	public static void main(String[] args)
	{
		Morse m=new Morse();
		m.compute();
		m.uniq1();
		
		
	}
}
	
