package TrikampioPlotas;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class DienosPavadinimas {
    public static void main(String[] args) {

//        String s[1] = "Pirmadienis";
//        String s[2] = "Antradienis";
//        String s[3] = "Treciadienis";
//        String s[4] = "Ketvirtadienis";
//        String s[5] = "Penktadienis";
//        String s[6] = "Sestadienis";
//        String s[7] = "Sekmadienis";


        String[] s = {
                "Pirmadienis",
                "Antradienis",
                "Treciadienis",
                "Ketvirtadienis",
                "Penktadienis",
                "Sestadienis",
                "Sekmadienis"
        };

        System.out.println("Iveskite skaiciu ");
        Scanner reader1 = new Scanner(System.in);
        int a = reader1.nextInt();

        if(a<=7) {
            System.out.println(s[a - 1]);
        }
        else{
            System.out.println("Nera");
        }



    }
}