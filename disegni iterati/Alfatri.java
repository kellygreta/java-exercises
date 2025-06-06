import java.util.Scanner;

public class Alfatri {

    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int c = 'A';
        
        for(int r=1; r<=n; r++) {
                
            for( int i=0; i<r; i++) {
               
                System.out.print((char)c);
            }
            
            c = c+1;
            System.out.println();
            
        }
        
    }
    
}
       
