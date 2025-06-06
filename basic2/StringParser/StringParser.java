public class StringParser{
	public static void main(String[] args){

		if(args.length!=2){
		
			System.out.println("ERRORE");
			return;
			
		}
		
		else{
			
				String s = args[0];
				int n;
			
			try{	
			
				n = Integer.parseInt(args[1]);
			
			}catch(Exception e){
			
				System.out.println("ERRORE");
				return;
				
			}
			
			System.out.println(traduzione(s,n));
			
		}
		
	}
	
	public static String traduzione(String s, int n){
	
		s=s.toUpperCase();
		int l = s.length();
		
		int somma=0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<l; i++){
		
			char c = s.charAt(i);
			
			System.out.println("PRIMA : "+c);
			
			if(Character.isLetter(c)){
				
				for(int j=0; j<n; j++){
					if(c=='Z'){
						c='A';
					}
					else{
						c++;
					}
				}
				
				char e = c;
				
				System.out.println("DOPO : "+e);
				
				sb.append(c);
				
			}
			
			if(Character.isDigit(c)){
				somma+=c-'0';
			}
		}
		
		sb.append(somma);
		
		return sb.toString();
		
	}
	
}
