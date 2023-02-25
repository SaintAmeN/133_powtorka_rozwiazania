package pl.sda.powtorka.zadanie2b;

import java.util.Random;
import java.util.Scanner;

public class Main {
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

        int licznikGwiazdek = 0;
        int licznikSpacji = 0;

        double numer = 0.0;
        do {
            System.out.print("Podaj prawdopodobieństwo wystąpienia bombki:");
            numer = scanner.nextDouble();
        } while (numer < 0.0 || numer > 1.0);

        String gwiazdka = "*";
        String bombka = "o";
        String s = " ";

        Random generator = new Random();

        for (int i = 0; i < rozmiarChoinki; i++) {                              // wiersze
            for (int j = rozmiarChoinki - 1; j > licznikSpacji; --j) {          // spacje w wierszu
                System.out.print(s);
            }
            licznikSpacji += 1;

            for (int j = 0; j <= licznikGwiazdek; j++) {                         // gwiazdki w wierszu
                if (generator.nextDouble() <= numer) { // nextDouble losuje od 0.0 -> 1.0
                    System.out.print(bombka);
                } else {
                    System.out.print(gwiazdka);
                }
            }
            licznikGwiazdek += 2;

            System.out.println();
        }

    }
}
