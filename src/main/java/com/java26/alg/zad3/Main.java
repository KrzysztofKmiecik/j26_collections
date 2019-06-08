package com.java26.alg.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Student> listaStudentow = new ArrayList<Student>();

        listaStudentow.add(new Student("1", "Jan", "Kowalski", Plec.MEZCZYZNA));
        listaStudentow.add(new Student("2", "Ala", "Kowalska", Plec.KOBIETA));
        listaStudentow.add(new Student("3", "Tomasz", "Kowalski", Plec.MEZCZYZNA));
        listaStudentow.add(new Student("3", "Tomasz", "Kowalski", Plec.MEZCZYZNA));
        listaStudentow.add(new Student("3", "Tomasz", "Kowalski", Plec.MEZCZYZNA));
        listaStudentow.add(new Student("3", "Tomasz", "Kowalski", Plec.MEZCZYZNA));


        for (Student student : listaStudentow) {
            System.out.println(student);
        }
        System.out.println("Tylko mezczyzni");
        for (Student student : listaStudentow) {
            if (student.getPlec() == Plec.MEZCZYZNA)
                System.out.println(student);
        }
        System.out.println("Tylko kobiety");
        for (Student student : listaStudentow) {
            if (student.getPlec() == Plec.KOBIETA)
                System.out.println(student);
        }

        System.out.println("Tylko indeksy");

        for (Student student : listaStudentow) {

            System.out.println(student.getNr_indexu());
        }
    }
}
