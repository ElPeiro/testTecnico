package com.solucionfactible.dev;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
*/
public class ArrayDiff {
	public static void main(String[] args){
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1000,2,3,12,5,6,70,8,9,100));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> c = new ArrayList<Integer>();
		ArrayDiff dif = new ArrayDiff();
		c = dif.diff(a, b);
		c.forEach(System.out::println);
	}
	public static List<Integer> diff(List<Integer> a, List<Integer> b){
		b.removeAll(a);
		Collections.sort(a);
		//a.forEach(System.out::println);
		return a;
	}
}

