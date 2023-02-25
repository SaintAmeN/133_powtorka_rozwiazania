package pl.sda.powtorka.zadanie2;

import java.util.Scanner;

public class MainC {
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

        choinka(rozmiarChoinki);
    }

    public static void choinka(int n) {
        for (int i = 0; i < n; i++) {
            String spacje = " ".repeat((n - 1) - i);
            String bombki = "*".repeat(i);

            System.out.println(spacje + bombki + "|" + bombki);
        }
    }
}
