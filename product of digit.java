
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n=641,p=1,rem;
	  while(n!=0){
	  	rem=n%10;
	  	n=n/10;
	  	p=p*rem;
	  }
	  System.out.print(p);
	}
}
