package pl.sda.powtorka.zadanie2;

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

        String g = "*";
        String s = " ";

        int licznikGwiazdek = 0;
        int licznikSpacji = 0;

        for (int i = 0; i < rozmiarChoinki; i++) {                              // wiersze
            for (int j = rozmiarChoinki - 1; j > licznikSpacji; --j) {          // spacje w wierszu
                System.out.print(s);
            }
            licznikSpacji += 1;

            for (int j = 0; j <= licznikGwiazdek; j++) {                         // gwiazdki w wierszu
                System.out.print(g);
            }
            licznikGwiazdek += 2;

            System.out.println();
        }

    }
}
