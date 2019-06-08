package com.java26.alg.zad2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            lista.add(generator.nextInt(1000));

        }
        double suma = 0;
        for (Integer element : lista) {
            suma += element;
        }
        System.out.println("Suma  " + suma);
        System.out.println("Srednia" + (suma / lista.size()));

        // kopia listy
        List<Integer> lista2 = new ArrayList<>(lista);
        //  lista2.addAll(lista);
        System.out.println(lista2);
        Collections.sort(lista2);
        System.out.println(lista2);

        if (lista2.size() % 2 == 0) {
            int indexLewySrodkowy = lista2.size() / 2 - 1;
            int indexPrawySrodkowy = lista2.size() / 2;
            double mediana = (lista.get(indexLewySrodkowy) + lista2.get(indexPrawySrodkowy)) / 2.0;
            System.out.println("Mediana: " + mediana);
        } else {
            int indexSrodkowy = lista2.size() / 2;
            double mediana = (lista.get(indexSrodkowy));
            System.out.println("Mediana: " + mediana);
        }
        int min = lista.get(0), max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) > max) max = lista.get(i);
            if (lista.get(i) < min) min = lista.get(i);
        }
        System.out.println(max);
        System.out.println(min);

        //znajdowanie indeksy maksymalnego elementu
        int indekMAx = 0;
        int indeksMin = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (max == lista.get(i)) {
                indekMAx = i;
            }
            if (min == lista.get(i)) {
                indeksMin = i;
            }
        }
        System.out.println(indekMAx);
        System.out.println(indeksMin);

        //znajdowanie indeksow max

        System.out.println(lista.indexOf(max));
        System.out.println(lista.indexOf(min));

    }
}
