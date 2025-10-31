package Irbdd;

public class Irbdd {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i == 5) continue ;
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int a = 10;
        while (a > 0) {
            a--;
            if(a == 5)continue;
            System.out.println(a);
        }
        
    }

}
