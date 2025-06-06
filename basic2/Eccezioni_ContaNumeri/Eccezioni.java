import java.io.*;
import java.util.*;

public class Eccezioni{
	public static void main(String[] args){
		
		File file = new File(args[0]);
		
		int[] num = new int[10];
		
		int righeTot=0;
		
		int j=0;
		
		try{
			
			Scanner in = new Scanner(file);
		
			while(in.hasNext()){
				
				boolean numero=true;
				righeTot++;
			
				String s = in.next();
			
				for(int i=0; i<s.length(); i++){
				
					if(!Character.isDigit(s.charAt(i)))
						numero=false;
		
				}
			
				if(numero && j<10){
					
					num[j] = Integer.parseInt(s);	
					j++;
				}
			
			}
		
			System.out.println("saltate "+(righeTot-10)+" righe");
		
			for(int i=9; i>=0; i--){
		
				System.out.print(num[i]+", ");
			
			}
			System.out.println();
			
		}catch(FileNotFoundException e){
		
			System.out.println("ERRORE");
		
		}
	}
}
