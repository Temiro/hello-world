package AntraSavaite4d;

public class Cow extends Animal {
    private String balsas = "Muuu";


    @Override
    public String toString() {
        return getKlase() + " " + getBalsas();
    }

    public String getBalsas() {
        return balsas;
    }

    public void setBalsas(String balsas) {
        this.balsas = balsas;
    }
}