import java.util.Scanner;

public class SommaParolePari {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        String parola = null;
        int somma = 0;
        int l = 0;
        
        while (in.hasNext()) {
            parola = in.next();
            l = parola.length();
            if (l%2 == 0)
                somma += l;
        }
        System.out.println(somma);
    }
}
