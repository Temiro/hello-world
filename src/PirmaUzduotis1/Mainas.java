package PirmaUzduotis1;

import jdk.dynalink.linker.LinkerServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mainas {
    public static void main(String[] args) {

        Map<String, Zmogus> zodynas= new HashMap<>();

        zodynas.put("3",new Zmogus("Andrius", " Petraitis", " 1"));
        zodynas.put("1",new Zmogus("Jonas", " Petraitis", " 1"));
        zodynas.put("2",new Zmogus("Ona", " Petraite", " 1"));
        zodynas.put("4",new Zmogus("Jonas", " Petraitis", " 4"));
        zodynas.put("2",new Zmogus("Ona", " Petraite", " 1"));
        zodynas.put("1",new Zmogus("Jonas", " Petraitis", " 1"));
        zodynas.put("5",new Zmogus("Ona", " Petraite", " 5"));
        zodynas.put("1",new Zmogus("Jonas", " Petraitis", " 1"));
        zodynas.put("2",new Zmogus("Ona", " Petraite", " 1"));

        System.out.println(zodynas);

//        TreeMap<String, >
    }

}
