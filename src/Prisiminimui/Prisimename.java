package Prisiminimui;

import java.io.*;

public class Prisimename { public static void main(String[] args){

    String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prisiminimui\\pirmas.txt";
    String file2 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prisiminimui\\pirmas2.txt";
    String fileRasymui = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prisiminimui\\Auntras.txt";

    try{


        Integer[] nuskaitytiSkaiciai = Skaityti(file);
        Integer[] nuskaitytiSkaiciai2 = Skaityti2(file2);
        Integer gautaSuma = Vidurkis(nuskaitytiSkaiciai);
        Integer gautaSuma2 = Vidurkis2(nuskaitytiSkaiciai2);

        Rasyti(fileRasymui, gautaSuma, nuskaitytiSkaiciai);


    } catch (IOException e){
        e.printStackTrace();
    }
}

    public static Integer Vidurkis(Integer[] skaiciuMasyvas){
        Integer suma = 0;
        Integer Vidurkis;
        for (int i = 0; i < skaiciuMasyvas.length; i++) {
            suma+= skaiciuMasyvas[i];
        }
        Vidurkis = suma/skaiciuMasyvas.length;
        System.out.println( "PIRMAS VIDURKIS = " + Vidurkis);
        return Vidurkis;
    }
    public static Integer Vidurkis2(Integer[] skaiciuMasyvas2){
        Integer suma2 = 0;
        Integer Vidurkis2;
        for (int i = 0; i < skaiciuMasyvas2.length; i++) {
            suma2+= skaiciuMasyvas2[i];
        }
        Vidurkis2 = suma2/skaiciuMasyvas2.length;
        System.out.println( "ANTRAS VIDURKIS = " + Vidurkis2);
        return Vidurkis2;
    }

    //--------------------------------------------------------------------------------
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
    //--------------------------------------------------------------------------------
    public static Integer[] Skaityti2(String failas) throws IOException{

        Integer[] masyvas2 = null;
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try{
            StringBuilder sb = new StringBuilder();
            String nReiksme = br.readLine();
            Integer n = Integer.parseInt(nReiksme);
            masyvas2 = new Integer[n];
            String line = br.readLine();

            while (line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] skaiciai = line.split(" " );
                for (int i = 0; i < skaiciai.length; i++) {
                    masyvas2[i] = Integer.parseInt(skaiciai[i]);
                }
                line = br.readLine();
            }
        }catch (FileNotFoundException ex){
            System.out.println("Failas nerastas");
        }finally {
            br.close();
        }

        return  masyvas2;
    }
    //--------------------------------------------------------------------------------

    public static  void Rasyti(String failas, Integer ats, Integer[] masyvas) throws  IOException {

        BufferedWriter output = null;
        try
        {
            output = new BufferedWriter(new FileWriter(failas));
//            Double vidurkis;
            double min = 99999999;
            double max = 0;

            for (int i = 0; i < masyvas.length; i++) {

                if(min>masyvas[i]) {
                    min = masyvas[i];
                }
                else if(max<masyvas[i]){
                    max = masyvas[i];
                }

//                output.write(masyvas[i] + " ");
//                output.write(sumuojam + " ");

            }

            output.write("Minimumas:  "+ min + " " + "\n");
            output.write("Maximumas:  " + max + " " +  "\n");




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
