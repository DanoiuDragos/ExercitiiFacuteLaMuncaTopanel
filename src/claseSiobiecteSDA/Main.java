package src.claseSiobiecteSDA;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Declarare  student
        Student s1 = new Student();
        s1.afisareStudent();

        //Declarare Student folosind constructor cu paramnetri
        Student s2 = new Student("Popescu", "Andrei", 22, LocalDate.of(2023, 7, 1), 9.5, true);
        Student s3 = new Student("Danoiu", "Dragos", 22, LocalDate.of(2024, 6, 22), 5.5, true);
        s2.afisareStudent();
        s3.afisareStudent();
    }
}

