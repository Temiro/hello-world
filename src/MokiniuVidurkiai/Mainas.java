package MokiniuVidurkiai;

import Pardavimai.Telefonas;
import jdk.dynalink.linker.LinkerServices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainas {
    public static void main(String[] args) {
        String failas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\MokiniuVidurkiai\\Duomenys.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\MokiniuVidurkiai\\Atsakymai.txt";


        Map<Integer,Mokiniai> mokiniaiMap = skaityti(failas);
//        Map<Integer,Mokiniai> mokiniaiMap1 = skaityti(failas);


    }
    public static Map<Integer, Mokiniai> skaityti(String failas) {
        Map<Integer, Mokiniai>  objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer mokiniuSk = Integer.parseInt(line);

            for(int i = 0; i < mokiniuSk; i++) {
                line = br.readLine();
                List<Pazimiai> pazimiai = new ArrayList<>();
                if(line != null) {
                    objektas = line.split(" ");
                    String vardasPav = objektas[0]+objektas[1];
                    String klase = objektas[2];

//                    for (int j = 3; j < line.length(); j++) {
//                        pazimiai.add(new Pazimiai(objektas[j]));
//                        pazimiai = new Integer[Integer.parseInt(objektas[j])];
//                        System.out.println(pazimiai.get(j));
//                    }

//                    Mokiniai obj = new Mokiniai(vardasPav, klase, pazimiai);
//                    objektuMap.put(i, obj);
                }
            }
//            line = br.readLine();
//            Integer pardavimuEiluciuSkaicius=Integer.parseInt(line);
//            for(int i = 0; i < pardavimuEiluciuSkaicius; i++) {
//                line = br.readLine();
//                if(line != null) {
//                    objektas = line.split(" ");
//                    Integer telefonoId = Integer.parseInt(objektas[0]);
//                    Integer pardavimuSkaicius = Integer.parseInt(objektas[1]);
//                    objektuMap.get(telefonoId).setPardavimuSkaicius
//                            (objektuMap.get(telefonoId).getPardavimuSkaicius() + pardavimuSkaicius);
//                }
//            }
//            line = br.readLine();

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }

}
