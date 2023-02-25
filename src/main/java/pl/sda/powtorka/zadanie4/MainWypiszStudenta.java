package pl.sda.powtorka.zadanie4;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

public class MainWypiszStudenta {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L, "Paweł", "Gaweł", 23));
        list.add(new Student(2L, "Marek", "Cezarek", 13));
        list.add(new Student(3L, "Marek", "Jarek", 15));
        list.add(new Student(4L, "Marian", "Mariański", 52));

        /**
         *   Id       Imie        Nazwisko      Wiek
         *   1        Marek       Cezarek       23
         *   2        Marek       Jarek         15
         */

        System.out.printf("%-5s %-10s %-10s %-5s\n", "Id", "Imie", "Nazwisko", "Wiek");
        for (Student student : list) {
            System.out.printf("%-5s %-10s %-10s %-5s\n",
                    student.getId(),
                    student.getImie(),
                    student.getNazwisko(),
                    student.getWiek());
        }
    }
}
