package ProgramuotojuKlase;

public class Programuotijai implements Comparable<Programuotijai>{
    private String VardasPav;
    private Integer Kriterijus;

    public Programuotijai(String vardasPav, Integer kriterijus) {
        VardasPav = vardasPav;
        Kriterijus = kriterijus;

    }

    public String getVardasPav() {
        return VardasPav;
    }


    public void setVardasPav(String vardasPav) {
        VardasPav = vardasPav;
    }

    public Integer getKriterijus() {
        return Kriterijus;
    }

    public void setKriterijus(Integer kriterijus) {
        Kriterijus = kriterijus;
    }

    @Override
    public String toString(){
        return getVardasPav()+" "+getKriterijus()+"\n";
    }
//    @Override
//    public int compareTo(krepsininkai o) {
//        int comp = getNumeris().compareTo(o.getNumeris());
//        if (comp != 0) return comp;
////        comp = getPavarde().compareTo(o.getPavarde());
////        if (comp != 0) return comp;
////        comp = getDepartamentas().compareTo(o.getDepartamentas());
////        if (comp != 0) return comp;
////        comp = getAlga().compareTo(o.getAlga());
////        if (comp != 0) return comp;
//
//
//
//        return comp;
//    }

    @Override
    public int compareTo(Programuotijai o){
        int comp = getKriterijus().compareTo(o.getKriterijus());
        if (comp!=0 )return comp;
        return comp;
    }
}
