package Irbdd;

public class Irbdd {

    public static void main(String[] args) {

        int[] nilai = {10, 20, 30, 40, 50, 60, 70};

        int besar = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > besar) {
                besar = nilai[i];
            }
        }
        System.out.println("Nilai maksimum dalam array adalah : " + besar);
    }
}
