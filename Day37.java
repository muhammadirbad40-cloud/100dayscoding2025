package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

       System.out.print("Masukkan Angka : ");
        int a = in.nextInt();
        
        if (a % 2 == 0){
            System.out.println(a + " genap ");
        }else{
            System.out.println(a + " ganjil");
        }

    }

}
