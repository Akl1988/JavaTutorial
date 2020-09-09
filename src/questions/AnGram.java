package questions;

import java.util.Scanner;

public class AnGram {

	public static void main(String[] args) {
	
		 	Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter two strings");

		    String s1 = scanner.next();
		    String s2 = scanner.next();


		    int counter = 0;

		    int number1 = 0;
		    int number2 = 0;

		    if(s1.length() != s2.length()) {
		        System.out.println("The strings are not anagrams");
		    }   else {


		        for(int i = 0; i < s1.length() ; i++) {
		            for(int j = 0; j < s1.length() ; i++) {

		                // number1 = i;
		                // number2 = j;
		            	
		            	  if(i == s1.length()){
		                      number1 = i - 1;
		                  }
		                  if(j == s2.length()){
		                      number2 = j - 1;
		                  }


		                  if(s1.charAt(number1) == s2.charAt(number2)) {
		                      counter ++ ;
		                      System.out.println(counter);
		                  }

		              }

		          }
		          System.out.println(counter);

		      }

		      System.out.println(s1 + " " + s2 + " " + counter);

		  


	}

}
