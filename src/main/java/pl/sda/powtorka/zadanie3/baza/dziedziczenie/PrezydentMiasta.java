package pl.sda.powtorka.zadanie3.baza.dziedziczenie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  // Jak dziedziczenie ma wpływać na budowę tabel
@SuperBuilder       // zamiast builder, odwołuje się do pól klasy nadrzędnej
@NoArgsConstructor
@AllArgsConstructor
public class PrezydentMiasta extends Prezydent {

    @ManyToOne
    private MiastoWojewodzkie miasto;

    @OneToMany
    private List<Osiagniecie> osiagniecia;
}
