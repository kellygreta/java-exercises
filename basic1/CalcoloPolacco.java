// java CalcoloPolacco 2 4 per
// eseguo 2 per 4
//8
public class CalcoloPolacco{
	public static void main(String[] args){
	
		int res=Integer.parseInt(args[0]);
		int b=0;
	
	for(int i=1; i<args.length;i++){
		
		if(!args[i].equals("+") && !args[i].equals("-") && !args[i].equals("per") && !args[i].equals("div")){ 
		
			b=Integer.parseInt(args[i]);

		}
		
		else{
		
			System.out.println("eseguo "+res+""+args[i]+""+b);	
		
			switch(args[i]){
				case "+": res+=b;
					break;
					
				case "-": res-=b;
					break;
					
				case "per": res*=b;
					break;
				
				case "div": res/=b;
					break;
				}	
			}	
		}
		
		System.out.println(res);
	
	}
}
