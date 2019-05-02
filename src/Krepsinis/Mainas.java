package Krepsinis;

import Masynos.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Krepsinis\\zaidejai.txt";
        String file2 = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Krepsinis\\taskai.txt";
        String atsakymai = "C:\\Users\\Pc\\Desktop\\git\\hello-world\\src\\Krepsinis\\Atsakymai.txt";
        List<krepsininkai> krepsininkuMasyvas = skaityti(file1);
        List<krepsininkai> krepsininkuMasyvass = skaityti2(file2, krepsininkuMasyvas);
        List<krepsininkai> priskiriamReiksmes = reiksmes(krepsininkuMasyvas, krepsininkuMasyvass);
        rasyti(atsakymai, priskiriamReiksmes);
    }

    public static List<krepsininkai> skaityti(String failas) {
        List<krepsininkai> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {
                objektas = line.split(" ");

                Integer numeris = Integer.parseInt(objektas[0]);

                String vardas = objektas[1];
                String pavarde = objektas[2];

                krepsininkai obj = new krepsininkai(numeris, vardas, pavarde);
                objektuMasyvas.add(obj);

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objektuMasyvas;

    }

    public static List<krepsininkai> skaityti2(String failas, List<krepsininkai> krepsininkai) {
        List<krepsininkai> objektuMasyvas = new ArrayList<>();
        String[] objektas = null;


        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();

            while (line != null) {


                objektas = line.split(" ");

                Integer numeris = Integer.parseInt(objektas[0]);
                Integer taskai = Integer.parseInt(objektas[1]);
//                String taskai = objektas[1];
                Integer baudos = 0;
                Integer dvitaskiai = 0;
                Integer tritaskaii = 0;
                Integer nepataikiti = 0;
                Integer kiekBuvoPramesta = 0;


                for (int i = 0; i < krepsininkai.size(); i++) {
//                    baudos =0;
//                    dvitaskiai=0;
//                    tritaskaii=0;
//                    nepataikiti=0;
//                    kiekBuvoPramesta=0;
                    if (numeris == (krepsininkai.get(i).getNumeris())) {
                        switch (taskai) {
                            case 1:
                                baudos++;
                                kiekBuvoPramesta++;
                                break;

                            case 2:
                                dvitaskiai++;
                                kiekBuvoPramesta++;
                                break;
                            case 3:
                                tritaskaii++;
                                kiekBuvoPramesta++;
                                break;
                            default:
                                nepataikiti++;
                                kiekBuvoPramesta++;
                                break;
                        }
                        krepsininkai obj = new krepsininkai(numeris, krepsininkai.get(i).getVardas(), krepsininkai.get(i).getPavarde(), baudos, dvitaskiai,
                                tritaskaii, nepataikiti, kiekBuvoPramesta);
                        objektuMasyvas.add(obj);
                        break;
                    }

                }


//                krepsininkai obj = new krepsininkai(baudos,dvitaskiai,
//                        tritaskaii,nepataikiti,kiekBuvoPramesta);

//                objektuMasyvas.add(obj);

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objektuMasyvas;

    }

    public static List<krepsininkai> reiksmes(List<krepsininkai> esami, List<krepsininkai> busimi) {
        List<krepsininkai> objektuMasyvas = new ArrayList<>();

        for (int i = 0; i < esami.size(); i++) {
            Integer baudos = 0;
            Integer dvitaskiai = 0;
            Integer tritaskaii = 0;
            Integer nepataikiti = 0;
            Integer kiekBuvoPramesta = 0;
            for (int j = 0; j < busimi.size(); j++) {
                if (esami.get(i).getNumeris() == busimi.get(j).getNumeris()) {
                    baudos = baudos + busimi.get(j).getBaudos();
                    dvitaskiai = dvitaskiai + busimi.get(j).getDvitaskiai();
                    tritaskaii = tritaskaii + busimi.get(j).getTritaskaii();
                    nepataikiti = nepataikiti + busimi.get(j).getNepataikiti();
                    kiekBuvoPramesta = kiekBuvoPramesta + busimi.get(j).getKiekBuvoPramesta();
                }
            }
            krepsininkai obj = new krepsininkai(esami.get(i).getNumeris(), esami.get(i).getVardas(), esami.get(i).getPavarde(), baudos, dvitaskiai,
                    tritaskaii, nepataikiti, kiekBuvoPramesta);
            objektuMasyvas.add(obj);
        }
        return objektuMasyvas;
    }

    //
    public static Integer daugiausiaiTaskuPelne(List<krepsininkai> kreps) {
        Integer intas = 0;
        Integer koks = (kreps.get(0).getBaudos() + kreps.get(0).getTritaskaii() * 3 + kreps.get(0).getDvitaskiai() * 2);
        for (int i = 0; i < kreps.size(); i++) {
            if (koks < (kreps.get(i).getBaudos() + kreps.get(i).getTritaskaii() * 3 + kreps.get(i).getDvitaskiai() * 2)) {
                koks = (kreps.get(i).getBaudos() + kreps.get(i).getTritaskaii() * 3 + kreps.get(i).getDvitaskiai() * 2);
                intas = i;
            }

//            intas = i;
        }

        return intas;
    }

    public static Integer daugiausiaiTritaskiuPelne(List<krepsininkai> kreps) {
        Integer intas = 0;
        Integer koks = (kreps.get(0).getTritaskaii());
        for (int i = 0; i < kreps.size(); i++) {
            if (koks < (kreps.get(i).getTritaskaii())) {
                koks = (kreps.get(i).getTritaskaii());
                intas = i;
            }

//            intas = i;
        }

        return intas;
    }

//    Taikliausias

    public static Integer Taikliausias(List<krepsininkai> kreps) {

//        System.out.printf("%-8d",((kreps.get(i).getKiekBuvoPramesta()-
//        kreps.get(i).getNepataikiti())*100/ kreps.get(i).getKiekBuvoPramesta()));

        Integer intas = 0;
        Integer koks = 0;
        for (int i = 0; i < kreps.size(); i++) {
            if (kreps.get(i).getKiekBuvoPramesta() == 0) {
//                System.out.printf("kreps.get(i).getKiekBuvoPramesta()");
                continue;
            } else if (koks<(((kreps.get(i).getKiekBuvoPramesta() -
                    kreps.get(i).getNepataikiti()) * 100 /
                    kreps.get(i).getKiekBuvoPramesta())))
            {
                koks = (((kreps.get(i).getKiekBuvoPramesta() -
                        kreps.get(i).getNepataikiti()) * 100 /
                        kreps.get(i).getKiekBuvoPramesta()));
                intas = i;
            }
        }

        return intas;
    }


    public static void rasyti(String failas, List<krepsininkai> kreps) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            //72

            String lines = new String(new char[81]).replace('\0', '*');
            System.out.println(lines);
            System.out.println("|Nr.| vardas Pavarde               | Baudos  | Dvit.  | Trit.  |Nepat.|Tikslumas|");
            System.out.println(lines);

            Collections.sort(kreps);
            for (int i = 0; i < kreps.size(); i++) {

                System.out.printf("|");
                output.write("|");
                System.out.printf("%-3d", kreps.get(i).getNumeris());
//                output.write();

                System.out.printf("| ");
                System.out.printf("%-29s", kreps.get(i).getVardas() + " " + kreps.get(i).getPavarde());
                System.out.printf("| ");
                System.out.printf("%-8d", kreps.get(i).getBaudos());
                System.out.printf("| ");
                System.out.printf("%-7d", kreps.get(i).getDvitaskiai());
                System.out.printf("| ");
                System.out.printf("%-7d", kreps.get(i).getTritaskaii());
                System.out.printf("| ");
                System.out.printf("%-5d", kreps.get(i).getNepataikiti());
                System.out.printf("| ");
                if (kreps.get(i).getKiekBuvoPramesta() == 0) {
                    System.out.printf("%-8d", kreps.get(i).getKiekBuvoPramesta());
                } else {
                    System.out.printf("%-8d", ((kreps.get(i).getKiekBuvoPramesta() - kreps.get(i).getNepataikiti()) * 100 / kreps.get(i).getKiekBuvoPramesta()));
                }
                System.out.printf("|");
                System.out.printf("\n");
            }
            System.out.println(lines);
            System.out.println();

            System.out.printf("%29s", "Daugiausia tasku pelne:");
            System.out.printf("%4d", kreps.get(daugiausiaiTaskuPelne(kreps)).getNumeris());
            System.out.printf("  ");
            System.out.printf("%-23s", kreps.get(daugiausiaiTaskuPelne(kreps)).getVardas() + " " + kreps.get(daugiausiaiTaskuPelne(kreps)).getPavarde());
            System.out.printf("%-4d", (kreps.get(daugiausiaiTaskuPelne(kreps)).getBaudos() +
                    kreps.get(daugiausiaiTaskuPelne(kreps)).getTritaskaii() * 3 +
                    kreps.get(daugiausiaiTaskuPelne(kreps)).getDvitaskiai() * 2));
            System.out.printf("\n");

            System.out.printf("%29s", "Daugiausia tritaskiu imete:");
            System.out.printf("%4d", kreps.get(daugiausiaiTritaskiuPelne(kreps)).getNumeris());
            System.out.printf("  ");
            System.out.printf("%-23s", kreps.get(daugiausiaiTritaskiuPelne(kreps)).getVardas() + " " + kreps.get(daugiausiaiTritaskiuPelne(kreps)).getPavarde());
            System.out.printf("%-4d", kreps.get(daugiausiaiTritaskiuPelne(kreps)).getTritaskaii());
            System.out.printf("\n");

            System.out.printf("%29s", "Taikliausias:");
            System.out.printf("%4d", kreps.get(Taikliausias(kreps)).getNumeris());
            System.out.printf("  ");
            System.out.printf("%-23s", kreps.get(Taikliausias(kreps)).getVardas() + " " + kreps.get(Taikliausias(kreps)).getPavarde());
            System.out.printf("%-4d",((kreps.get(Taikliausias(kreps)).getKiekBuvoPramesta() - kreps.get(Taikliausias(kreps)).getNepataikiti()) * 100 / kreps.get(Taikliausias(kreps)).getKiekBuvoPramesta()));

            System.out.printf("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
