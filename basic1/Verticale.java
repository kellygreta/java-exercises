import java.util.Scanner;

public class Verticale{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Scrivi un numero intero di 4 cifre:");
		
		int n = in.nextInt();
		
		System.out.println((n-n%1000)/1000);
		
		System.out.println((n%1000-n%100)/100);
		
		System.out.println((n%100-n%10)/10);
		
		System.out.println(n%10);
		
	}
}	
