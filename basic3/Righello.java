public class Righello{
	public static void main(String[] args){
	
		int n = Integer.parseInt(args[0]);
		disegnaRighello(n);
	
		}
		
	public static void disegnaRighello(int n){
		
		if(n==0){
			System.out.print("");
			return;
		}
		
		if(n==1){
			System.out.println("-");
			return;
		}
		
		else{
			
			disegnaRighello(n-1);
				
			for(int i=0; i<n; i++){
				System.out.print("-");
			}
			
			System.out.println();
			
			disegnaRighello(n-1);
			
		}
		
	}
	
}
