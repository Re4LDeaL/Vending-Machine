import java.util.*;

public class Main {

    public static void main(String[] args) {

      class Snoep
        {
            private int code;
            private String naam;
            private double prijs;
            private int voorraad;

            public Snoep( int code, String naam, double prijs, int voorraad ) {
                this.code = code;
                this.naam = naam;
                this.prijs = prijs;
                this.voorraad = voorraad;
            }

            public int getCode() {
                return code;
            }

            public double getPrijs() {
                return prijs;
            }

            public String getNaam() {
                return naam;
            }

            public int getVoorraad() {
                return voorraad;
            }

            public String toString() {
                return String.format( "%4d", code ) + ": " +
                        String.format( "%-40s", naam ) +
                        "€ " +
                        String.format( "%6.2f", prijs ) +
                        String.format( "%4d", voorraad );
            }
        }
    }
}
