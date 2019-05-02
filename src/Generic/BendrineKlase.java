package Generic;

public class BendrineKlase<T> {

        private T objektas;
        public T get(){
            return objektas;
        }
        public void set(T objektas){
            this.objektas=objektas;
        }

//        public static void main(String[] args) {
//            Saugykla sa = new Saugykla();
//            sa.set("Treciadenis");
//            String str = (String) sa.get(); // reikia kastingo  !!
//        }

}
