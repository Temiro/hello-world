package TrikampioPlotas;

import java.util.Scanner;

public class KvadratineLygis {
    public static void main(String[] args) {

        System.out.println("kvadratine lygtis a(x*x)+bx+c=0");


        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Double a = reader1.nextDouble();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter b number: ");
        Double b = reader2.nextDouble();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter c number: ");
        Double c = reader2.nextDouble();
        reader2.close();


        double d=(Math.pow(b,2)-4*a*c);
        //        System.out.println("Staciakampio plotas:");
        if(d>0){
//            int x1=((-1*b-Math.sqrt((b,2)-4*a*c))/2*a)
            double x1 = (-1*b-Math.sqrt(d))/2*a;
            System.out.println("x1 =" + x1);

            double x2 = (-1*b+Math.sqrt(d))/2*a;
            System.out.println("x2 =" + x2);
        }
        if(d == 0){
//            int x1=((-1*b-Math.sqrt((b,2)-4*a*c))/2*a)
            double x1 = (-1*b-Math.sqrt(d))/2*a;
            System.out.println("x1 =" + x1);

        }
        else{
            System.out.println("Neturi sprendiniu");
        }

    }
}
