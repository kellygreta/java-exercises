import java.util.Scanner;

public class AsterLettere{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		for(int i=0; i<s.length(); i++){
			System.out.print("*");
		}
		
		System.out.println();
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)=='a'){
				System.out.print("*");
			}
			else{	
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)=='a'){
				System.out.print("");
			}
			else{	
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		
	}
} 

	 			
		
		
		
