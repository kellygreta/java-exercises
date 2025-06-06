import java.util.Scanner;

public class SommaParolePari{
	public static void main(String[] args){	
		Scanner in = new Scanner(System.in);
	
		String s;
		int somma=0;
	
		while(in.hasNext()){
		
			s = in.next();
			int l = s.length();
			if(l%2==0){
				somma+=l;
			}
		}
		System.out.println(somma);
	}
}
