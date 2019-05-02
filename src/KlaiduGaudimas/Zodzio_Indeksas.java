package KlaiduGaudimas;

import java.io.*;
import java.util.Scanner;

public class Zodzio_Indeksas {


//    public static void main(String[] args){
//        String file =       "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\skaitymas.txt";
//        String atsakymai =  "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\rasymas.txt";



    public static void main(String[] args) {
        String file =           "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\skaitymas.txt";
        String fileRasymui =    "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\rasymas.txt";
        try {

            String nuskaitytasTekstas = Skaityti(file);
            // \\W pasalina ne zodzius char elementus
            String[] zodziuMasyvas = nuskaitytasTekstas.split("\\W+");
            Integer zodziuSkaicius = zodziuMasyvas.length;

            Rasyti(fileRasymui, zodziuSkaicius, nuskaitytasTekstas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String Skaityti(String failas) throws IOException {
        String nuskaitytasTekstas = "";
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                nuskaitytasTekstas += line + " ";
                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return nuskaitytasTekstas;
    }

    public static void Rasyti(String failas, Integer zodziuSkaicius, String tekstas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
//            output.write("Zodziu skaicius = " + zodziuSkaicius + "\n");
            output.write(tekstas);

//            for (int i = 0; i < ; i++) {
//
//            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}