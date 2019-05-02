package NamuDarbai;

import Masynos.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Mainas {
    public static void main(String[] args) {

        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\NamuDarbai\\Masinos.txt";
        String files = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\NamuDarbai\\DarbuotojuDuomenys.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\NamuDarbai\\Atsakymai.txt";

        List<Masina> masinosMasyvas = skaityti(file);
        List<Zmones> zmoniuMasyvas = skaityti2(files);
        Map<String, List<Masina>> sujungtas;
// ( masinosMasyvas ,zmoniuMasyvas )






    }
    public static List<Masina> skaityti(String failas) {
        List<Masina> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {
                objektas = line.split(" ");

                String marke = objektas[0];
                String numeriai = objektas[1];


                Masina obj = new Masina (marke,numeriai);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

    public static List<Zmones> skaityti2(String failas) {
        List<Zmones> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {
                objektas = line.split(" ");

                String vardas = objektas[0];
                String pavarde = objektas[1];
                String numeriai = objektas.length == 3 ? objektas[2]: " ";


                Zmones obj = new Zmones (vardas, pavarde ,numeriai);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

//    Map<Zmones, List<Masina>> sujungtas;

//    public static Map<Zmones, List<Masina>>
//    sujungtas(List<Zmones> zmogus,List<Masina> masina){
//
//        for (int i = 0; i < zmogus.size(); i++) {
//            if (zmogus.get(i).)
//            if (zmogus.get(i).)
//
//        }
//
//    }


}
