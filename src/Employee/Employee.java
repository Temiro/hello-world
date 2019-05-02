package Employee;

public class Employee {

    private String  name;
    private Double  atlyginimas;
    private Address adresas;


    public String getName() {
        return name;
    }

    public void setAtlyginimas(Double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public Double getAtlyginimas() {
        return atlyginimas;
    }

    public Address getAdresas() {
        return adresas;
    }



    public Employee(String  name, Double  atlyginimas, String city, String street, String number){
        this.name = name;
        this.atlyginimas = atlyginimas;
        this.adresas = new Address( city,  street, number);


    }

    public class  Address{

        private String city;
        private String street;
        private String number;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public Address(String city, String street, String number){
            this.city = city;
            this.street = street;
            this.number = number;


        }

        @Override
        public String toString() {
            return city +" "+ street +" "+ number;

        }
    }

    @Override
    public String toString() {
        return name +" "+ atlyginimas +" "+ adresas;

    }




}
