package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cantik = in.nextLine();
        char[] split = cantik.toCharArray();
        boolean k = false;
        boolean l = false;
        boolean m = false;
        for (int i = 0; i < split.length; i++) {
            if (split[i] == 'I') {
                k = true;

            }
            if (k == true && split[i] == 'S') {
                l = true;

            }
            if (l == true && split[i] == 'C') {
                m = true;

            }

        }
        if (k && l && m) {
            System.out.println("CANTIK");

        } else {
            System.out.println("TDK CANTIK");
        }

    }
}
