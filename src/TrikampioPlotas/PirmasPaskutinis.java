package TrikampioPlotas;

public class PirmasPaskutinis {

//    import java.util.Scanner;

    public static void main(String[] args) {


        String zodis = "Kompiuteris";

        // nulinis ir yra pirmas

        char first = zodis.charAt(0);

        // lenght - 1 bus paskutinis

        char last = zodis.charAt(zodis.length() - 1);

//        System.out.println("first character of string ", phone, first);
//        System.out.println("last character of string ", phone, last);
        System.out.println("Pirma raide zodzio : " +zodis+" Yra " +first);
        System.out.println("Paskutine raide zodzio : " +zodis+" Yra " +last);

    }
}