package ProgramuotojuKlase;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        String duomenys = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\ProgramuotojuKlase\\Duomenys.txt";
        String Rezultatai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\ProgramuotojuKlase\\Rezultatai.txt";

        List<Kriterijai> kriterijai = skaityti1(duomenys);
        List<Programuotijai> programuotijai = skaityti2(duomenys);
        Collections.sort(programuotijai);

        System.out.println(kriterijai);
        System.out.println(programuotijai.toString());
        rasyti(Rezultatai,kriterijai,programuotijai);

    }
    public static List<Kriterijai> skaityti1(String failas) {
        List<Kriterijai> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

                objektas = line.split(" ");
                Integer KiekPateks = Integer.parseInt(objektas[0]);
                Integer KiekVietu = Integer.parseInt( objektas[1]);
                Kriterijai obj = new Kriterijai(KiekPateks,KiekVietu);
                objektuMasyvas.add(obj);

        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }



    public static List<Programuotijai> skaityti2(String failas) {
        List<Programuotijai> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
//            objektas2 = line.split(" ");
            line = br.readLine();

            while (line != null) {
                objektas = line.split(" ");

                String vardasPav = objektas[0];
                Integer kriterijus = Integer.parseInt( objektas[1]);



                Programuotijai obj = new Programuotijai(vardasPav,kriterijus);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

    public static void rasyti(String duomenys,List<Kriterijai> krit,List<Programuotijai> mokiniai){
        try (BufferedWriter output =new BufferedWriter(new FileWriter(duomenys))){
            output.write("Sudarytos klasės mokinių sąrašas:\n");
            for (int i = 0; i < krit.get(0).getKiekPateks(); i++) {

                output.write(String.format("%4d" , (i+1) ));
                output.write(String.format("%-15s",":  "+mokiniai.get(i).toString()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
