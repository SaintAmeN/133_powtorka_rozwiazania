package pl.sda.powtorka.zadanie1;

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
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String wpisaneImie = scanner.nextLine();

        String poObcięciu = wpisaneImie.replace(".", " ").trim();
        if (IMIONA_DOZWOLONE.contains(poObcięciu)) {
            System.out.println("Znaleziono dopasowanie");
        } else {
            System.out.println("Brak dopasowania");
        }
    }
}