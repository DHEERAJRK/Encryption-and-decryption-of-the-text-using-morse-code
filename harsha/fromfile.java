import java.util.*;
import java.io.*;
public class fromfile 
{
	static ArrayList<String> a=new ArrayList<String>();
	static ArrayList<String> b=new ArrayList<String>();
	static ArrayList<String> c=new ArrayList<String>();
	static ArrayList<String> d=new ArrayList<String>();
	static ArrayList<String> e=new ArrayList<String>();
	static ArrayList<String> f=new ArrayList<String>();
	static ArrayList<String> g=new ArrayList<String>();
	static ArrayList<String> h=new ArrayList<String>();
	static ArrayList<String> i=new ArrayList<String>();
	static ArrayList<String> j=new ArrayList<String>();
	
	static ArrayList<String> a2=new ArrayList<String>();
	static ArrayList<String> b2=new ArrayList<String>();
	static ArrayList<String> c2=new ArrayList<String>();
	static ArrayList<String> d2=new ArrayList<String>();
	static ArrayList<String> e2=new ArrayList<String>();
	static ArrayList<String> f2=new ArrayList<String>();
	static ArrayList<String> g2=new ArrayList<String>();
	static ArrayList<String> h2=new ArrayList<String>();
	static ArrayList<String> i2=new ArrayList<String>();
	static ArrayList<String> j2=new ArrayList<String>();
	static ArrayList<ArrayList<String>> al=new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> al2=new ArrayList<ArrayList<String>>();

public static ArrayList<ArrayList<String>> ascii()
{
	
	try
	{
	BufferedReader br = new BufferedReader(new FileReader("C:/Users/HARSHA VARDHANA/Permute/ascii.txt"));
	
		for(int j=0;j<6;j++)
			{
			
			a.add(br.readLine());			
			}
		for(int j=0;j<6;j++)
		{
		
			b.add(br.readLine());			
		}
		for(int j=0;j<6;j++)
		{
		
			c.add(br.readLine());			
		}
		for(int j=0;j<6;j++)
		{
		
			d.add(br.readLine());			
		}
		for(int j=0;j<6;j++)
		{
		
			e.add(br.readLine());			
		}
		for(int j=0;j<6;j++)
		{
		
			f.add(br.readLine());			
		}
		for(int j=0;j<6;j++)
		{
		
			g.add(br.readLine());		
		}
		for(int j=0;j<6;j++)
		{
		
			h.add(br.readLine());		
		}
		for(int j=0;j<6;j++)
		{
		
			i.add(br.readLine());		
		}
		for(int i=0;i<4;i++)
		{
		
			j.add(br.readLine());		
		}
		
	al.add(a);
	al.add(b);
	al.add(c);
	al.add(d);
	al.add(e);
	al.add(f);
	al.add(g);
	al.add(h);
	al.add(i);
	al.add(j);
	//System.out.println(al);
	
	}
	catch(Exception e)
	{
		System.out.println("Hello");
	}
	return al;
	
}

public static ArrayList<ArrayList<String>> morse()
{
	try
	{
	BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/HARSHA VARDHANA/Permute/morse.txt"));
	
		for(int j=0;j<3;j++)
			{
			
			a2.add(br1.readLine());			
			}
		for(int j=0;j<3;j++)
		{
		
			b2.add(br1.readLine());			
		}
		for(int j=0;j<3;j++)
		{
		
			c2.add(br1.readLine());			
		}
		for(int j=0;j<3;j++)
		{
		
			d2.add(br1.readLine());			
		}
		for(int j=0;j<3;j++)
		{
		
			e2.add(br1.readLine());			
		}
		for(int j=0;j<3;j++)
		{
		
			f2.add(br1.readLine());			
		}
		for(int j=0;j<3;j++)
		{
		
			g2.add(br1.readLine());		
		}
		for(int j=0;j<3;j++)
		{
		
			h2.add(br1.readLine());		
		}
		for(int j=0;j<3;j++)
		{
		
			i2.add(br1.readLine());		
		}
		for(int j=0;j<3;j++)
		{
		
			j2.add(br1.readLine());		
		}
		
	al2.add(a2);
	al2.add(b2);
	al2.add(c2);
	al2.add(d2);
	al2.add(e2);
	al2.add(f2);
	al2.add(g2);
	al2.add(h2);
	al2.add(i2);
	al2.add(j2);
	//System.out.println(al2);
	
	}
	catch(Exception e)
	{
		System.out.println("Hello");
	}
	return al2;
	
}

	


public static void main(String[] args)
{
	fromfile.ascii();
	fromfile.morse();
}
	
}
