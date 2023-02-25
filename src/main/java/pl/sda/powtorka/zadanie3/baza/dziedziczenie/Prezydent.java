package pl.sda.powtorka.zadanie3.baza.dziedziczenie;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  // Jak dziedziczenie ma wpływać na budowę tabel
@SuperBuilder       // zamiast builder, odwołuje się do pól klasy nadrzędnej
@NoArgsConstructor
@AllArgsConstructor
public class Prezydent extends Obywatel {
    protected int lataUrzedowaniaOd;
    protected int lataUrzedowaniaDo;
}


