package fakturosTik___AntraUzduotis;

import Listas.Empleyee;
import Masynos.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainas {

    private static Object Employee;

    public static void main(String[] args) {

        String file = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\fakturosTik___AntraUzduotis\\Zmones.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\fakturosTik___AntraUzduotis\\Atsakymai.txt";

        List<Employee> employeeMasyvas = skaityti(file);
//        Collections.sort(employeeMasyvas);
//        naujasMasyvas = Collections.sort(employeeMasyvas);

//        System.out.println(employeeMasyvas);


// todo GERAS SITAS

        Integer kasDaugiausiaUzdirba = daugiausiaiUzdirbantis(employeeMasyvas);
//        Integer[] daugiauNei1000 = daugiauNeiTukstantis(employeeMasyvas);

        rasyti(atsakymai, employeeMasyvas, kasDaugiausiaUzdirba);
//        seniausiaMasyna(carMasyvas);

//        int[] ppp   = masynosTar2_2010(carMasyvas);
//        System.out.println(ppp[0]+"222222222");

    }

    public static List<Employee> skaityti(String failas) {
        List<Employee> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {

                objektas = line.split(" ");

                String vardas = objektas[0];
                String pavarde = objektas[1];
                String departamentas = objektas[2];
                Double alga = Double.parseDouble(objektas[3]);


                Employee obj = new Employee(vardas, pavarde, departamentas, alga);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }


    public static void rasyti(String failas, List<Employee> kaskas, Integer kNTDA) {
//        System.out.println(kaskas);

        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {

            output.write("---------------------------------------------\n");
            output.write("--------------- Gautas sarasas --------------\n");
            output.write("---------------------------------------------\n");

//            output.write(kaskas.toString());
            for (int i = 0; i < kaskas.size(); i++) {
                output.write(kaskas.get(i).toString());
                System.out.println(kaskas.get(i));
            }

            output.write("---------------------------------------------\n");
            output.write("------------- Surikuotas sarasas ------------\n");
            output.write("---------------------------------------------\n");

            for (int i = 0; i < kaskas.size(); i++) {
                Collections.sort(kaskas);
                System.out.println(kaskas.get(i));
                output.write(kaskas.get(i).toString());
            }

            output.write("---------------------------------------------\n");
            output.write("---------- Daugiausiai uzdirbantis ----------\n");
            output.write("---------------------------------------------\n");
            output.write(kaskas.get(kNTDA).toString());

            output.write("---------------------------------------------\n");
            output.write("---------- Daugiausiai uzdirbantis ----------\n");
            output.write("---------------------------------------------\n");
//            for (int i = 0; i < kaskas.size(); i++) {
//                for (int j = 0; j < daug_1000.length; j++) {
//                    if (kaskas.get(i).getAlga().equals(daug_1000[j])) ;
//                    {
//                        output.write(kaskas.get(i).toString());
//                    }
//                }
//            }
            output.write("---------------------------------------------\n");

            //      Rasti daugiausiai uždirbantį darbuotoją;


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Integer daugiausiaiUzdirbantis(List<Employee> listas) {
        Double daugiauias = listas.get(0).getAlga();
        Integer kelintas = 0;

        for (int i = 0; i < listas.size(); i++) {
            if (daugiauias < listas.get(i).getAlga()) {
                daugiauias = listas.get(i).getAlga();
                kelintas = i;
            }

        }

        return kelintas;

    }

//    List<Employee>

    public static List<Employee> daugiauNeiTukstantis(List<Employee> listas) {
        List<Employee> list1 = new ArrayList<>();
        Double max = Double.valueOf(0);

//        Integer[] series = {};
//        Double koksSkaicius = 1000.0;

        for (Employee emp : listas) {

            if (emp.getAlga().compareTo(max) >= 0) {

                if (emp.getAlga().compareTo(max) > 0) {

                    max = emp.getAlga();
                    list1.clear();
                    list1.add(emp);
                } else if (emp.getAlga().compareTo(max) == 0) {
                    list1.add(emp);
                }
            }

        }
        return list1;
    }


}
