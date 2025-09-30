package day23;
import java.util.Scanner;
public class Day23 {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         int P,L,l;
         System.out.print("Masukkan panjang : ");
         P = in.nextInt();
         System.out.print("masukkan lebar : ");
         L = in.nextInt();
         
         l = P * L;
         
         System.out.println("Luas persegi panjang = " + l);
    }
    
}
