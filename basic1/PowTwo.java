import java.util.Scanner;

public class PowTwo{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a = n;
		
		for(int i = 0; ; i++){
		
			if(n==1){
				System.out.println(a+" = 2 alla "+i);
				break;
			}
			
			if(n==3 || n==5 || n==0){
				System.out.println(a+" non è una potenza di due");
				break;
			}
			
			n/=2;
			
		}
	}
}
