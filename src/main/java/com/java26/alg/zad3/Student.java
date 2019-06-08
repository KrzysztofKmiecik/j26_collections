package com.java26.alg.zad3;

public class Student {
   private String nr_indexu;
   private String imie;
   private String nazwisko;
   private Plec plec;

    @Override
    public String toString() {
        return "Student{" +
                "nr_indexu='" + nr_indexu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
    }

    public Student(String nr_indexu, String imie, String nazwisko, Plec plec) {
        this.nr_indexu = nr_indexu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getNr_indexu() {
        return nr_indexu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }
}
