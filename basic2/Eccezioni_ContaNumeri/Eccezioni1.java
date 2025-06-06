import java.io.*;
import java.util.*;

public class Eccezioni1{
	public static void main(String[] args){
		
		File file = new File(args[0]);
		
		int[] num = new int[10];
		
		int righeSaltate=0;
		
		int j=0;
		int n=0;
		try{
			
			Scanner in = new Scanner(file);
		
			while(in.hasNext()){
				
				boolean flag=true;
				String s = in.next();
				
				try{
				
					n = Integer.parseInt(s);	
				
				}catch(NumberFormatException x){
					
					righeSaltate++;
					flag=false;
				
				}		
				
				if(flag){
					
					try{
						
						num[j] = n;
						j++;
						
					}catch(IndexOutOfBoundsException y){
				
						righeSaltate++;
				
					}	
						
				}
				
			}
		
			System.out.println("saltate "+righeSaltate+" righe");
		
			for(int i=9; i>=0; i--){
		
				System.out.print(num[i]+", ");
			
			}
			System.out.println();
			
		}catch(FileNotFoundException e){
		
			System.out.println("ERRORE");
		
		}
	}
}
