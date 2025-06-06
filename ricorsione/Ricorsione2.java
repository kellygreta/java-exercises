/*
 * Disegno ricorsivo con Turtle Graphics:
 * Scrivere un programma Java che utilizzi la ricorsione per disegnare figure geometriche utilizzando la libreria ch.aplu.turtle.
 * 
 */

import ch.aplu.turtle.*;

public class Ricorsione2 {

	public static void main(String args[]) {
	
		Turtle t = new Turtle(); 
		
		t.setPos(-100,-100);
		
		//t.hideTurtle();
    	    
		int n = Integer.parseInt(args[0]);
		int l = Integer.parseInt(args[1]);
        
      	fiocco(t,n,l);
	
	}

	//Disegna un singolo segmento di una curva di Koch.
	public static void koch(Turtle t, int n, int l) {
	
	    t.hideTurtle();
      
      	if (n==0)
      		t.forward(l);
      		
      	else {
      	
			koch(t, n-1, l/3);
      		t.left(60);
      		koch(t, n-1, l/3);
      		t.right(120);
   			koch(t, n-1, l/3);
      		t.left(60);
      		koch(t, n-1, l/3);
      	
      	}
      		
		
	}
	
	//Utilizza il metodo koch per disegnare un fiocco di neve
	public static void fiocco(Turtle t, int n, int l) {
	
		koch(t,n,l);
		t.right(120);
		koch(t,n,l);
		t.right(120);
		koch(t,n,l);
		
	}
	
	//Disegna un albero con rami che si biforcano ricorsivamente.
	public static void albero(Turtle t, int n, int l) {
	
		if (n ==0) {
		
			t.forward(l);
			t.back(l);
			
		}
		
		else {
		
			t.forward(l/2);
			t.left(45);
			albero(t,n-1,l/2);
			t.right(90);
			albero(t,n-1,l/2);
			t.left(45);
		    t.back(l/2);
		}
		
	}
	/* 	
	forward(double d) muove avanti di d lunghezza
	right(double d) ruota a destra  di d gradi
  	left(double d) ruota a sinistra di d gradi 
	*/
		
}

/*
-cp -> classpath  
Terminal:
javac -cp .:aplu5.jar Ricorsione2.java
java -cp .:aplu5.jar Ricorsione2 3 300
 */


