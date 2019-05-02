package AA__TiesiniaiAlgoritmai.Taupyklė;

import jdk.dynalink.linker.LinkerServices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String failas ="C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Taupyklė\\Duomenys.txt";
        String failasRezultatai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Taupyklė\\Rezultatai.txt";


        List<Pinigai> duomenys = skaitymas(failas);

        System.out.println(duomenys);

    }

    public static List<Pinigai> skaitymas(String failas){
        List<Pinigai> piniguListas = new ArrayList<>();
        String[] objektas= null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))){
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");

                Double pirmas = Double.parseDouble(objektas[objektas.length - 3]);
                Double antras = Double.parseDouble(objektas[objektas.length - 1]);

                Pinigai obj= new Pinigai(pirmas,antras);
                System.out.println(obj);
                piniguListas.add(obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return piniguListas;
    }


}
