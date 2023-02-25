package pl.sda.powtorka.zadanie3.kod.kompozycja.interfejsy;

public interface IObywatel {
    String getImie();

    default void przedstawSie(){
        System.out.println("Siema siema jestem " + getImie());
    }
}
