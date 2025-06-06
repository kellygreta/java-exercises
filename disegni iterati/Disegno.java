import java.util.Scanner;

public class Disegno
{
   public static void main(String[] args)
   {

      int n;
      Scanner tastiera = new Scanner(System.in);

      System.out.println("Scrivi un numero tra 0 e 20");
      n = tastiera.nextInt();

      for(int i=1; i <= n; i++)
      {
         System.out.print('*');
      }

      System.out.println("\n\n");


      for(int i=1; i <= n; i++)
      {
         for(int j=1; j <= n; j++)
            System.out.print('*');
         System.out.println();
      }

   }//end main
}//end class
