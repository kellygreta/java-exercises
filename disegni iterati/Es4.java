import java.util.Scanner;

public class Es4 {
    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int p = 1;
        
        for (int i=0; i<n; i++) { // la prima riga 
            
            System.out.print("*");
            
        }
        
        System.out.println();
        
        for (int r=n/2; r>0; r--) { // il numero di righe dopo la prima e le 'ordino' dalla ultima alla prima
        
            for (int i=1; i<=r; i++) { //cosa c'è dentro: * (es n=7 as=3.3)
            
                System.out.print("*");

            }
        
            
            for (int i=1; i<=p; i++) {
            
                System.out.print(".");
              
            }
             
            for (int i=1; i<=r; i++) { 
            
               System.out.print("*");
           
           }
            
            p=p+2;
            System.out.println();
            
        }

       
    }

}
