package Main;

public class Aver{
	public double average(int[] li)
	   {
		   double s=0;
		   for(int i=0;i<li.length;i++)
			   s+=li[i];
		   return (double)(s/li.length);
	   }
}
