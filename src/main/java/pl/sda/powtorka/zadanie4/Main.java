package pl.sda.powtorka.zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę minimalną:");
        int wagaMin = scanner.nextInt();
        System.out.println("Podaj wagę maksymalną:");
        int wagaMax = scanner.nextInt();

        System.out.println("Podaj wzrost minimalny:");
        int wzrostMin = scanner.nextInt();
        System.out.println("Podaj wzrost maksymalny:");
        int wzrostMax = scanner.nextInt();

        final String formatKomorki = " %-7.2f |";
        int iloscKolumn = (wagaMax - wagaMin) + 1; // +1 ponieważ skrajna lewa kolumna to wzrost

        int iloscPodkreslnikow = iloscKolumn * 10;


        // 70 75 160 165
        // %-5s  %-5s  %-5s  %-5s  %-5s
        String wierszNaglowka = String.format(" %-7s |", " ");
        for (int i = wagaMin; i < wagaMax; i++) {
            wierszNaglowka = wierszNaglowka + String.format(formatKomorki, (double) i);
        }
        System.out.println(wierszNaglowka);
        System.out.println("-".repeat(iloscPodkreslnikow));

        for (int wzrost = wzrostMin; wzrost < wzrostMax; wzrost++) {
            String wierszTabeli = String.format(formatKomorki, (double) wzrost);
            for (int waga = wagaMin; waga < wagaMax; waga++) {
                double wzrostWMetrach = wzrost / 100.0;
                wierszTabeli = wierszTabeli + String.format(formatKomorki, (waga / (wzrostWMetrach * wzrostWMetrach)));
            }
            System.out.println(wierszTabeli);
        }
    }
}
