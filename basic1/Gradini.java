import java.util.Scanner;

public class Gradini{
	public static void main (String[] args){
	
		Scanner in = new Scanner(System.in);
	
		int num = in.nextInt();
		
		System.out.println(passi(num));
	
	}
	
	public static int passi(int n){

		if(n==1)
			return 1;
		
		if(n==2)
			return 2;
			
		return passi(n-2)+passi(n-1);

	}

}
