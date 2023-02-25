package pl.sda.powtorka.zadanie2b;

import java.util.Random;
import java.util.Scanner;

public class MainB {
    // Podaj rozmiar choinki: 7
    //       *
    //      ***
    //     *****
    //    *******
    //   *********
    //  ***********
    // *************
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar choinki:");
        int rozmiarChoinki = scanner.nextInt();

        double numer = 0.0;
        do {
            System.out.print("Podaj prawdopodobieństwo wystąpienia bombki:");
            numer = scanner.nextDouble();
        } while (numer < 0.0 || numer > 1.0);

        choinka(rozmiarChoinki, numer);
    }

    public static void choinka(int n, double prawdopodobienstwo) {
        String bombka = "*";

        for (int i = 0; i < n; i++) {
            String left = " ".repeat((n - 1) - i);
            String right = "";
            for (int j = n - i; j < n; j++) {
                left = left + losowosc(bombka, prawdopodobienstwo);
                right = right + losowosc(bombka, prawdopodobienstwo);
            }
            System.out.println(left + "|" + right);
        }
    }

    public static String losowosc(String o, double m) {
        if (m >= Math.random()) {
            o = o.replace("*", "o");
        }
        return o;
    }
}
