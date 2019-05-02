package rekursija.PirmaRekursijosUzduotis;

import java.io.*;
import java.util.Arrays;

public class Antras {
    public static void main(String[] args) {
        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\rekursija\\PirmaRekursijosUzduotis\\Sarasas.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\rekursija\\PirmaRekursijosUzduotis\\baigtas.txt";
        try {

            String skaiciaiString = Skaityti(file);
            String[] skaiciuMasyvasString = skaiciaiString.split("\\W+");
            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
            Double suma = suma(1.0, 2.0);
            Double vidurkis = vidurkis(skaiciuMasyvas);
            Integer minimumas = minimumas(skaiciuMasyvas);
            Integer[] grazintMasyva = grazinaMasyva(skaiciuMasyvas);
            Integer[] bubbleSort = bubbleSort(skaiciuMasyvas);


            rasyti  (atsakymai, skaiciuMasyvas, suma, vidurkis, minimumas,grazintMasyva,bubbleSort);

            System.out.println(skaiciaiString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-----------------------------------------------------------------------------------
    public static Double suma(Double a, Double b) {
        return a + b;
    }

    //-----------------------------------------------------------------------------------
    public static Integer[] GautiSkaiciuMasyva(String[] skaiciai) {
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
        }
        return skaiciuMasyvas;
    }

    //-----------------------------------------------------------------------------------
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


    public static void rasyti(String failas, Integer[] masyvas, Double sum, Double vidurkis, Integer minimumas, Integer[] grazintMasyva, Integer[] bubbleSort) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("1 Uzduotis \n");

            for (int i = 0; i < masyvas.length; i++) { output.write(masyvas[i] + " "); }
//            output.write("\n");
            output.write("\n---------------------\n");
            output.write("2 Uzduotis \n"+sum.toString() + "\n"+"---------------------\n");

            output.write("3 Uzduotis \n\n");
            for (int i = 0; i < masyvas.length; i++) {
                if (arLyginisSkaicius(masyvas[i])) { output.write("skaicius = " + masyvas[i] + "yra Lyginis\n"); }
                else { output.write("skaicius = " + masyvas[i] + "yra neginis\n"); } }
            output.write("---------------------\n");

            output.write("4 Uzduotis \n" + vidurkis + "\n"+"---------------------\n");
            output.write("5 Uzduotis \n"+"Minimumas = " + minimumas + "\n"+"---------------------\n");

            output.write("6 Uzduotis \n");
            for (int i = 0; i < grazintMasyva.length; i++) { output.write("   " + grazintMasyva[i] + "\n"); }
            output.write("---------------------\n");

            output.write("7 Uzduotis \n");
            output.write("Sudelioti Mazejimo tvarka \n");
            for (int i = 0; i < bubbleSort.length; i++) { output.write(  bubbleSort[i] + "\n"); }
            output.write("---------------------\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static Integer[] bubbleSort(Integer[] masyvas) {
            int n = masyvas.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (masyvas[j] < masyvas[j+1])
                    {
                        // swap temp and arr[i]
                        int temp = masyvas[j];
                        masyvas[j] = masyvas[j+1];
                        masyvas[j+1] = temp;
                    }
            return masyvas;
    }

    //-----------------------------------------------------------------------------------
    public static Integer[] grazinaMasyva(Integer[] masyvas) {

        Integer[] tmp = new Integer[0];
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < 10) {
                tmp = pridetiElementa(tmp, masyvas[i]);
            }
        }
        return tmp;
    }

    //-----------------------------------------------------------------------------------
    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;

    }

    //-----------------------------------------------------------------------------------
    public static Integer minimumas(Integer[] masyvas) {
        Integer min = 999999;
        for (int i = 0; i < masyvas.length; i++) {
            if (min > masyvas[i]) {
                min = masyvas[i];

            }
        }
        return min;
    }
    //-----------------------------------------------------------------------------------
    public static Double vidurkis(Integer[] masyvas) {
        Integer suma = 0;
//        Double suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return (double) suma / masyvas.length;
//        return suma / masyvas.length;
    }

    //-----------------------------------------------------------------------------------
    public static boolean arLyginisSkaicius(Integer skaicius) {
        if (skaicius % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}