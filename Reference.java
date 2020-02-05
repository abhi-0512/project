package test001;
/**
 * Reference.java - a program to show non-primitive datatype passed by reference
 * 
 * @author abhishek ranjan
 * @date 2020/02/05
 */
import java.util.*;
public class Reference {
	public static void main(String[]arg)
	{
		int [] b= {500};
		System.out.print("\nBefore calling method: "+b[0]);
		valueReference(b);
		System.out.print("\nAfter calling method: "+b[0]);
	}
	public static void valueReference(int[]a)
	{
		System.out.print("\nInside value reference: "+a[0]);
		a[0]=100;
		System.out.print("\nInside value reference: "+a[0]);
	}
}
