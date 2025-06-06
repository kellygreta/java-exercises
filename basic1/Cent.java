import java.util.Scanner;

public class Cent{
	public static void main(String[] args){
	
		System.out.println("Quanti centesimi vuoi? (tra 1 e 99)");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println("50_cent:" +n/50);
		n %= 50;
			
		System.out.println("20_cent:" +n/20);
		n %= 20;	
		
		System.out.println("5_cent:" +n/5);
		n %= 5;
			
		System.out.println("2_cent:" +n/2);
		n %= 2;	
		
		System.out.println("1_cent:" +n);
		
	}
}

