package day22;
import java.util.Scanner;
public class Day22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int S,L;
        System.out.print("Masukkan sisi : ");
        S = input.nextInt();
        L = S * S;
        
        System.out.println("Luas = Sisi x Sisi");
        System.out.println("Luas = " + S + " x " + S + " = " + L );
        System.out.println("\nLuas Persegi = " + L);
    }
    
}
