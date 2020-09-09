package questions;

import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		
		String str = "Amit";
		
		System.out.println(" Reverse String =" + str);
		
		int l = str.length();
		
		String str1 = new String("jsfhskjfsshds");
		
		String reverse = " ";
		
		for (int i = l-1; i>=0; i--) {
			
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(" Reverse String =" +reverse);
		
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(" Reverse String =" +sb.reverse());
		
		StringBuilder sbl = new StringBuilder(str1);
		System.out.println(" Reverse String =" +sbl.reverse());
	
	}

}
