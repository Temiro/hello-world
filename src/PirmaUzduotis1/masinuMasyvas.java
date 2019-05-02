package PirmaUzduotis1;
//Sukurkite automobilių klasę su laukais:
// numeris,
// marke,
// savininkas (vardas, pavarde)
//        Išveskite automobilius surikiuotus pagal savininko vardą; pavarde marke numeri
//  https://github.com/DziugasMolis/BalticTalents3Sprintas/blob/master/3sprintas/src/java14/demo7/Employee.java



public class masinuMasyvas implements Comparable<masinuMasyvas>{
    private  String numeris;
    private  String marke;
    private String savininkas;
    private String vardas;
    private String pavarde;

    public masinuMasyvas(String numeris, String marke,String savininkas,String vardas,String pavarde){

        this.numeris = numeris;
        this.marke= marke;
        this.savininkas= savininkas;
        this.vardas= vardas;
        this.pavarde= pavarde;
    }


    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getSavininkas() {
        return savininkas;
    }

    public void setSavininkas(String savininkas) {
        this.savininkas = savininkas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    //    public  class savininkas{
//        private String vardas;
//        private String pavarde;
//
//
//        public String getVardas() {
//            return vardas;
//        }
//
//        public void setVardas(String vardas) {
//            this.vardas = vardas;
//        }
//
//        public String getPavarde() {
//            return pavarde;
//        }
//
//        public void setPavarde(String pavarde) {
//            this.pavarde = pavarde;
//        }
//    }


    public String toString(){
        return numeris +" "+ marke +" "+ savininkas+" "+ vardas+" "+pavarde+" "+"\n";
    }

    @Override
    public int compareTo(masinuMasyvas o) {
        int comp = getVardas().compareTo(o.getVardas());
        if (comp != 0) return comp;
        comp = getPavarde().compareTo(o.getPavarde());
        if (comp != 0) return comp;
        comp = getMarke().compareTo(o.getMarke());
        if (comp != 0) return comp;
        comp = getNumeris().compareTo(o.getNumeris());
        if (comp != 0) return comp;



        return comp;
    }
}

