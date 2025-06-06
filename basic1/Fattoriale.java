public class Fattoriale{
	
	public static void main(String[] args){
	
	int n = Integer.parseInt(args[0]);
		int ris = fattoriale(n);
		System.out.println(ris);
	
	}
		
	public static int fattoriale(int n){
		if (n==0 || n==1){
			return 1;
		}
		else{
			//System.out.println(n+"*"+(n-1));
			return n*(fattoriale(n-1));
		}
			 	
	}
}

