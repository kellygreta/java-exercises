public class Disegna {
	public static void main(String[] args) {
		
		for(String s: args) {
				
			if (s.equals("t")) {
				t();
			}
			else {
				r();
			}
		}
		
	}
	
	public static void t() {
		
		int counter = 0;
		
		for (int riga=1; riga<=3; riga++) {
			
			for (int spazio=1; spazio<=3-riga; spazio++) {
				
				System.out.print(" ");
			}
			
			for (int ast=1; ast<=riga+counter; ast++) {
				
				System.out.print("*");
			}
			counter++;
			
			for (int spazio=1; spazio<=3-riga; spazio++) {
				
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void r() {
		
		for (int riga=1; riga<=3; riga++) {
			
			for (int ast=1; ast<=5; ast++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		System.out.println();
	}
}