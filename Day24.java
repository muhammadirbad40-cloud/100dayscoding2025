package lingkaran_1;
import java.util.Scanner;
public class Lingkaran_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       final double phi = 3.14;
       double L, K, r, d;
        
       System.out.print("r = ");
       r = input.nextDouble();
       d = 2 * r;
       
       L = phi * r *r;
     
       
       System.out.println("Luas = " + L);
      
    }
    
}
