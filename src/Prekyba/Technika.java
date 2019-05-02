package Prekyba;

public class Technika {
    private String pavadinimas;
    private Integer kodas;
    private Integer vntSkaicius;
    private Double vntKaina;


    public Technika(String klasesPav, Integer kodas, Integer vntSkaicius, Double pavadinimas) {
        this.pavadinimas = klasesPav;
        this.kodas = kodas;
        this.vntSkaicius = vntSkaicius;
        this.vntKaina = vntKaina;
    }

    @Override
    public String toString(){
        return pavadinimas+" "+kodas+" "+vntSkaicius+" "+vntKaina;
    }

    public String pavadinimas() {
        return pavadinimas;
    }

    public void setKlasesPav(String klasesPav) {
        this.pavadinimas = klasesPav;
    }

    public Integer getKodas() {
        return kodas;
    }

    public void setKodas(Integer kodas) {
        this.kodas = kodas;
    }

    public Integer getVntSkaicius() {
        return vntSkaicius;
    }

    public void setVntSkaicius(Integer vntSkaicius) {
        this.vntSkaicius = vntSkaicius;
    }

    public Double getVntKaina() {
        return vntKaina;
    }

    public void setVntKaina(Double vntKaina) {
        this.vntKaina = vntKaina;
    }
}
