package com.java26.alg.zad4;

import java.util.*;
/*
 - posiadać (jako pole) mapę Studentów.  //#(co powinno być kluczem?)
    - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
    - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
    - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta, a w wyniku zwraca konkretnego studenta.
    - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
    - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
    - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.
 */


public class Dziennik {

    private Map<String, Student> studentMap = new HashMap<>();

    public void dodajStudenta(Student student) {
        studentMap.put(student.getNumerIndeksuStudenta(), student);
    }

    public void usunStudenta(Student student) {
        studentMap.remove(student.getNumerIndeksuStudenta());
    }

    public void usunStudenta(String index) {
        studentMap.remove(index);
    }

    public Optional<Student> zwrocStudenta1(String indeks){
        if (studentMap.containsKey(indeks)){
            return Optional.ofNullable(studentMap.get(indeks));
        }
        return Optional.empty();
    }
    public Student zwrocStudenta2_zle(String indeks) {
        if (studentMap.containsKey(indeks)){
            return studentMap.get(indeks);
        }
        return null;
    }
    //opcja 2 rzuc expetion
    public Student zwrocStudenta2(String indeks) throws StudentNotFoundException{
        if (studentMap.containsKey(indeks)){
            return studentMap.get(indeks);
        }
        throw new StudentNotFoundException("Student with this id wasn't found");
    }
    public double podajSrednia(String indeks) throws StudentNotFoundException{
        double sum =0.0;
        Student studentKtoregoSredniaLiczmy=zwrocStudenta2(indeks);
        for (Double ocena:studentKtoregoSredniaLiczmy.getListaOcenStudenta() ){
            sum+=ocena;
        }
        return sum/studentKtoregoSredniaLiczmy.getListaOcenStudenta().size();

    }

    public List<Student> zwrocZagrozonych() {
        List<Student> listaWynikowa = new ArrayList<>();
        Set<String> kopiaIndeksow=new HashSet<>(studentMap.keySet());
     //  for (String indeks : studentMap.keySet()) {//na orginale
       for (String indeks : kopiaIndeksow) {//na kopii
            try {
                if (podajSrednia((indeks)) <= 2.0) {
                    listaWynikowa.add(studentMap.get(indeks));
                }
            } catch (StudentNotFoundException e) {
                System.out.println("Nie mozna znalesc studenta");
                //  e.printStackTrace();
            }
        }
        return listaWynikowa;
    }
    public List<Student> zwrocPosortowanaListeStudentow(){
        //kopiuje wszystkich studentow z mapy (wartosci) do listy
        List<Student> studentList=new ArrayList<>(studentMap.values());
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //1 o1>02
                //0 ==
                //-1 o1<o2
               int indeks1=Integer.parseInt((o1.getNumerIndeksuStudenta()));
               int indeks2=Integer.parseInt((o2.getNumerIndeksuStudenta()));

                return Integer.compare(indeks1,indeks2);

            }
        });
        return studentList;
    }


}
