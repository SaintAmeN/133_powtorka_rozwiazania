package pl.sda.powtorka.zadanie2b;

public class Choinka {
    private int rozmiar;
    private String znakChoinki;
    private String znakBombki;

    private double prawdopodobieństwoBombki;

    public Choinka(int rozmiar, String znakChoinki, String znakBombki, double prawdopodobieństwoBombki) {
        this.rozmiar = rozmiar;
        this.znakChoinki = znakChoinki;
        this.znakBombki = znakBombki;
        this.prawdopodobieństwoBombki = prawdopodobieństwoBombki;
    }

    void wypisz() {
        for (int i = 0; i < rozmiar; i++) {            // wiersz po wierszu
            System.out.println(wypiszWiersz(i));
        }
    }

    String losowosc() {
        if (prawdopodobieństwoBombki <= Math.random()) {
            return znakBombki;
        }
        return znakChoinki;
    }

    String wypiszWiersz(int obecnyWiersz) {
        String linia = " ".repeat((rozmiar - 1) - obecnyWiersz);
        for (int j = rozmiar - obecnyWiersz; j < rozmiar; j++) {
            linia = linia + losowosc();
        }
        linia += "|";
        for (int j = rozmiar - obecnyWiersz; j < rozmiar; j++) {
            linia = linia + losowosc();
        }
        return linia;
    }
}
