package com.java26.alg.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        Random generator=new Random();
        List<Integer> lista=new ArrayList<Integer>();

        for (int i=0;i<5;i++){
            System.out.println("Podaj liczbe");
            int liczbaZaladowana=input.nextInt();
            lista.add(liczbaZaladowana);
        }
        for (int i=0;i<5;i++){
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
