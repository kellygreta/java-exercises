import java.util.Scanner;

public class TriangoloFede {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		char c;
		
		for (int a=0; a<s.length(); a++){
			c = s.charAt(a);
			
			if (Character.isLetter(c)) {
			
				c++;
				
				System.out.print(c);
			}
			
			else {
			
				if (Character.digit(c) < 4) {
				
					System.out.print(Character.valueOf(c)*2);
				
				}
				
				else {	
					System.out.print(c);
				}
			
			}
		}
	
		System.out.println();	

	}			 

	public static void Diagonale() {
	
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		for (int r=1; r<=n; r++){
			for (int i=0; i<r-1; i++){
				System.out.print(" ");
			}
			System.out.println("");
		}
		for ( int r=n-1; r>0; r--){
			for (int i=0; i<r-1; i++){
			System.out.print(" ");
			}
			System.out.println("");
		}
						
	}

    public static void TriangoloComp() {
    	
    		Scanner in = new Scanner(System.in);
    		
    		int n = in.nextInt();
    		
    		for (int r=1; r<=n; r++) {
    			
    			for (int i=0; i<r; i++) {
    			
    				System.out.print(".");
    				
    			}
    			
    			for (int i=0; i<r; i++) {
    			
    				System.out.print("*");
    				
    			}
    			
    			System.out.print(".");
    			
    			for (int i=0; i<r; i++) {
    			
    				System.out.print("*");
    				
    			}
    			
    			System.out.println();
    		
    		}
    		
    	}
    	
}
    		
    	

