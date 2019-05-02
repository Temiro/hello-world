package Masynos;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mainas implements Skaiciavimai {
    public static void main(String[] args) {

        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Masynos\\Masynu_Duomenys.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Masynos\\Atsakymai.txt";

        List <Car> carMasyvas = skaityti(file);
// todo GERAS SITAS

        carMasyvas.add(new Car("BMW", "320", 2007, 4500, 2.0, "B"));

        List <Car> carMasyvas2 = new ArrayList<>();

//        carMasyvas2.add(new Car());
        carMasyvas2.add(new Car("BMW", "320", 2007, 4500, 2.0, "B"));
        carMasyvas2.add(new Car("Audi", "B6", 2003, 2200, 1.9, "D"));

        carMasyvas.addAll(carMasyvas2);

        rasyti(atsakymai, carMasyvas);
        seniausiaMasyna(carMasyvas);

        int[] ppp   = masynosTar2_2010(carMasyvas);
//        System.out.println(ppp[0]+"222222222");

    }

    public static List<Car> skaityti(String failas) {
        List<Car> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {
                objektas = line.split(" ");

                String gamintojas = objektas[0];
                String modelis = objektas[1];
                Integer metai = Integer.parseInt(objektas[2]);
                Integer kaina = Integer.parseInt(objektas[3]);
                Double variklioTuris = Double.parseDouble(objektas[4]);
                String kuroTipas = objektas[5];

                Car obj = new Car(gamintojas, modelis, metai, kaina, variklioTuris, kuroTipas);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

    public static void rasyti(String failas, List<Car> carMasyvas) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for (int i = 0; i < carMasyvas.size(); i++) {
                output.write(carMasyvas.get(i).toString());
            }
            output.write("------------------------------------\n");
            output.write("Seniausia masyna Yra \n" + carMasyvas.get(seniausiaMasyna(carMasyvas)));
            output.write("------------------------------------\n");
            output.write("naujausia masyna Yra \n");
            for (int i = 0; i < carMasyvas.size(); i++) {

                if (naujausiaMasina(carMasyvas).equals(carMasyvas.get(i).getMetai())) {
                    output.write("" + carMasyvas.get(i));
                }
            }
            output.write("------------------------------------\n");
            output.write("Naujesne nei 2010\n"
            );
            for (int i = 0; i < masynosTar2_2010(carMasyvas).length; i++) {
                    output.write(carMasyvas.get(masynosTar2_2010(carMasyvas)[i]).toString());
            }
            output.write("------------------------------------\n");
            output.write("Naujesne nei 2000 is senesni nei 2010\n");
            for (int i = 0; i < carMasyvas.size(); i++) {
                if (carMasyvas.get(i).getMetai() >= 2000 && carMasyvas.get(i).getMetai() <= 2010) {
                    output.write("" + carMasyvas.get(i));
//                    System.out.println(carMasyvas[i]);

                }
            }
            output.write("------------------------------------\n");
            output.write("Visi VW automobiliai\n");
            for (int i = 0; i < carMasyvas.size(); i++) {
                if (carMasyvas.get(i).getGamintojas().equals(carMasyvas.get(0).getGamintojas())) {
                    output.write("" + carMasyvas.get(i));
                }
            }
            output.write("------------------------------------\n");
            output.write("Didziausia turi turintys automobilis\n");
            output.write("" + carMasyvas.get(didziausiasTuris(carMasyvas)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Nebereikia sito daikto

    //    public static Car[] pridetiCar(List<Car> products, Car productToAdd) {
    //        Car[] newProducts = new Car[products.size() + 1];
    //        System.arraycopy(products, 0, newProducts, 0, products.size());
    //        newProducts[newProducts.length - 1] = productToAdd;
    //        return newProducts;
    //    }


    public static int[] masynosTar2_2010(List<Car> carMasyvas) {
        int[] v = {};
        for (int i = 0; i < carMasyvas.size(); i++) {
            if (carMasyvas.get(i).getMetai() >= 2010) {
                v = Arrays.copyOf(v, v.length + 1);
                v[v.length - 1] = i;
            }
        }

        return v;
    }

    public static Integer seniausiaMasyna(List<Car> carMasyvas) {
        Integer koksSkaicius = carMasyvas.get(0).getMetai();
        Integer kelintas = 0;
        for (int i = 0; i < carMasyvas.size(); i++) {
            if (carMasyvas.get(i).getMetai() < koksSkaicius) {
                koksSkaicius = carMasyvas.get(i).getMetai();
                kelintas = i;
            }
        }
        return kelintas;
    }

    public static Integer naujausiaMasina(List<Car> carMasyvas) {
        Integer koksSkaiciuss = carMasyvas.get(0).getMetai();
        for (int i = 0; i < carMasyvas.size(); i++) {
            if (carMasyvas.get(i).getMetai() > koksSkaiciuss) {
                koksSkaiciuss = carMasyvas.get(i).getMetai();
            }
        }
        return koksSkaiciuss;
    }

    public static Integer[] naujesnisnie2010(List<Car> carMasyvas) {
        Integer koksSkaiciuss = 2010;
        Integer darVienas = 0;
        Integer[] series = {};
        for (int i = 0; i < carMasyvas.size(); i++) {
            if (carMasyvas.get(i).getMetai() >= koksSkaiciuss) {
                series = new Integer[i];
                koksSkaiciuss = carMasyvas.get(i).getMetai();
                darVienas = i;
            }
        }
        System.out.println("-------------------------------");
        System.out.println(series);
        System.out.println("-------------------------------");
        return series;
    }

    public static Integer didziausiasTuris(List<Car> carMasyvas) {
        Double maziausias = carMasyvas.get(0).getVariklioTuris();
//        Double darVienas = 0;
        Integer darVienas = 0;
        for (int i = 0; i < carMasyvas.size(); i++) {
            if (carMasyvas.get(i).getVariklioTuris() > maziausias) {
                darVienas = i;

            }
        }
        return darVienas;
    }

}

