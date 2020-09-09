package questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplString {
	
	public static void FindString2(String input2) {
		
		String words1[] = input2.split(" ");
		Map<String, Integer> count1 = new HashMap<String, Integer>();
		
		for(String word1:words1) {
			System.out.println(word1);
			
			if (count1.containsKey(word1)) {
				count1.put(word1, count1.get(word1)+1);
			}
			else {
				count1.put(word1, 1);
			}
		}
		Iterator <String> temp = count1.keySet().iterator();		
		while(temp.hasNext()){
			String t = temp.next();
			if(count1.get(t)>1) {
				System.out.println("the word"+ t + "append" +count1.get(t)+ "no of times" );
			}
		}
			
	}

	public static void main(String[] args) {
		
		FindString1("At is to me java java");
		FindString2("At is to me java java");

	}
	
	public static void FindString1(String input1) {
		
		String words[] = input1.split(" ");
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for(String word:words) {
			
			System.out.println(word);
			
			if (count.containsKey(word)) {
				count.put(word, count.get(word)+1);
			}
			else {
				count.put(word, 1);
			}
			
		}
		System.out.println(count);
		
		Set<String> wordString = count.keySet();
		
		for (String word : wordString) {
			
			if (count.get(word)>1) {
				
				System.out.println(word + "   " + count.get(word) );
			}
		}
		
		
		
	}

}
