public class DisegnaTriangoliRettangoli {

    public static void main(String[] args) {
        
        for (int i=0; i<args.length; i++) {
            if (args[i].equals("R"))
                System.out.print("*****");
            else System.out.print("  *  ");
            if (i != args.length-1)
                System.out.print("|");
        }
        System.out.println();
        for (int i=0; i<args.length; i++) {
            if (args[i].equals("R"))
                System.out.print("*****");
            else System.out.print(" *** ");
            if (i != args.length-1)
                System.out.print("|");
        }
        System.out.println();
        for (int i=0; i<args.length; i++) {
            System.out.print("*****");
            if (i != args.length-1)
                System.out.print("|");
        }
        System.out.println();
    }
}    
            
