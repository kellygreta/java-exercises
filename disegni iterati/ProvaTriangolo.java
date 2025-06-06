import java.util.Scanner;

public class ProvaTriangolo {

    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for(int r=1; r<=n; r++) {
                
            for( int i=0; i<r; i++) {
               
                System.out.print("*");
            }
            
            System.out.println();
            
            }
        
        for(int r=n-1; r>0; r--) {
            
            for( int i=0; i<r; i++) {
                   
                    System.out.print("*");
                }
                
                System.out.println();
                
                }
        
    }
}

