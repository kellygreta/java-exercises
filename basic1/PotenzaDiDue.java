import java.util.Scanner;

public class PotenzaDiDue {
  
	public static void main(String [] args) {
		
		Scanner in= new Scanner(System.in);
		
		int c=0;
		
		for(int i=0; i<args.length; i++){
			
			if(args.length==0){
				System.out.print("nessun input");
			}
			
			int n = Integer.parseInt(args[i]);
			
			if(n==1 || n==2){
				c++;
			}
			else{
				for(;;){
					n=n/2;
					if(n==2){
						c++;
						break;
					}
					if(n==1){
						break;
					}
				}
			}
		}
		System.out.println(c);
	}
}
