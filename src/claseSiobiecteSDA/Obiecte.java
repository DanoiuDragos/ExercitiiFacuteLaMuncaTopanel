package src.claseSiobiecteSDA;

import java.time.LocalDate;

public class Obiecte {
    public static void main(String[] args) {

        // Definirea obiectelor de tip Student s1, s2, s3
        Student s1 = new Student("Popescu", "Andrei", 22, LocalDate.of(2023, 7, 1), 9.5, true);
        Student s2 = new Student("Iszlai", "Zoltan", 29, LocalDate.of(2022, 8, 1), 8.5, true);
        Student s3 = new Student("Stancu", "Ionut", 26, LocalDate.of(2030, 7, 1), 4.5, false);
        Student s4 = new Student("Dragos", "Danoiu", 26, LocalDate.of(2031, 7, 1), 4.5, false);

        // Definirea vectorului de student
        Student[] students = new Student[4];
        students[0] = s1;   // setarea pe pozitia 0 din vector a studentului s1
        students[1] = s2;   // setarea pe pozitia 1 din vector a studentului s2
        students[2] = s3;   // setarea pe pozitia 2 din vector a studentului s3
        students[3] = s4;   // setarea pe pozitia 3 din vector a studentului s4

        // Afisarea tuturor studentilor (for indexat cu indexul i)
        for (Student value : students) {
            value.afisareStudent();
        }
        // Afisarea studentilor folosind enhanced for
        for (Student student : students) {
            student.afisareStudent();
        }

        // Apelam functia de cautare dupa nume si prenume
        searchStudentByName("Popescu", "Andrei", students);
        searchStudentByName("Test", "Test", students);
        searchStudentByName("Dragos", "Danoiu", students);
    }

    public static void searchStudentByName(String nume, String prenume, Student[] students) {
        boolean foundStudent = false;
        for (Student student : students) {
            if (nume.equals(student.nume) && prenume.equals(student.prenume)) {
                System.out.println("Am gasit studentul cu numele cautat: " + nume + "," + prenume);
                student.afisareStudent();
                foundStudent = true;
            }
        }
        if (!foundStudent) {
            System.out.println("Nu s-a gasit studentul cu nunele cautat." + nume + "," + prenume);
        }
    }
}
