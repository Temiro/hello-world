package SkaniausiSaldainiai;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainas {

    public static void main(String[] args) {

        String failas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\SkaniausiSaldainiai\\Duomenys.txt";
        String Atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\SkaniausiSaldainiai\\Atsakymai.txt";

        Map<String, List<Saldainiai>> nuskaityti = readMokiniai(failas);
        rasyti(Atsakymai, nuskaityti);

//        long i = 0;
        for (Map.Entry<String, List<Saldainiai>> pair : nuskaityti.entrySet()) {
            System.out.println(
                    "firmos Pavadinimas:"+ pair.getKey());
            for (Saldainiai obj: nuskaityti.get(pair.getKey())) {
                System.out.println(obj.toString());
            }
//            System.out.println(pair.getKey() + pair.getValue().get(0));
        }



        System.out.println(nuskaityti);
    }

    public static Map<String, List<Saldainiai>> readMokiniai(String Duomenys) {
        Map<String, List<Saldainiai>> objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(Duomenys))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String pavadinimas = "";
                for (int i = 0; i < objektas.length - 1; i++) {
                    pavadinimas += objektas[i] + " ";
                }
                Integer kiekSaldainiu = Integer.parseInt(objektas[objektas.length - 1]);
                List<Saldainiai> saldainiuPavadinimai = new ArrayList<>();
                line = br.readLine();

                for (int i = 0; i < kiekSaldainiu; i++) {
                    String marke = "";

                    objektas = line.split(" ");

                    for (int j = 0; j < objektas.length - 1; j++) {
                        marke += objektas[j] + " ";
                    }

                    Integer sk = Integer.parseInt(objektas[objektas.length - 1]);
                    Saldainiai obj = new Saldainiai(marke, sk);
                    saldainiuPavadinimai.add(obj);

                    line = br.readLine();
                }

                objektuMap.put(pavadinimas,saldainiuPavadinimai);

//                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }



    public static void rasyti(String failas ,Map<String, List<Saldainiai>> nuskaityti){
//        try (BufferedWriter output =new BufferedWriter(new FileWriter(duomenys))){
        try(BufferedWriter rasyti = new BufferedWriter(new FileWriter(failas))){

//            rasyti.write(nuskaityti.get());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
