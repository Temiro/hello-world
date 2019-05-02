package rekursija.PirmaRekursijosUzduotis;

import java.io.*;

public class Pirmas {
    public static void main(String[] args) {
        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\rekursija\\PirmaRekursijosUzduotis\\Sarasas.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\rekursija\\PirmaRekursijosUzduotis\\baigtas.txt";
        try {
            String skaiciaiString = Skaityti(file);
            String[] skaiciuMasyvasString = skaiciaiString.split("\\W+");
            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
            System.out.println(skaiciaiString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static Integer[] GautiSkaiciuMasyva(String[] skaiciai){
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for (int i = 0; i <skaiciai.length; i++) {
            skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
        }
        return skaiciuMasyvas;
    }




    public static String Skaityti(String failas) throws IOException {
        String visosEilutes = "";
        Integer[] masyvas = null;
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            String line = br.readLine();
            while (line != null) {
                visosEilutes += line + " ";
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return visosEilutes;
    }

    public static void rasyti(String failas, Integer[] masyvas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            for (int i = 0; i < masyvas.length; i++) {
                output.write(masyvas[i] + " ");
            }
            output.write("\n");
            output.write("---------------------");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
