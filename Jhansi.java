package Baggies;

import java.util.ArrayList;
import java.util.Collections;

public class Jhansi {
	public static void main(String args[]) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(3);
		al.add(1);
		System.out.println("Before sort"+al);
		Collections.sort(al);
		System.out.println("After sort:"+al);
		Collections.reverse(al);
		System.out.println("Revers:"+al);
		

}
}
