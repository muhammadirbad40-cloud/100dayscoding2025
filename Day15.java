package day15;
import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("masukkan a = ");
        a = input.nextInt();
        System.out.print("masukkan b = ");
        b = input.nextInt();
       
       // contoh rumus
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        c = b - a;
        System.out.println(b + " - " + a + " = " + c);
    }
    
}
