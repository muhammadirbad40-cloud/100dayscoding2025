
package day21;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("masukkan a = ");
        int a = inp.nextInt();
        
        System.out.print("masukkan b = ");
        int b = inp.nextInt();
        
        System.out.println("\nSebelum ditukar:\n a = "+a+"\n b = "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nSesudah ditukar:\n a = "+a+"\n b = "+b);
    }
    
}
