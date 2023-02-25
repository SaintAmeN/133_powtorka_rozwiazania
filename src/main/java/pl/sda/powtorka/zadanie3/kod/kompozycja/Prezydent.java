package pl.sda.powtorka.zadanie3.kod.kompozycja;

import pl.sda.powtorka.zadanie3.kod.kompozycja.interfejsy.IObywatel;

public class Prezydent implements IObywatel {
    private Obywatel obywatel;

    private int lataUrzedowaniaOd;
    private int lataUrzedowaniaDo;

    @Override
    public String getImie() {
        return this.obywatel.getImie();
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jam jest Twój prezydent!");
    }
}