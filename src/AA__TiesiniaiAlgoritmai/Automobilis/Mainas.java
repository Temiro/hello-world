package AA__TiesiniaiAlgoritmai.Automobilis;

import java.io.*;
import java.text.DecimalFormat;

public class Mainas {

    public static void main(String[] args) {
//        Double i = 10.125456789;
//        i = Double.parseDouble(new DecimalFormat(".##").format(i));
//        System.out.println(i);
        String failas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Automobilis\\Duomenys.txt";
        String atsakymai  = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Automobilis\\Rezultatai.txt";
        Integer kilometrai = skaitymas(failas);
//        System.out.println(kilometrai);

        Double greitis = greitis(kilometrai);
        rasyti(atsakymai ,greitis);

    }

    public static void rasyti(String failas,Double greitisSekundem){
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))){

            output.write("Automobilis tunelį pravažiuos per "+greitisSekundem+" s");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Double greitis( Integer km){
        Integer tunelioIlgis = 264;
//        Double kilos = km*1.00;
        Double greit = tunelioIlgis/(km*1.00*1000/3600);
        greit = Double.parseDouble(new DecimalFormat(".##").format(greit));

        System.out.println(greit);
        return greit;
    }

    public static Integer skaitymas(String failas) {
        Integer skaicius = null;
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            objektas = line.split(" ");

//            while (line != null) {
            skaicius = Integer.parseInt(objektas[objektas.length - 1]);
//        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(skaicius);
        return skaicius;
    }
}
