package questions;

public class SwapInteger {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println("Before swap =" +x+ "& " +y);
		
		int t;
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("AFter swap =" +x+ "& " +y);
		
		//2nd method
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("AFter swap =" +x+ "& " +y);
		
		//3rd Method
		
		x = x*y;
		y = x/y;
		x = x/y;
 
		System.out.println("AFter swap =" +x+ "& " +y);
		
		//4th Method
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("AFter swap =" +x+ "& " +y);
		
				
	}

}
