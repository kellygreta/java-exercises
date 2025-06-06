public class PoorMansHash{
	public static void main(String[] args){
		
		 char[] output = new char[15];
		 String input = args[0];

		 
		 for(int i=0; i<15; i++){
		 	output[i]=' ';
		 }
		 
		 
		 for (int i=0; i<input.length(); i++) {
		 	int n = input.charAt(i) / 3; 
		 	int k = i % 15;
		 	output[k] += n;
		 }
		 
		 for (int i=0; i<input.length(); i++) {
		 	int k = i % 15;
		 	output[k] %= 95;
		 	output[k] += 33;
		 }
		 
		 
		 // STAMPA
		 for(int i=0; i<15; i++){
		 	System.out.print(output[i]);
		 }
		 System.out.println();
		 	
	}
}