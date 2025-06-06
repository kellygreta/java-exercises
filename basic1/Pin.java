import java.util.Random;
import java.util.Scanner;

public class Pin {
	public static void main(String[] args)  {
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		 	
		int[] pin = {0,1,2,3,4,5,6,7,8,9};
	
		int[] num= new int[10];
		
		System.out.print("PIN:");
		for(int i=0; i<10; i++){
			System.out.print(pin[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++){
			int n = rand.nextInt(9);
			num[i]=n;
		}
		
		System.out.print("NUM:");
		for(int i=0; i<10; i++){
			System.out.print(num[i]);
		}
	
		System.out.println();
		
		String input = in.nextLine();
		String s = "1213";
	
		boolean flag = true; 
		
		for(int i=0; i<s.length(); i++){
		
			int a = s.charAt(i)-'0';
			int b = input.charAt(i)-'0';
			
			/*System.out.println("a "+a);
			System.out.println("b "+b);
			System.out.println(num[a]);*/
			
			
			if(num[a]!=b){
				System.out.println("PIN non valido");
				flag=false;
				break;
			}
		}
		
		if(flag)
			System.out.println("benvenuto");
	}
}
