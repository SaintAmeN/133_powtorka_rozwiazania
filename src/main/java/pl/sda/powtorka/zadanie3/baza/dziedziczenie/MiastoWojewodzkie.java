package pl.sda.powtorka.zadanie3.baza.dziedziczenie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MiastoWojewodzkie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String nazwa;
    private String kodPocztowy;
    private double dlGeogr, szGeogr;
    private int iloscMieszkancow;

    @ManyToOne
    private Prezydent prezydent;

    @OneToMany
    private List<Osiagniecie> osiagniecia;

    @OneToMany
    private List<Obywatel> obywatele;
}
