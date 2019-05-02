//package KlaiduGaudimas.PamokosUzduotis;
//
//import java.io.*;
//
//public class PamokosUzduotis {
//    public static void main(String[] args) {
//
////        String file =       "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\skaitymas.txt";
////        String atsakymai =  "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\rasymas.txt";
////
////        System.out.println(skaityti(file));
////        rasyti(atsakymai);
//
//        String[] vardai = new String[0];
//        String[] pavardes = new String[0];
//        Integer[] amzius = new Integer[0];
//        String[] profesija = new String[0];
//
//        skaityti(duomenys, )
//    }
//
//    public static String skaityti(String failas) {
////        String atsarginisFailas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\KlaiduGaudimas\\atsarginisFailas.txt";
////        String visosEilutes = "";
//    String[] tarpinesReiksmes = null;
//        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
//            String line = br.readLine();
//            while (line != null) {
//                tarpinesReiksmes += line + " ";
//                line = br.readLine();
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Failas nerastas");
//            visosEilutes = skaityti(atsarginisFailas);
//        } catch (Exception e) {
//            System.out.println("something else went wrong");
//        }
//
//        return visosEilutes;
//    }
//
//
//    public static void rasyti(String failas) {
//        Integer[] masyvas = {1,2,3,4,5,6,7,8,9};
//        try(BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
//            output.write(grazintiMasyvoNari(masyvas, 1)+"\n");
//            output.write(grazintiMasyvoNari(masyvas, 99)+"\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static  Integer grazintiMasyvoNari(Integer[] masyvas, Integer indeksas){
//        try{
//            return  masyvas[indeksas];
//        }catch (ArrayIndexOutOfBoundsException ex){
//            return masyvas[masyvas.length-1];
//        }
//    }
//
