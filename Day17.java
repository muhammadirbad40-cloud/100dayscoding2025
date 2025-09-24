package day17;
import java.util.Scanner;
public class Day17 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        double a,b,c;
        System.out.print("Masukkan a = ");
        a =input.nextDouble();
        
        System.out.print("Masukkan b = ");
        b = input.nextDouble();
        
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);
    }    
}
