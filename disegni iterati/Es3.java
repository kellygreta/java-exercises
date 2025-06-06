import java.util.Scanner;

public class Es3 {

    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        
        String s;
        int barra, a, c;
        
        for (;;) {
        
        s = in.nextLine();
       
        if (s.equals(""))
            break;
        
        else
            barra = s.indexOf('/');
		
	        	String s1 = s.substring(barra);
		
	        	a = s1.indexOf('*');
		
		    c=0;
		
	        	if (a>0)
		    c=1;
		
	        	else
		    c=0;
		    

        System.out.println(c);
	 
	    }
		
     }
} 
