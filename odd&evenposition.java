import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="XCODE";
		int l=s.length();
		String a[]=s.split("");
		String x="",x1="";
		for(int i=0;i<l;i++){
			if(i%2==0)
			x=x+a[i];
	            	else
	            	x1=x1+a[i];
		}
			System.out.print(x+" "+x1 );
	}
}
