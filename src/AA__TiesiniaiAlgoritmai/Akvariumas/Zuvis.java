package AA__TiesiniaiAlgoritmai.Akvariumas;

public class Zuvis {
    private Integer kiekYra;
    private Integer kiekIdedamaKekvienaDiena;
    private Integer poKiekIdedama;

    public Zuvis(Integer kiekYra, Integer kiekIdedamaKekvienaDiena, Integer poKiekIdedama) {
        this.kiekYra = kiekYra;
        this.kiekIdedamaKekvienaDiena = kiekIdedamaKekvienaDiena;
        this.poKiekIdedama = poKiekIdedama;
    }

    @Override
    public String toString(){
        return kiekYra+" "+kiekIdedamaKekvienaDiena+" "+poKiekIdedama;
    }

    public Integer getKiekYra() {
        return kiekYra;
    }

    public void setKiekYra(Integer kiekYra) {
        this.kiekYra = kiekYra;
    }

    public Integer getKiekIdedamaKekvienaDiena() {
        return kiekIdedamaKekvienaDiena;
    }

    public void setKiekIdedamaKekvienaDiena(Integer kiekIdedamaKekvienaDiena) {
        this.kiekIdedamaKekvienaDiena = kiekIdedamaKekvienaDiena;
    }

    public Integer getPoKiekIdedama() {
        return poKiekIdedama;
    }

    public void setPoKiekIdedama(Integer poKiekIdedama) {
        this.poKiekIdedama = poKiekIdedama;
    }
}
