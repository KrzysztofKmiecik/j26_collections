package com.java26.alg.zad4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Dziennik jurnal = new Dziennik();
        Optional<Student> s = jurnal.zwrocStudenta("123");
        if(s.isPresent())

        {
            Student wypakowany = s.get();
            System.out.println(wypakowany);
        }

        Student student = jurnal.zwrocStudenta2_zle("123");
        if(student !=null)

        {
            System.out.println(student.getImieStudenta());
        }
        try

        {
            Student student_2 = jurnal.zwrocStudenta2("123");
            System.out.println(student_2);

        }catch(
                StudentNotFoundException e)

        {
            System.out.println("Nie znaleziono studenta");
        }
    }



}
