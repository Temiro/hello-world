package ButoPajieska;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        String faile = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\ButoPajieska\\Duomenys.txt";
        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\ButoPajieska\\Kriterijai.txt";
        List<Butas> butoMasyvas = skaityti1(faile);
        Kriterijai krit = skaityti2(file);

    }

    public static List<Butas> skaityti1(String failas) {
        List<Butas> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {
                objektas = line.split(" ");

                Integer butoNr = Integer.parseInt(objektas[0]);
                String butoAdresas = objektas[1]+objektas[2]+objektas[3];
                Integer kambariuSk = Integer.parseInt(objektas[4]);
                Double kvadratura = Double.parseDouble(objektas[5]);
                Double nuomosKaina = Double.parseDouble(objektas[6]);


                Butas obj = new Butas(butoNr,butoAdresas,kambariuSk,kvadratura,nuomosKaina);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

    public static Kriterijai skaityti2(String file) {

        String[] objektas = null;
        Kriterijai krit = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line1 = br.readLine();
            objektas = line1.split(" ");
            Integer minKambSk = Integer.parseInt(objektas[0]);
            Integer maxKambSk = Integer.parseInt(objektas[1]);

            String line2 = br.readLine();
                objektas = line1.split(" ");
                Double minKvSk = Double.parseDouble(objektas[0]);
                Double maxKvSk = Double.parseDouble(objektas[1]);

            String line3 = br.readLine();
                objektas = line1.split(" ");
                Double minKain = Double.parseDouble(objektas[0]);
                Double maxKain = Double.parseDouble(objektas[1]);


            krit = new Kriterijai(minKambSk,maxKambSk,minKvSk,maxKvSk,minKain,maxKain);

        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return krit;
    }
}
