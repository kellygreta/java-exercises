public class Crivello{
	public static void main(String[] args){

		int[][] mat = new int[10][10];
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				
				mat[i][j]+=j+1;
				if(i>0)
					mat[i][j]+=(i*10);
			}
		}	
		
		int cont=2;
		
		while(cont<10){
		
			for(int i=0; i<10; i++){
				for(int j=0; j<10; j++){
				
					if(mat[i][j]%cont==0 && mat[i][j]!=cont)
						mat[i][j]=0;
				
				}
			}
			
			cont++;
			
		}
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				
				if(mat[i][j]!=0){
					System.out.printf("%5d",mat[i][j]);
				}
				
				else{
					System.out.printf("%5s"," ");
				}
				
			}
			System.out.println();
		}
		
	}
}
