package ApsuktiMasyva;

import java.io.*;

public class VidurkioLiginimas3Uzduotis {
    public static void main(String[] args){

        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\ApsuktiMasyva\\Nuskaitomas.txt";
        String fileRasymui = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\ApsuktiMasyva\\Irasomas.txt";

        try{
            Integer[] nuskaitytiSkaiciai = Skaityti(file);
            Integer gautaSuma = Suma(nuskaitytiSkaiciai);
            Rasyti(fileRasymui, gautaSuma, nuskaitytiSkaiciai);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Integer Suma(Integer[] skaiciuMasyvas){
        Integer suma = 0;
        for (int i = 0; i < skaiciuMasyvas.length; i++) {
            suma+= skaiciuMasyvas[i];
        }
        return suma;
    }

    public static Integer[] Skaityti(String failas) throws IOException{

        Integer[] masyvas = null;
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try{
            StringBuilder sb = new StringBuilder();
            String nReiksme = br.readLine();
            Integer n = Integer.parseInt(nReiksme);
            masyvas = new Integer[n];
            String line = br.readLine();

            while (line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] skaiciai = line.split(" " );
                for (int i = 0; i < skaiciai.length; i++) {
                    masyvas[i] = Integer.parseInt(skaiciai[i]);
                }
                line = br.readLine();
            }
        }catch (FileNotFoundException ex){
            System.out.println("Failas nerastas");
        }finally {
            br.close();
        }

        return  masyvas;
    }

    public static  void Rasyti(String failas, Integer ats, Integer[] masyvas) throws  IOException {

        BufferedWriter output = null;
        try
        {
            output = new BufferedWriter(new FileWriter(failas));
//            Double vidurkis;
            double sumuojam = 0;
            int kiekis = 0;
            for (int i = 0; i < masyvas.length; i++) {
                sumuojam += masyvas[i];
                kiekis ++;

//                output.write(masyvas[i] + " ");
//                output.write(sumuojam + " ");

            }
            double vidurkis = sumuojam/kiekis;
            output.write("Vidurkis:  "+vidurkis + " " + "\n");
            output.write("Skaiciai kurie atitinka vidurki :" + "\n");

            for (int i = 0; i < masyvas.length; i++) {
                if(masyvas[i] > vidurkis){
                    output.write(masyvas[i] + " ");
                }
//                output.write(masyvas[i] + " ");
            }


        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (output != null){
                output.close();
            }
        }
    }

}
