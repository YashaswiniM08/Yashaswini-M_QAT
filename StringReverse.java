package test;
import java.util.*;

public class StringReverse {
	public static void main(String args[]) {
		String init, rev = " ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		init=sc.nextLine();
		int length=init.length();
		for(int i=length-1;i>=0;i--)
		  rev=rev+init.charAt(i);
		System.out.println("Reversed string: "+rev);
		}

}
