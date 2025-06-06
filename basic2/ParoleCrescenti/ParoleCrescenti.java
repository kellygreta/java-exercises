import java.util.Scanner;
public class ParoleCrescenti {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String parola = null;
        char char1, char2;
        int counter = 0;
        boolean errTrovato = false;
        
        while (in.hasNext()) {
            parola = in.next();
            
            for (int i=0; i<(parola.length()-1); i++) {
                char1 = parola.charAt(i); 
                for (int j=(i+1); j<parola.length(); j++) {
                    char2 = parola.charAt(j);
                    if ((int)char1 > (int)char2)
                        errTrovato = true;   
                }
            }
            if (!errTrovato)
                counter++;
            errTrovato = false;
        }
        System.out.println(counter);
    }
}        
                    
        
