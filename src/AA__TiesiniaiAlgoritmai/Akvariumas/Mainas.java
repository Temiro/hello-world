package AA__TiesiniaiAlgoritmai.Akvariumas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        String failas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Akvariumas\\Duomenys.txt";
        String failasRasymui = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Akvariumas\\Rezultatai.txt";

        List<Zuvis> nuskaityti = skaitymas(failas);
        Integer suam = kiekZuvuBus(nuskaityti);
        rasyti(failasRasymui,nuskaityti,suam);
        System.out.println(nuskaityti);
        System.out.println(kiekZuvuBus(nuskaityti));
    }

    public static List<Zuvis> skaitymas(String failas) {
        List<Zuvis> zuvuListas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
//            while (line != null){
            objektas = line.split(" ");
            Integer kiekYra = Integer.parseInt(objektas[objektas.length - 1]);
            line = br.readLine();
            line = br.readLine();
            objektas = line.split(" ");

            Integer kiekIdedamaKekvienaDiena = Integer.parseInt(objektas[objektas.length - 1]);
            line = br.readLine();
            objektas = line.split(" ");

            Integer poKiekIdedama = Integer.parseInt(objektas[objektas.length - 1]);

            Zuvis obj= new Zuvis(kiekYra,kiekIdedamaKekvienaDiena,poKiekIdedama);
            zuvuListas.add(obj);
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return zuvuListas;
    }

    public static Integer kiekZuvuBus(List<Zuvis> zuvites){
        Integer zuvis = 0;

        zuvis = zuvites.get(0).getKiekYra() + zuvites.get(0).getPoKiekIdedama()*zuvites.get(0).getPoKiekIdedama();

        return zuvis;
    }

    public static void rasyti(String failas,List<Zuvis> zuvites, Integer suma){
        try(BufferedWriter output = new BufferedWriter(new FileWriter(failas))){
//            output.write(" Po 3 dienų akvariume gyvens 14\n" +
//                    "žuvų.");
            output.write("Po "+ zuvites.get(0).getPoKiekIdedama()+" dienų akvariume gyvens "+suma+" žuvų.");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
