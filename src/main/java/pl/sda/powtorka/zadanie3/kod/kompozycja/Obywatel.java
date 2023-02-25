package pl.sda.powtorka.zadanie3.kod.kompozycja;

import pl.sda.powtorka.zadanie3.kod.dziedziczenie.Opinia;
import pl.sda.powtorka.zadanie3.kod.kompozycja.interfejsy.IObywatel;

import java.util.List;

public class Obywatel implements IObywatel {
    private String imie, nazwisko;
    private List<Opinia> opinie;

    @Override
    public String getImie() {
        return imie;
    }
}