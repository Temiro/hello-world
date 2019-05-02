package TrikampioPlotas;

import java.util.Scanner;

public class TrysSkaiciaiKurisDydziausiais {
    public static void main(String[] args) {
             System.out.println("Iveskite 3 skaicius ir bus isvestas dydziausiais");

             System.out.println("Iveskite 1 skaiciu ");
             Scanner reader1 = new Scanner(System.in);
             Double a = reader1.nextDouble();

        System.out.println("Iveskite 2 skaiciu ");
        Scanner reader2 = new Scanner(System.in);
        Double b = reader2.nextDouble();

        System.out.println("Iveskite 3 skaiciu ");
        Scanner reader3 = new Scanner(System.in);
        Double c = reader3.nextDouble();

        if(a>b && a>c){
            System.out.println("dydziausias skaicius yra:  " + a);
        }
         else if(b>a && b>c){
            System.out.println("dydziausias skaicius yra:  " + b);
        }
        else{
            System.out.println("dydziausias skaicius yra:  " + c);
        }
    }


}
