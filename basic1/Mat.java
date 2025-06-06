import java.util.Random;
import java.util.Scanner;

public class Mat{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int r =  in.nextInt();
		int c =  in.nextInt();
		int max =  in.nextInt();
		
		int[][] mat = creaMatrice(r,c,max);
		stampaMatrice(mat);
		System.out.println("somma: "+sommaMatrice(mat));
		System.out.println("e' simmetrica: "+simmetrica(mat));
	
	}
	
	public static int[][] creaMatrice(int r, int c, int max){
		
		int[][] mat = new int[r][c];
		Random rand = new Random();
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				int n = rand.nextInt(max);
				mat[i][j] =n;
			}
		}
		return mat;
	}
	
	public static int sommaMatrice(int[][] m){
	
	int somma=0;
	
	for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				
				somma+=m[i][j];
			}
		}
		return somma;
	}	
	
	

	public static void stampaMatrice(int[][] m){
		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
		
				System.out.print(m[i][j]);
			}
			
			System.out.println();
			
		}
	}

	public static boolean simmetrica(int[][] m){
		
		boolean flag = true;
		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				
				if(m[i][j]!=m[j][i])
					flag=false;
				
			}
		}
		return flag;
	}

}
