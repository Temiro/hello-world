package Employee;

import java.util.concurrent.ThreadLocalRandom;

public interface AlguDidinimas {

    // Generate random booleans
    boolean randomBoolen = ThreadLocalRandom.current().nextBoolean();
    // Print random Booleans
//        System.out.println("Random Booleans: " + randomBoolen);

    Double algos(Double alga);

}
