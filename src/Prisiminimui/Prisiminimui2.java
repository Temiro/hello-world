//package Prisiminimui;
//
//import java.io.*;
//
//public class Prisiminimui2 {
//
//    public static void main(String[] args){
//
//        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prisiminimui\\pirmas.txt";
//        String file2 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prisiminimui\\pirmas2.txt";
//        String fileRasymui = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prisiminimui\\Auntras.txt";
//
//        try {
//
//            String skaiciaiString = Skaityti(file);
//            String[] skaiciuMasyvasString = skaiciaiString.split("\\W+");
//            String[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
////            Double suma = suma(1.0, 2.0);
////            Double vidurkis = vidurkis(skaiciuMasyvas);
////            Integer minimumas = minimumas(skaiciuMasyvas);
////            Integer[] grazintMasyva = grazinaMasyva(skaiciuMasyvas);
////            Integer[] bubbleSort = bubbleSort(skaiciuMasyvas);
//
//
//            rasyti  (atsakymai ,skaiciuMasyvas);
//
////                    suma, vidurkis, minimumas,grazintMasyva,bubbleSort
//
//
//            System.out.println(skaiciaiString);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //-----------------------------------------------------------------------------------
////    public static String Irasymui() throws IOException{
////
////    }
//    //-----------------------------------------------------------------------------------
//    public static String[] GautiSkaiciuMasyva(String[] skaiciai) {
//        String[] skaiciuMasyvas = new String[skaiciai.length];
//        for (int i = 0; i < skaiciai.length; i++) {
//            skaiciuMasyvas[i] = (skaiciai[i]);
//        }
//        return skaiciuMasyvas;
//    }
//    //-----------------------------------------------------------------------------------
//    public static String Skaityti(String failas) throws IOException {
//        String visosEilutes = "";
//        Integer[] masyvas = null;
//        BufferedReader br = new BufferedReader(new FileReader(failas));
//        try {
//            String line = br.readLine();
//            while (line != null) {
//                visosEilutes += line + " ";
//                line = br.readLine();
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Failas nerastas");
//        } finally {
//            br.close();
//        }
//
//        return visosEilutes;
//    }
//
//
//    public static void rasyti(String failas,String[] masyvas) throws IOException {
//        BufferedWriter output = null;
//        try {
//            output = new BufferedWriter(new FileWriter(failas));
//            output.write("1 Uzduotis \n");
//
//            for (int i = 0; i < masyvas.length; i++) {
//                output.write(masyvas[i].toString());
//                System.out.println(masyvas[i]);
//            }
////            output.write("\n");
//            output.write("\n---------------------\n");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (output != null) {
//                output.close();
//            }
//        }
//    }
//
//    //-----------------------------------------------------------------------------------
//
//
//
//
//}
//
