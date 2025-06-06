import java.util.Scanner;

public class  EsA {
    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
          
        for (int i=0; i<n; i++) { // la prima riga
            
            System.out.print("*");
            
        }
        
        System.out.println(); 
      
  		for(int r=1; r<=n-2; r++) { 	//tutte le righe del corpo
      
        	
          if (r%2==1) { //ok?
          
         	 for (int p=0; p<n-2; p++) {  // così scriviamo n-2 puntini. Ma ci serve un costrutto che capisca SE siamo in una riga pari per stampare n-1 "." altrimenti n-2 "."
                  
           			System.out.print(".");
            
            	}
        
        		System.out.print("**");
          }
         
          else {
        	
            	for (int j=0; j<n-1; j++) { 
             
            		System.out.print(".");

         	   }
              System.out.print("*");
          }

          System.out.println(); // a fine ciclo vado acapo
          
        
        }
        for (int i=0; i<n; i++) { // l'ultima riga 
            
            System.out.print("*");
            
        }
      
    }
       
}
