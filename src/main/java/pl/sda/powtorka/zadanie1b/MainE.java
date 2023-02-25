package pl.sda.powtorka.zadanie1b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainE {
    // Note: nie wolono Ci zmieniać tej części kodu
    private static final List<String> IMIONA_DOZWOLONE = List.of(
            "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz"
    );

    public static void main(String[] args) {
        /**
         * Użytkownik ma możliwość podania jednego imienia. Powinien być o nie zapytany. Po
         * wpisaniu imienia weryfikujemy, czy lista IMIONA_DOZWOLONE zawiera wpisane imię.
         * Uwaga! użytkownik może wpisać imię ze spacją na początku lub na końcu, a także kropką. Te
         * znaki powinny być zignorowane.
         *
         * Użytkownik ma możliwość wpisania liczby (np. 3). Następnie program zapyta go o imiona
         * (użytkownik powinien najpierw podać wszystkie imiona, a dopiero potem przechodzimy do ich
         * weryfikacji).
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość linii:");
        String iloscLinii = scanner.nextLine();

        int iloscLiniiInt = Integer.parseInt(iloscLinii);

        List<String> listaImionPodanych = new ArrayList<>();        // lista imion które podaliśmy

        for (int i = 0; i < iloscLiniiInt; i++) {
            System.out.println("Podaj imie:");
            String wpisaneImie = scanner.nextLine();

            String wynik = wpisaneImie;
            while (wynik.endsWith(".")) {
                int indexOfKropka = wynik.lastIndexOf('.');
                wynik = wynik.substring(0, indexOfKropka);
            }

            listaImionPodanych.add(wynik.strip());
        }

        System.out.print("Znaleziono dopasowanie dla: ");
        for (int i = 0; i < listaImionPodanych.size(); i++) {
            if (IMIONA_DOZWOLONE.contains(listaImionPodanych.get(i))) {
                System.out.print(listaImionPodanych.get(i) + " ");
            }
        }

    }
}