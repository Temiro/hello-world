package ApsuktiMasyva;

import java.io.*;

public class ReikšmesKuriosKartojasi {
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
            double min = 99999999;
//            double max = 0;
            output.write( "Skaiciai kurie kartojasi  ");
            for (int i = 0; i < masyvas.length; i++) {
                int max = 0;
                for (int j=0+i ; j < masyvas.length; j++) {

//                    int max = 0;

                    if(masyvas[i]==masyvas[j]) {

                        max++;

                        if(max>1){

                            output.write(   masyvas[i] + " ");

                        }
                    }

                }



//                output.write(masyvas[i] + " ");
//                output.write(sumuojam + " ");

            }

//            output.write("Minimumas:  "+ min + " " + "\n");
//            output.write("Maximumas:  " + max + " " +  "\n");




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

