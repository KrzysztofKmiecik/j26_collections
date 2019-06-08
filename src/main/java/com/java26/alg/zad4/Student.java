package com.java26.alg.zad4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> listaOcenStudenta=new ArrayList<>();
    private String numerIndeksuStudenta;
    private String imieStudenta;
    private String nazwiskoStudenta;

    public void setNazwiskoStudenta(String nazwiskoStudenta) {
        this.nazwiskoStudenta = nazwiskoStudenta;
    }



    public List<Double> getListaOcenStudenta() {
        return listaOcenStudenta;
    }

    public String getNumerIndeksuStudenta() {
        return numerIndeksuStudenta;
    }

    public String getImieStudenta() {
        return imieStudenta;
    }

    public String getNazwiskoStudenta() {
        return nazwiskoStudenta;
    }



    public Student( String numerIndeksuStudenta, String imieStudenta, String nazwiskoStudenta) {
        this.numerIndeksuStudenta = numerIndeksuStudenta;
        this.imieStudenta = imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
    }
}
