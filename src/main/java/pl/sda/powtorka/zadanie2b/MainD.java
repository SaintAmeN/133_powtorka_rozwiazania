package pl.sda.powtorka.zadanie2b;

import java.util.Scanner;

public class MainD {
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

        new Choinka(rozmiarChoinki, "*", "O", numer).wypisz();
    }
}
