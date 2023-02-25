package pl.sda.powtorka.zadanie2;

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

        choinka(rozmiarChoinki);
    }

    public static void choinka(int n) {
        String bombka = "*";

        for (int i = 0; i < n; i++) {
            String left = " ".repeat((n - 1) - i);
            String right = "";
            for (int j = n - i; j < n; j++) {
                left = left + bombka;
                right = right + bombka;
            }
            System.out.println(left + "|" + right);
        }
    }
}
