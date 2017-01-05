import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class encode 
{
	static double d=0;
	public static String alphno(char[] chrarr)
	{
		String s=null;
		
		double fromsen2= sen2.uniqno1(chrarr);
		System.out.println(fromsen2);
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/HARSHA VARDHANA/Permute/finpermute.txt"));
			for(int i=0;i<fromsen2;i++)
			{
			s=br.readLine();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception catched!");
		}
		//System.out.println(s);
		String[] strarr=s.split(" ");
		String fin=strarr[1];
		return fin;
	}
	
	public static ArrayList<Integer> numcomb(String s, ArrayList<ArrayList<String>> al)
	{
		ArrayList<Integer> alint= new ArrayList<Integer>();
		for(int i=0; i<s.length();i++)
		{
			int in=(int)s.charAt(i)-(int)'a' ;
			//System.out.println(in);
			ArrayList<String> alst= new ArrayList<String>();
			alst= al.get(in);
			//System.out.println(alst);
			//System.out.println(alst.size());
			
			for(int j=0; j<alst.size();j++)
			{
				alint.add(Integer.parseInt(alst.get(j).trim()));
			}
		}
		//System.out.println(alint.size());
		return alint;
	}
	
	public static ArrayList<String> morsecomb(ArrayList<Integer> alst,String s,ArrayList<ArrayList<String>> alalmorse)
	{
		ArrayList<String> alstr= new ArrayList<String>();
		ArrayList<Integer> atr= new ArrayList<Integer>();
		for(int i=0; i<s.length();i++)
		 	{
			atr.add(alst.get((int)s.charAt(i)-(int)'a'));
			
		 	}
		System.out.println(atr);
		int k=0;
		double b=0; 
		for(int a=0; a<atr.size();a++)
		{
			b=pairfns.Cantor(atr.get(atr.size()-1),atr.get(atr.size()-1-k));
			d=d+b;
			k++;
		}
		String string = null;
		//System.out.println(d); Imp
		try
		{
		    string=null;
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/HARSHA VARDHANA/Permute/finpermute.txt"));
			for(int i=0;i<d;i++)
			{
			string=br.readLine();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception catched!");
		}
		
		String[] strarr2=string.split(" ");
		String fin2=strarr2[1];
		System.out.println(fin2);
		
		//System.out.println(alalmorse);
		ArrayList<String> alint2= new ArrayList<>();
		for(int i=0; i<fin2.length();i++)
		{
			int in=(int)fin2.charAt(i)-(int)'a' ;
			//System.out.println(in);
			ArrayList<String> alst2= new ArrayList<String>();
			alst2= alalmorse.get(in);
			//System.out.println(alst);
			//System.out.println(alst.size());
			
			for(int j=0; j<alst2.size();j++)
			{
				alint2.add(alst2.get(j).trim());
			}
		}
		
		System.out.println(alint2);
		
		return alint2;
		
		
		
	}
	
	public static ArrayList<String> finalcomb(String entered,ArrayList<String> frommorsecomb)
	{
		ArrayList<String> finstr = new ArrayList<String>();
		for(int c=0; c<entered.length();c++)
		{
			finstr.add(frommorsecomb.get((int)entered.charAt(c)-(int)'a'));
		}
		return finstr;
		
	}
	
	public static String numbermorse(char a)
	{
		switch (a)
		{
		case '1':
			return ".----";
			//break;		
		
		case '2':
			return "..---";
			//break;
			
		case '3':
			return "...--";
			//break;
			
		case '4':
			return "....-";
			//break;
			
		case '5':
			return ".....";
			//break;
			
		case '6':
			return "-....";
			//break;		
					
		case '7':
			return "--...";
			//break;
					
		case '8':
			return "---..";
			//break;		
		
		case '9':
			return "----.";
			//break;
			
		case '0':
			return "-----";
			//break;		
			default :
				return " ";
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String str=sn.nextLine();
		String str2= str.replaceAll("\\s+","");
		
		char chrarr[]=str.toCharArray();
		//System.out.println(str2.charAt(2));
		String strr=encode.alphno(chrarr);
		System.out.println(strr);
		ArrayList<ArrayList<String>> alol=new ArrayList<ArrayList<String>>();
				alol=fromfile.ascii();
				//System.out.println(alol);
		ArrayList<Integer> intal=new ArrayList<Integer>();		
		intal=encode.numcomb(strr,alol);
		System.out.println(intal);
		
		ArrayList<ArrayList<String>> alol2=new ArrayList<ArrayList<String>>();
		alol2=fromfile.morse();
		ArrayList<String> morsecombin = new ArrayList<String>();
		morsecombin = encode.morsecomb(intal, strr,alol2);
		ArrayList<String> finalstral = new ArrayList<String>();
		 finalstral = encode.finalcomb(str2,morsecombin); 
		 //System.out.println(d);
		 int di=(int) d;
		 String comb= String.valueOf(di);
		 System.out.println(comb);
		 ArrayList<String> frmnomorse = new ArrayList<String>();
		 for(int q=0; q<comb.length(); q++)
		 {
			frmnomorse.add(encode.numbermorse(comb.charAt(q)));
		 }
		 System.out.println(frmnomorse); 
		 System.out.println(finalstral); 
		 ArrayList<String> finalstral2 = new ArrayList<String>();
		 finalstral2.addAll(frmnomorse);
		 finalstral2.addAll(finalstral);
		
		 System.out.println("Final encoded morse code is "+ finalstral2);
		 
		 PrintWriter pw=null;
		 try
 		{
 		
 		pw = new PrintWriter(new BufferedWriter(new FileWriter("Q:/Eclipse Workspace/Enigma/finalstral2.txt",true)));
 		pw.println(finalstral2);
 		pw.close();
 		
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 		}
		 try
	 		{
	 		
	 		pw = new PrintWriter(new BufferedWriter(new FileWriter("Q:/Eclipse Workspace/Enigma/morsecombin.txt",true)));
	 		pw.println(morsecombin);
	 		pw.close();
	 		
	 		}
	 		catch(Exception e)
	 		{
	 			e.printStackTrace();
	 		}
		// node head= tree4.nodecreation();
		 //tree4.checkalpha(finalstral, head);
	}

}
