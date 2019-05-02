package Fakturos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Saskaita {
    private String klientoVardas;
    private LocalDate saskaitosData;
    private BigDecimal suma;

    public Saskaita(String klientoVardas, LocalDate saskaitosData, BigDecimal suma) {
        this.klientoVardas = klientoVardas;
        this.saskaitosData = saskaitosData;
        this.suma = suma;
    }

//    @Override
//    public String toString{

    }

//}
