package AA__TiesiniaiAlgoritmai.Pamoka;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        String failas = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Pamoka\\Duomenys.txt";
        String failasRasymui = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\AA__TiesiniaiAlgoritmai\\Pamoka\\Rezultatai.txt";

        List<PamokuSkaicius> nuskaitytiDuomenys = pamokos(failas);
        List<PamokuSkaicius> sudetiSkaiciai = sudetiSkaiciai(nuskaitytiDuomenys) ;
        rasyti(failasRasymui, sudetiSkaiciai);

        System.out.println(nuskaitytiDuomenys.toString());
        System.out.println(sudetiSkaiciai.toString());
    }

    public static List<PamokuSkaicius> pamokos(String failas){
        List<PamokuSkaicius> objektuListas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))){
            String line = br.readLine();
            while (line !=null){
                objektas = line.split(" ");

                Integer pam = Integer.parseInt(objektas[objektas.length-1]);
                Integer laikas = Integer.parseInt(objektas[objektas.length-1]);

                laikas=laikas*45;

                PamokuSkaicius obj= new PamokuSkaicius(pam, laikas);
                objektuListas.add(obj);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objektuListas;
    }

    public static List<PamokuSkaicius> sudetiSkaiciai (List<PamokuSkaicius> duomenys){
        List<PamokuSkaicius> sudeti = new ArrayList<>();
        Integer pamokos=0;
        Integer laikas=0;
        for (PamokuSkaicius obj:duomenys) {
            pamokos += obj.getPam();
            laikas += obj.getLaikas();
        }
        PamokuSkaicius obj = new PamokuSkaicius(pamokos,laikas);
        sudeti.add(obj);

        return sudeti;
    }

    public static void rasyti(String failas,List<PamokuSkaicius> ane){
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))){

//            String.format("|%4s|")
//            20
            output.write(String.format("%-20s%-4d","Pamokų skaičius: ",ane.get(0).getPam()));
            output.write(String.format("%-20s%-4d","\nTai sudaro minučių: ",ane.get(0).getLaikas()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
