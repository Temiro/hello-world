package AA__TiesiniaiAlgoritmai.Taupikle;

import AA__TiesiniaiAlgoritmai.Taupyklė.Pinigai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Maiinas {
    public static void main(String[] args) {
        String failas ="C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Taupyklė\\Duomenys.txt";
        String failasRezultatai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Taupyklė\\Rezultatai.txt";


        List<Pinigai> duomenys = skaitymas(failas);
        List<Pinigai> sudetu = sudetu(duomenys);
        rasyti(failasRezultatai,sudetu);

        System.out.println(duomenys);
        System.out.println(sudetu.get(0).getCentai());
        //Taupyklėje yra 6.25 Lt.

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
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return piniguListas;
    }

    public static List<Pinigai> sudetu(List<Pinigai> duomenys){
        List<Pinigai> sudetas = new ArrayList<>();
        Double centukai = duomenys.get(0).getCentukai()*duomenys.get(0).getCentai()*0.01;
        Double centai = centukai + duomenys.get(1).getCentukai()*duomenys.get(1).getCentai()*0.1;
        Double eurai = centai + duomenys.get(2).getCentukai()*duomenys.get(2).getCentai();
        Pinigai obj = new Pinigai(eurai,eurai);
        sudetas.add(obj);
        return sudetas;
    }

    public static void rasyti(String failas, List<Pinigai> duomenys){
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))){

            output.write("Taupyklėje yra "+duomenys.get(0).getCentukai()+" Lt.");
            System.out.println("Taupyklėje yra "+duomenys.get(0).getCentukai()+" Lt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
