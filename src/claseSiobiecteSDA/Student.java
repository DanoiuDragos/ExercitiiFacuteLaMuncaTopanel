package src.claseSiobiecteSDA;


import java.time.LocalDate;

//2.Definiti clasa Student ce contine: nume, prenume, varsta, anulAbsolvirii, medie.
// Scrieti un program care citeste de la tastatura un numar
//n - numarul studentilor, creati un vector de studenti si setati pentru fiecare student campurile respectice.
//a) Afisati toti studentii.
//b) Scrieti o functie care cauta un student dupa nume si il afiseaza;
//c) afisati studentul cu media cea mai mare;
//d) verificati daca anul absolvirii pentru un student anume este an bisect.
public class Student {
    //Declarare campuri(proprietati specifice clasei)
        public String nume;
        public String prenume;
        public int varsta;
        public LocalDate dataAbsolvirii;
        public double medie;
        public boolean integralist;

        //Declarare constructor fara parametri(conctructor default autogenerat de Java daca nu exista alt constructor)
        public Student() {
        }

        //Declarare constructor cu parametri
        public Student(String nume, String prenume, int varsta, LocalDate dataAbsolvirii, double medie, boolean integralist) {
            this.nume = nume;
            this.prenume = prenume;
            this.varsta = varsta;
            this.dataAbsolvirii = dataAbsolvirii;
            this.medie = medie;
            this.integralist = integralist;
        }

        //functie de afisare pentru clasa Student
        public void afisareStudent() {
            System.out.println("Studentul: nume= " + this.nume + " prenume= " + this.prenume);
            System.out.print(" varsta=" + this.varsta);
            System.out.print(" medie=" + this.medie);
            System.out.print(" dataAbsolvirii=" + this.dataAbsolvirii);
            System.out.print(" integralist=" + this.integralist);
            System.out.println();
        }
}

