package Prekyba;

import MokiniuVidurkiai.Mokiniai;
import MokiniuVidurkiai.Pazimiai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainas {
    public static void main(String[] args) {
        String failas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prekyba\\Duomenys.txt";
        String failas2 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Prekyba\\Duomenys2.txt";
        String atsakymai1 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\MokiniuVidurkiai\\Atsakymai1.txt";
        String atsakymai2 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\MokiniuVidurkiai\\Atsakymai2.txt";


        Map<Integer, Technika> mokiniaiMap = skaityti(failas);
        Map<Integer, Technika> mokiniaiMap2 = skaityti(failas2);
//        Map<Integer,Mokiniai> mokiniaiMap1 = skaityti(failas);


    }
    public static Map<Integer, Technika> skaityti(String failas) {
        Map<Integer, Technika>  objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
//            Integer mokiniuSk = Integer.parseInt(line);

            while (line!=null){
                objektas = line.split(" ");

                for (int i = 0; i < objektas.length-3; i++) {

                }
                line = br.readLine();
                List<Pazimiai> pazimiai = new ArrayList<>();
                if(line != null) {
                    objektas = line.split(" ");
                    String vardasPav = objektas[0]+objektas[1];
                    String klase = objektas[2];
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }

    public static Map<Integer, Uzsakymai> skaityti2(String failas) {
        Map<Integer, Uzsakymai>  objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
//            Integer mokiniuSk = Integer.parseInt(line);

            while (line!=null){
                objektas = line.split(" ");

                Integer id = Integer.parseInt(objektas[0]);
                Integer sk = Integer.parseInt(objektas[1]);
//                String sk = objektas[1];


                Uzsakymai obj = new Uzsakymai(id,sk);
                objektuMap.put(id , obj);


                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }








}
