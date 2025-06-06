import java.util.*;

public class Eratostene{
    
    public static void main(String [] args) {


	int n = Integer.parseInt(args[0]); // si assume n>=2


 // costruisco insieme  setPrimi = {2,...,n}

	Set<Integer> setPrimi = new  HashSet<Integer> ();
	for(int k=2 ; k <=n ; k++){
	    setPrimi.add(new Integer(k));
	}
	
// per ogni k in setPrimi, tolgo da setPrimi i multipli m di k tali che m < k <= n

	for(Integer k : setPrimi){
	    for(int m = 2*k ; m <= n ; m += k)  
	         setPrimi.remove(new Integer(m));
	}

 // in  setPrimi sono rimasti solamente i numeri primi p tali che 2 <= p <= n 

	for(Integer p : setPrimi)
	    System.out.print(p + " " );
	
	System.out.println();

    } // end main
} // end class



