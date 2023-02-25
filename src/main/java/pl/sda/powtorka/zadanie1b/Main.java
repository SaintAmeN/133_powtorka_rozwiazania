package pl.sda.powtorka.zadanie1b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
        List<String> listaImionPasujących = new ArrayList<>();      // lista imion które mają dopasowania

        for (int i = 0; i < iloscLiniiInt; i++) {
            System.out.println("Podaj imie:");
            String wpisaneImie = scanner.nextLine();
            String poObcięciu = wpisaneImie.replace(".", " ").trim();

            listaImionPodanych.add(poObcięciu);
        }

        for (int i = 0; i < listaImionPodanych.size(); i++) {
            if (IMIONA_DOZWOLONE.contains(listaImionPodanych.get(i))) {
                listaImionPasujących.add(listaImionPodanych.get(i));
            }
        }

        System.out.println("Znaleziono dopasowanie dla: " + listaImionPasujących);
    }
}