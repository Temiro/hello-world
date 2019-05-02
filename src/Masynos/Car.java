package Masynos;

public class Car {
    private String gamintojas;
    private String modelis;
    private Integer metai;
    private Integer kaina;
    private Double variklioTuris;
    private String kuroTipas;

    public Car (String gamintojas,String modelis,Integer metai,Integer kaina,Double variklioTuris,String kuroTipas){
        this.gamintojas = gamintojas;
        this.modelis = modelis;
        this.metai = metai;
        this.kaina = kaina;
        this.variklioTuris = variklioTuris;
        this.kuroTipas = kuroTipas;
    }

    public  Car(){

    }

    @Override
    public String toString(){
        return getGamintojas()+  " "
                +getModelis()+  " "
                +getMetai()+  " "
                +getKaina()+  " "
                +getVariklioTuris()+  " "
                +getKuroTipas()+ "\n";

    }


    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public Integer getMetai() {
        return metai;
    }

    public void setMetai(Integer metai) {
        this.metai = metai;
    }

    public Integer getKaina() {
        return kaina;
    }

    public void setKaina(Integer kaina) {
        this.kaina = kaina;
    }

    public Double getVariklioTuris() {
        return variklioTuris;
    }

    public void setVariklioTuris(Double variklioTuris) {
        this.variklioTuris = variklioTuris;
    }

    public String getKuroTipas() {
        return kuroTipas;
    }

    public void setKuroTipas(String kuroTipas) {
        this.kuroTipas = kuroTipas;
    }
}
//    String gamintojas = objektas[0];
//    String modelis= objektas[1];
//    Integer metai = Integer.parseInt(objektas[2]);
//    Integer kaina = Integer.parseInt(objektas[3]);
//    Integer variklioTuris = Integer.parseInt(objektas[4]);
//    String kuroTipas = objektas[5];