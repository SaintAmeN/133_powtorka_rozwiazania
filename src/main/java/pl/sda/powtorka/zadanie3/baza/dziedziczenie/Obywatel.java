package pl.sda.powtorka.zadanie3.baza.dziedziczenie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Obywatel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String imie, nazwisko;

    @OneToMany
    protected List<Opinia> opinie;
}

