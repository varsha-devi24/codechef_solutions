/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T-->0)
		{
		    int N=input.nextInt();
		    int M=input.nextInt();
		    int K=input.nextInt();
		    int total = N+K;
		    if(total<=M)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
