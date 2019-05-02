package AA__TiesiniaiAlgoritmai.Statybininkas;

public class Statybininkas {
    private Integer ilgis;
    private Integer aukstis;
    private Double kaina;

    public Statybininkas(Integer ilgis, Integer aukstis, Double kaina) {
        this.ilgis = ilgis;
        this.aukstis = aukstis;
        this.kaina = kaina;
    }

    @Override
    public String toString(){
        return ilgis+" "+aukstis+" "+kaina;
    }

    public Integer getIlgis() {
        return ilgis;
    }

    public void setIlgis(Integer ilgis) {
        this.ilgis = ilgis;
    }

    public Integer getAukstis() {
        return aukstis;
    }

    public void setAukstis(Integer aukstis) {
        this.aukstis = aukstis;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

}
