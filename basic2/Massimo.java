public class Massimo{
	public static void main(String[] args){

		int l = args.length;
		int[] list = new int[l];
		
		for(int i=0; i<l; i++){
		
			int n = Integer.parseInt(args[i]);	
			list[i]=n;
			
		}
		
		System.out.println(massimo(list));	

	}

	public static int massimo(int[] lista){
	
		int l = lista.length;
		
		if(l==0)
			return 0;
			
		if(l==1)
			return lista[0];
	
		else{
			
			int[] l1 = {lista[0]};
			int[] l2 = new int[l-1];
			
			for(int i=1; i<l; i++){
				l2[i-1]=lista[i];
			}
			
			return massimo(l1) > massimo(l2) ? massimo(l1) : massimo(l2); 
		}
		
		
		
	}

}
