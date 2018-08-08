import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="Helloworld";
		int l=s.length();
		int c=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
			if(ch[i]==ch[j])
			c++;
			}
		}
			if(c==0)
            System.out.print("Yes");
            else
            System.out.print("No");
		}
		
	}
