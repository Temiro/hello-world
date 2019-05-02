package Generic;

public class GenericMainas{

    public static  <E> void atspauzdinti(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println("");
    }

    public static  <T> int reiksmiuKiekis(T[] visos,T reiksme){
        int kiekis = 0;
        if (reiksme == null){
            for (T eiline:visos)
                if (eiline == null)kiekis++;

        } else {
            for (T eiline: visos)
                if (reiksme.equals(eiline))kiekis++;
        }
        return kiekis;
    }

//Ismokti nes geras ziauriai dalykas
//
    private static <E> void swap(E[] a, int i, int j){
        if(i != j){
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public static <E extends  Comparable<E>> void selectionSort(E[] a){
        for (int i = 0; i < a.length; i++) {
            //find index of smalest element
            int smallest = i;
            for (int j = i; j < a.length; j++) {
                if (a[j].compareTo(a[smallest])<=0){
                    smallest = j;
                }
            }
            swap(a ,i ,smallest);  //swap smalest to front
        }
    }



    public static void main(String[] args) {

        Integer[] masyvas = {1,2,3,4,5,6,7,8};
        String[] kaskas = {"1","g","f", " Ane?"};

        atspauzdinti(masyvas);
        atspauzdinti(kaskas);

        BendrineKlase<String> sa = new BendrineKlase<>();
        sa.set("Treciadienis");
        String str = sa.get();
        System.out.println(str);
        BendrineKlase<Double> ba = new BendrineKlase<>();
        ba.set(0.2);
        System.out.println(ba.get());


        Integer[] visi = {1,2,3,4,5,6,7,8,1};
        Integer kaLyginsim = 4;
        Integer kiek = reiksmiuKiekis(visi,kaLyginsim);
//        reiksmiuKiekis(visi, 4);
        System.out.println(kiek);

        DviejuTipu<String, Integer> p1 = new  DviejuTipu<>("labas", 8);
        DviejuTipu<String, Integer> p2 = new  DviejuTipu<>("labasss", 3);

        System.out.println(p1.getKey()+"   "+p2.getValue());

        selectionSort(visi);
        System.out.println();

        atspauzdinti(visi);
    }





}
