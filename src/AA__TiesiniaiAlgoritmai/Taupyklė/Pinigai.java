package AA__TiesiniaiAlgoritmai.Taupyklė;

public class Pinigai {
    private Double pirmas;
    private Double antras;


    public Pinigai(Double centukai, Double centai) {
        this.pirmas = centukai;
        this.antras = centai;

    }

    @Override
    public String toString(){
        return pirmas+" "+antras;
    }


    public Double getCentukai() {
        return pirmas;
    }

    public void setCentukai(Double centukai) {
        this.pirmas = centukai;
    }

    public Double getCentai() {
        return antras;
    }

    public void setCentai(Double centai) {
        this.antras = centai;
    }

   }
