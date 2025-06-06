import java.util.Scanner;

public class PrimaRipetizione{
	public static void main (String[] args){
	
		Scanner in = new Scanner(System.in);
	
		String parola = in.next();
		int l = parola.length(); 
		
		for(int i=0; i<l; i++){
			for(int j=i+1; j<l; j++){
				
				if(parola.charAt(i)==parola.charAt(j)){
					System.out.println(parola.charAt(i));
					return;
				}
			}
		}
		
		System.out.println("ERRORE");
		
	}
}
