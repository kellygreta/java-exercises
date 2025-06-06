import java.util.Scanner;

public class Parole {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    String parola;
    int lunghezzaParola = 0;
    int contaLettere = 0;
    
    parola = in.nextLine();
    lunghezzaParola = parola.length();
    
    while (lunghezzaParola > 0) {
        System.out.print("a");
        lunghezzaParola = lunghezzaParola - 1;
        }
        
    System.out.print("\n");
    return;
    }
}   
    
        
    
    
        
