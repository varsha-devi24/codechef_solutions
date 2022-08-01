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
    int	N=input.nextInt();
	int A=input.nextInt();
	int B=input.nextInt();
	int no_sub = N-A;
	int great_rat=no_sub-B;
	System.out.print(no_sub+" "+great_rat);
	}
}
