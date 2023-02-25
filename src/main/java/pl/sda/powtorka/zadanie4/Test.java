package pl.sda.powtorka.zadanie4;

public class Test {
    public static void main(String[] args) {
        String imie = "ala";

        imie += " ma kota"; // 11 znaków - przepisanie = O(n)

        int n = 100;
        StringBuilder tekst = new StringBuilder();
        for (int i = 0; i < n; i++) {   // O(n)
            tekst.append(" ").append(i);           // O(m)
        }

        // O(n*m) gdzie n to ilość obiegów, m to długość najdłuższego ciągu znaków
    }
}
