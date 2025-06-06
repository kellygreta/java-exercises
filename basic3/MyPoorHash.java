public class MyPoorHash{
	public static void main(String[] args){
		
		 char[] output = new char[15];
		 String input = args[0];
		 int c=0;
		 
		 for(int i=0; i<input.length(); i++){
		 	
		 	if(c==15){
		 		break;
		 	}
		 	
		 	int n = input.charAt(i)-0;
		 	n=n/3;
		 	int k = i%15;
		 	if(output[k]==0){
		 		k=32;
		 	}
		 	n=n+output[k];
		 	n=n%95;
		 	n=n+33;
		 	output[c]=(char)n;
		 	c++;
		 
		 }
		 
		 for(int i=0; i<15; i++){
		 	System.out.print(output[i]);
		 }
		 System.out.println();
		 	
	}
}
