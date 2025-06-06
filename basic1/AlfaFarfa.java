import java.io.*;
import java.util.Scanner;

public class AlfaFarfa {
	public static void main(String[] args) throws FileNotFoundException {
	
		File f = new File(args[0]);
		Scanner in = new Scanner(f);
		
		while(in.hasNext()){
			String s = in.next(); //parola per parola
			System.out.println(nextVowel(s));
			System.out.println(farfalla(s));
		}
				
	}

	public static String farfalla(String testo){
		
		StringBuilder sb = new StringBuilder();
			
		for(int i=0; i<testo.length(); i++){
			
			char c = testo.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				
				sb.append(c);		
				sb.append('f');
				sb.append(c);
				
			}
			else{
				
				sb.append(c);		
				
				
			}
		}
		
		return sb.toString();
	}
}
