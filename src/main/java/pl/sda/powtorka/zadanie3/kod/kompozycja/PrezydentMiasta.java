package pl.sda.powtorka.zadanie3.kod.kompozycja;

import pl.sda.powtorka.zadanie3.kod.kompozycja.interfejsy.IObywatel;

import java.util.List;

public class PrezydentMiasta implements IObywatel {
    private Prezydent prezydent;

    private MiastoWojewodzkie miasto;
    private List<Osiagniecie> osiagniecia;

    @Override
    public String getImie() {
        return prezydent.getImie();
    }
}
