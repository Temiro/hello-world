package AntraSavaite4d;

import java.io.File;

public class PagrindineKlase {
    public static void main(String[] args) {

        String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        Animal gyvunas = new Animal();
        Dog suo = new Dog();
        Cat kate = new Cat();
        Cow karve = new Cow();
        Sheep avis = new Sheep();
        Chicken vista = new Chicken();

        //------------------------------------------------------------------

        System.out.println(gyvunas.toString());
        System.out.println(suo.toString());
        System.out.println(kate.toString());
        System.out.println(karve.toString());
        System.out.println(avis.toString());
        System.out.println(vista.toString());

        //------------------------------------------------------------------

        Animal suoAnimal = new Dog();
        Animal kateAnimal = new Cat();

        System.out.println(((Dog) suoAnimal).suoFainas());
        System.out.println(kateAnimal.toString());

        Farm fermyte = new Farm();
        fermyte.pridetiGyvuna(suo);
        fermyte.pridetiGyvuna(kate);
        fermyte.pridetiGyvuna(suoAnimal);
        fermyte.pridetiGyvuna(kateAnimal);
        fermyte.pridetiGyvuna(suo);
        fermyte.pridetiGyvuna(karve);

        System.out.println(fermyte.toString());
    }
}