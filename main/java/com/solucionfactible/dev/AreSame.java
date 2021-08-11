package com.solucionfactible.dev;
import java.util.Arrays;
/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	public static void main(String[] args) {
		int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int[] b = new int[]{ 1,2,3,4,5,6,7,8,9,10};
		AreSame aresame = new AreSame();
		aresame.comp(a,b);
	}
	public static boolean comp(int[] a, int[] b) {
		if (Arrays.equals(a,b))
			System.out.println("IGUALES");
		else
			System.out.println("NO IGUALES");
		return false;
	}

}
