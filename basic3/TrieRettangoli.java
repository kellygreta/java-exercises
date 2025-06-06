public class TrieRettangoli{
	public static void main(String[] args){	
		
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		StringBuilder sb3=new StringBuilder();
		
		int i=0;
		
		for(String s: args){
			if(s.equals("T")){
				sb1.append("  *  ");
				sb2.append(" *** ");
				sb3.append("*****");
			}
		
			else{
				sb1.append("*****");
				sb2.append("*****");
				sb3.append("*****");
			}
			if(i!=args.length-1){
				sb1.append(" | ");
				sb2.append(" | ");
				sb3.append(" | ");
			}
			
			i++;
		}
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
	}
}
