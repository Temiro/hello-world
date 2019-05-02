package TrikampioPlotas;

import java.util.Scanner;

public class TeigiamasArNeigiamas {
    public static void main(String[] args) {

        System.out.println("Skaicius teigiamas ar neigiamnas");


        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter x number: ");
        Double number2 = reader2.nextDouble();
        reader2.close();

        if(number2>0){
            System.out.println("Teigiamas");
        }
        else if(number2<0){
            System.out.println("Neigiamas");
        }
        else{
            System.out.println("0");
        }

    }
}
