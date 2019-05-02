package Listas;

import java.util.*;
//import

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Check<T> {

    int sort(T e1, T e2);
}

public class Mainas {
    public static void main(String[] args) {
        Container<Empleyee> box = new Container<>();
        box.add(new Empleyee("Pertras", 1000));
        box.add(new Empleyee("Stasys", 1200));
        box.add(new Empleyee("Jonas", 1100));
        System.out.println();

        for(int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
//        filter(box.selectionSort(box));
        System.out.println();
        List<Empleyee> empleyees = new ArrayList<>();

//        List<Integer> skaiciuMasyvas = new ArrayList<>();
//        skaiciuMasyvas.add(1);
//        skaiciuMasyvas.add(2);


        empleyees.add(new Empleyee("Kamile", 12000));
        empleyees.add(new Empleyee("Rasa", 12600));
        empleyees.add(new Empleyee("Onute", 11009));
//        tuscias.forEach((employee) -> System.out.println(employee));

        Check<Empleyee> check = ((e1, e2) -> {
            return e1.getSalary().compareTo(e2.getSalary());
        });

//        tuscias.sort((Employee e1, Employee e2) -> (int) (e1.getSalary() - e2.getSalary()));
//        tuscias.forEach((employee) -> System.out.println(employee));
//        tuscias.iterator();

        filterByFilter(box, check);

        for(int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i).toString());
        }
    }


    public static void filterByFilter(Container<Empleyee> list, Check<Empleyee> filter) {
        Integer min = 0;
        for(int i = 0; i < list.size(); i++) {
            min = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(filter.sort(list.get(i), list.get(j)) >= 0){
                    min = j;
                }
            }
            if (i != min) {
                Empleyee temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }

}
