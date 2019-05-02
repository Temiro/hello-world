package RandomizedBoolen;

import java.util.concurrent.ThreadLocalRandom;

public class RandomBoolen {
    public static void main(String args[])
    {
        // Generate random integers in range 0 to 999
//        int rand_int1 = ThreadLocalRandom.current().nextInt();
//        int rand_int2 = ThreadLocalRandom.current().nextInt();
//
//        // Print random integers
//        System.out.println("Random Integers: " + rand_int1);
//        System.out.println("Random Integers: " + rand_int2);
//
//        // Generate Random doubles
//        double rand_dub1 = ThreadLocalRandom.current().nextDouble();
//        double rand_dub2 = ThreadLocalRandom.current().nextDouble();
//
//        // Print random doubles
//        System.out.println("Random Doubles: " + rand_dub1);
//        System.out.println("Random Doubles: " + rand_dub2);

        // Generate random booleans
        boolean rand_bool1 = ThreadLocalRandom.current().nextBoolean();
        boolean rand_bool2 = ThreadLocalRandom.current().nextBoolean();

        // Print random Booleans
        System.out.println("Random Booleans: " + rand_bool1);
        System.out.println("Random Booleans: " + rand_bool2);
    }
}
