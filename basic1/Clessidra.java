public class Clessidra{
	public static void main(String[] args){

		int n = Integer.parseInt(args[0]);
		
		clessidra(n,0);
		
	}
	
	public static void clessidra(int n, int offset){

		if(offset==n){	
			return;
		}
		
		//STAMPO offset spazi e 2*n-1 -2*offset asterschi (cima)
		for(int i=0;i<offset;i++){
			System.out.print(" ");
		}
		
		for(int i=0;i<(2*n-1)-2*offset;i++){
			System.out.print("*");
		}
		
		System.out.println();
		
		//STAMPO offset spazi e 2*n-1 -2*offset asterschi (ricorsivamen)
		
		clessidra(n,offset+1);
		
		//STAMPO offset spazi e 2*n-1 -2*offset asterschi (fondo)
		
		for(int i=0;i<offset;i++){
			System.out.print(" ");
		}
		
		for(int i=0;i<(2*n-1)-2*offset;i++){
			System.out.print("*");
		}	
		
		System.out.println();
	}
} 
