package AntraSavaite4d;



public class Farm {
    private Animal[] gyvunuMasyvas = new Animal[0];


    public void pridetiGyvuna(Animal naujasGyvunas) {
        Animal[] naujasMasyvas = new Animal[gyvunuMasyvas.length + 1];
        System.arraycopy(gyvunuMasyvas, 0, naujasMasyvas, 0, gyvunuMasyvas.length);
        naujasMasyvas[naujasMasyvas.length - 1] = naujasGyvunas;
        gyvunuMasyvas = naujasMasyvas;
    }

    @Override
    public String toString() {

        Integer sunuSkaicius = 0;
        Integer kaciuSkaicius = 0;
        Integer aviuSkaicius = 0;
        Integer karviuSkaicius = 0;
        Integer vistuSkaicius = 0;

        for (int i = 0; i < gyvunuMasyvas.length; i++) {
            if (gyvunuMasyvas[i] instanceof Dog) {
                sunuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Cat) {
                kaciuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Sheep) {
                aviuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Cow) {
                karviuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Chicken) {
                vistuSkaicius++;
            }
        }


        Dog suo = new Dog();

        return
                "Sunu skaicius = " + sunuSkaicius + suo.getBalsas() +
                        " Kaciu skaicius = " + kaciuSkaicius +
                        " Aviu skaicius = " + aviuSkaicius +
                        " Karviu skaicius = " + karviuSkaicius +
                        " Vistu skaicius = " + vistuSkaicius
                ;
    }

    public Animal[] getGyvunuMasyvas() {
        return gyvunuMasyvas;
    }

    public void setGyvunuMasyvas(Animal[] gyvunuMasyvas) {
        this.gyvunuMasyvas = gyvunuMasyvas;
    }
}