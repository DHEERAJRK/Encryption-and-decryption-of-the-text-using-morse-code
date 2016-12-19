import java.util.*;

class pairfns 
{
	public static float Cantor(int x, int y)
	{
		float res1 = (float) (((x+y)*(x+y+1))/2) + y;
		return res1;
	}
	
	public static double pair2(double a,double b)
	{
		double p= Math.pow(2.0000,a);
		double res2= (p*(2*b+1))-1;
		return res2;
	}
	

}
