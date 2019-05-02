package Fakturos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mainas {
    public static void main(String[] args) {
        List<Saskaita> list = new ArrayList<>();
        list.add(new Saskaita("petras", LocalDate.parse("2019-01-01"), BigDecimal.valueOf(500)));
        list.add(new Saskaita("Ugnius", LocalDate.parse("2019-05-30"), BigDecimal.valueOf(600)));
        list.add(new Saskaita("Mindaugas", LocalDate.parse("2019-06-28"), BigDecimal.valueOf(800)));
        list.add(new Saskaita("Aurimas", LocalDate.parse("2019-02-02"), BigDecimal.valueOf(900)));
        list.add(new Saskaita("Ona", LocalDate.parse("2019-01-06"), BigDecimal.valueOf(900)));

        list.add(new Saskaita("petras", LocalDate.parse("2019-01-02"), BigDecimal.valueOf(500)));
        list.add(new Saskaita("Ugnius", LocalDate.parse("2019-05-30"), BigDecimal.valueOf(600)));
        list.add(new Saskaita("Mindaugas", LocalDate.parse("2019-06-29"), BigDecimal.valueOf(800)));
        list.add(new Saskaita("Aurimas", LocalDate.parse("2019-02-09"), BigDecimal.valueOf(900)));
        list.add(new Saskaita("Ona", LocalDate.parse("2019-01-09"), BigDecimal.valueOf(900)));

        list.add(new Saskaita("petras", LocalDate.parse("2019-01-03"), BigDecimal.valueOf(500)));
        list.add(new Saskaita("Ugnius", LocalDate.parse("2019-05-30"), BigDecimal.valueOf(600)));
        list.add(new Saskaita("Mindaugas", LocalDate.parse("2019-06-27"), BigDecimal.valueOf(800)));
        list.add(new Saskaita("Aurimas", LocalDate.parse("2019-02-02"), BigDecimal.valueOf(900)));
        list.add(new Saskaita("Ona", LocalDate.parse("2019-01-09"), BigDecimal.valueOf(900)));

        list.add(new Saskaita("petras", LocalDate.parse("2019-01-04"), BigDecimal.valueOf(500)));
        list.add(new Saskaita("Ugnius", LocalDate.parse("2019-05-30"), BigDecimal.valueOf(600)));
        list.add(new Saskaita("Mindaugas", LocalDate.parse("2019-06-23"), BigDecimal.valueOf(800)));
        list.add(new Saskaita("Aurimas", LocalDate.parse("2019-02-01"), BigDecimal.valueOf(900)));
        list.add(new Saskaita("Ona", LocalDate.parse("2019-01-09"), BigDecimal.valueOf(900)));

        spauzdintiList(list, "pradinis Listas ");
    }

    public static void spauzdintiList(List<Saskaita> list, String ane) {
        System.out.println(ane);
        for(Saskaita obj:list){
            System.out.println(obj.toString());
        }
        System.out.println("------------------------------------------");


    }


    public static List<Saskaita> SaskaitosListas(List<Saskaita> list){
        List<Saskaita> naujasListas = new ArrayList<>();


        for ( Saskaita obj: naujasListas){
//            switch ()
        }
        return naujasListas;
    }
}
