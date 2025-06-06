import java.util.Scanner;
import java.math.BigInteger;

public class Snake {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (;;){
        
            for (int r=1; r<20; r++){
            
                for (int j=1; j<2*r; j++){
        
                System.out.print(" ");
            
                }
            
            System.out.print(n++);
            System.out.println();
            }
        
            for (int r=20; r>1; r--){
            
                for (int j=1; j<2*r; j++){
        
                System.out.print(" ");
            
                }
            
            System.out.print(n++);
            System.out.println();
            }
    
        }
    }
}            
