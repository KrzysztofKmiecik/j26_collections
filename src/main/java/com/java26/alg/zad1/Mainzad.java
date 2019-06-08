package com.java26.alg.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mainzad {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        Random generator=new Random();
        List<Integer> lista=new ArrayList<Integer>();

        System.out.println("Ile ma w scannerze");
        int iliscObiegowScannera=input.nextInt();
        System.out.println("Ile ma w random");
        int iliscObiegowRandom=input.nextInt();

        while (iliscObiegowScannera -- >0){
            System.out.println("Podaj liczbe");
            int liczbaZaladowana=input.nextInt();
            lista.add(liczbaZaladowana);
        }

        while(iliscObiegowRandom-- >0){
            int liczbaZaladowana=generator.nextInt(1000);
            lista.add(liczbaZaladowana);
        }
        System.out.println(lista);

        double suma=0;
        for(Integer element:lista){
            suma+=element;
        }
        System.out.println("Suma  "+suma);
        System.out.println("Srednia"+(suma/lista.size()));
    }
}
