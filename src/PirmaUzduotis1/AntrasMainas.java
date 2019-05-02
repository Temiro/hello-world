package PirmaUzduotis1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntrasMainas {
    public static void main(String[] args) {

        List<masinuMasyvas> masynos= new ArrayList<>();

        masynos.add(new masinuMasyvas("ABC 123", " AUDI ", "Darius", "gdshfsh","sdgsg"));
        masynos.add(new masinuMasyvas("BBC 124", " AUDI ", "Darius", "gdshfsh","sdgsg"));
        masynos.add(new masinuMasyvas("DBC 125", " AUDI ", "Darius", "gdshfsh","sdgsg"));
        masynos.add(new masinuMasyvas("CBC 121", " AUDI ", "Darius", "gdshfsh","sdgsg"));

        System.out.println(masynos.toString());
    }


}
