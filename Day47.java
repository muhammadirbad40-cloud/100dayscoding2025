package irbdd;

import java.util.Scanner;

public class irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===OCTOBER 2025===");
        System.out.print("\nMasukkan Tanggal: ");
        int tanggal = in.nextInt();
        
        System.out.println("================\n");
        switch (tanggal) {
            case 6,13,20,27 -> {
                System.out.printf("Senin %d October 2025",tanggal);
            }
            case 7,14,21,28 -> {    
                System.out.printf("Selasa %d October 2025",tanggal);
            }
            case 1,8,15,22,29 -> {    
                System.out.printf("Rabu %d October 2025",tanggal);
            }
            case 2,9,16,23,30 -> {    
                System.out.printf("Kamis %d October 2025",tanggal);
            }
            case 3,10,17,24,31 -> {    
                System.out.printf("Jumat %d October 2025",tanggal);
            }
            case 11,18,25,4 -> {    
                System.out.printf("Sabtu %d October 2025",tanggal);
            }
            case 12,19,26,5 -> {    
                System.out.printf("Minggu %d October 2025",tanggal);
            }
            default ->
                System.out.println("Tanggal Tidak Valid!!");
        }
        System.out.println(" ");
        }
    }
