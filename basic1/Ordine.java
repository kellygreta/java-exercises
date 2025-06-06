import java.util.Scanner;

public class Ordine {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			
			System.out.println("Proposta del giorno:");
			
			System.out.println("a. pizza\nb. penne al pomodoro\nc. cotoletta e patatine\nd. crostata e caffè");
			
			System.out.println("ordine ?");
			
			String s = in.nextLine();
			char c = s.charAt(0);
			
			System.out.print("hai ordinato ");
			
			switch(c) {
				case 'a' :
					System.out.println("pizza");
					break;
					
				case 'b' :
					System.out.println("penne al pomodoro");
					break;
					
				case 'c' :
					System.out.println("coto e patatine");
					break;
					
				case 'd' :
					System.out.println("dolce");
					break;
					
			}
		}
	}
}	
			
