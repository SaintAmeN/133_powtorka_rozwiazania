package pl.sda.powtorka.zadanie4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private final Long id;
    private final String imie;
    private final String nazwisko;
    private final int wiek;
}
