package Abstraktu3;

import java.io.*;

public class Mainas {
    public static void main(String[] args) {
        String Duomenys = new File("").getAbsolutePath() + "\\src\\Abstraktu3\\Duomenys.txt";
        String Atsakymai = new File("").getAbsolutePath() + "\\src\\Abstraktu3\\Rezultatai.txt";
        ZmoniuKonteineris obj = new ZmoniuKonteineris(skaityti(Duomenys));
        rasyti(Atsakymai, obj);

    }


    public static Zmogus[] skaityti(String failas) {
        Zmogus[] zmoniuMasyvas = new Zmogus[5];
        String[] objektas = null;
        Integer eilutesIndeksas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Zmogus obj = null;
                if (objektas[0] == "S") {
                    obj = new Studentas(objektas[1], objektas[2], Integer.parseInt(objektas[3]),
                            Integer.parseInt(objektas[4]), objektas[5]);
                } else {
                    obj = new Darbuotojas(objektas[1], objektas[2], Integer.parseInt(objektas[3]),
                            Integer.parseInt(objektas[4]), objektas[5]);
                }
                zmoniuMasyvas[eilutesIndeksas] = obj;
                eilutesIndeksas++;
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return zmoniuMasyvas;
    }
    public static void rasyti(String failas, ZmoniuKonteineris obj) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for(int i = 0; i < obj.getZmoniuMasyvas().length; i++) {
                output.write(obj.getZmoniuMasyvas()[i].toString()+"\n");
            }
            output.write("Vyriausias " + obj.rastiVyriausia().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}