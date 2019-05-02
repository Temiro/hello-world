package Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AlguDidinimas belekas = new AlguDidinimas() {
            @Override
            public Double algos(Double alga) {
                return alga*1.2;
            }
        };

        AlguDidinimas belekas1 = new AlguDidinimas() {
            @Override
            public Double algos(Double alga) {
                return alga*3;
            }
        };

        Employee e1 = new Employee("Jonas", 600d, "Kaunas", "Jonavos", "33");
        Employee e2 = new Employee("Darius", 700d, "Jonava", "Vaiciunu", "45");
        Employee e3 = new Employee("Darius", 700d, "Siauliai", "Vaiciunu", "45");
        Employee[] arr = new Employee[]{
                e1, e2, e3, e1, e2, e3
        };

        // Nebutini , bet apsirasiau
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println("-----------------------------");
        System.out.println("Darbuotojai yra is " + kiekSkirtinguMiestu(arr) + " skirtingu miestu");
        System.out.println("-----------------------------");
        System.out.println(belekas.algos(e1.getAtlyginimas()));
        System.out.println(e1);
        e1.setAtlyginimas(belekas1.algos(e1.getAtlyginimas()));
        System.out.println(e1);
        // kvieciamos funkcijos
//        kiekSkirtinguMiestu(arr);
        kiekSkirtinguMiestu(arr);
//        Alga(  , arr , randomBoolen);
///


    }

    // Kiek skirtingi miestai yra is viso
    public static Integer kiekSkirtinguMiestu(Employee[] arr) {
        String[] unikalusMiestai = new String[]{arr[0].getAdresas().getCity()};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < unikalusMiestai.length; j++) {
                if (!arr[i].getAdresas().getCity().equals(unikalusMiestai[j])) {
                    unikalusMiestai = pridetiElementaInteger(unikalusMiestai, arr[i].getAdresas().getCity());
                    break;
                }
            }
//                System.out.println(arr[i].getAdresas().getCity());
        }
        return unikalusMiestai.length;
    }

    public static String[] pridetiElementaInteger(String[] masyvas, String skaicius) {
        if (arTuriReiksme(masyvas, skaicius)) {
            return masyvas;
        } else {
            masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
            masyvas[masyvas.length - 1] = skaicius;
            return masyvas;
        }
    }

    public static Boolean arTuriReiksme(String[] masyvas, String reiksme) {
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i].equals(reiksme)) {
                return true;
            }

        }
        return false;
    }

//    public static Double[] Alga(Employee[] masyvas, Employee[] arr, Boolean algos){
//        Double[] padidintaAlga = new Double[]{arr[0].getAtlyginimas()};
////        String[] padidintaAlga = new String[]
//        if (algos == true) {
//            for (int i = 0; i < masyvas.length; i++) {
//                padidintaAlga = new Double[]{arr[i].getAtlyginimas() * 1.1};
//            }
//        } else {
//            for (int i = 0; i < masyvas.length; i++) {
//                padidintaAlga = new Double[]{arr[i].getAtlyginimas() + 50};
//            }
//        }
//
//        for (int i = 0; i < padidintaAlga.length; i++) {
//            System.out.println(padidintaAlga[i]);
//        }
//
//        return padidintaAlga;
//
//
//    }





}
