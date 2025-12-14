package Irbdd;
import java.util.Scanner;
public class Irbdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan batas fibonacci : ");
        int angka = in.nextInt();
        
        int a = 1;
        int b = 1;
        
        System.out.print("Angka fibonacci : ");
        for (int i = 1; i <= angka; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
