package AA__TiesiniaiAlgoritmai.Statybininkas;

import java.io.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        String duomenys = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Statybininkas\\Duomenys.txt";
        String rrezultatai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Statybininkas\\Rezultatai.txt";

        List<Statybininkas> nuskaityti = skaityti(duomenys);
        System.out.println(nuskaityti.toString());
        Integer kiekis = kiekis(nuskaityti,0.1,0.2);
        System.out.println(kiekis);
        Double kaina = kaina(nuskaityti,kiekis,0.5);
        System.out.println(kaina);
        rasyti(rrezultatai,kiekis,kaina);

//        kiekis--
//        kaina

    }
    public static void rasyti(String failas, Integer kiekis,Double kaina){
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))){
            output.write("Plytų kiekis: "+ kiekis+"\n");
            output.write("Plytos kainuos "+ kaina+" Lt\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Double kaina(List<Statybininkas> listas,Integer kiekis, Double kainaaa){

        Double kaina = kiekis * kainaaa;

        kaina = Double.parseDouble(new DecimalFormat("##.##").format(kaina));
        return kaina;
    }

    public static Integer kiekis(List<Statybininkas> listas, Double aukstis, Double ilgis){
        Double aukstisKiekis = listas.get(0).getAukstis() / aukstis;
        Double ilgisKiekis = listas.get(0).getIlgis() / ilgis;

        Double visi = aukstisKiekis*ilgisKiekis;
        Integer i = visi.intValue();
        return i;
    }

    public static List<Statybininkas> skaityti(String failas){
        List<Statybininkas> statibininkuListas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br=new BufferedReader(new FileReader(failas))){
            String line= br.readLine();
            while (line != null){
             objektas = line.split(" ");

             Integer ilgis = Integer.parseInt(objektas[objektas.length-2]);
                line= br.readLine();
                objektas = line.split(" ");
             Integer aukstis = Integer.parseInt(objektas[objektas.length-2]);
                line= br.readLine();
                objektas = line.split(" ");
             Double kaina = Double.parseDouble(objektas[objektas.length-2]);
                line= br.readLine();

             Statybininkas obj= new Statybininkas(ilgis, aukstis, kaina);
             statibininkuListas.add(obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return statibininkuListas;
    }
}
