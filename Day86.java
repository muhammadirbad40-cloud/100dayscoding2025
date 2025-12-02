package Irbdd;

public class Irbdd {

    public static void main(String[] args) {

        int[] nilai = {70, 85, 60, 35, 90, 10, 55};

        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai minimum dalam array adalah : " + min);
    }
}
