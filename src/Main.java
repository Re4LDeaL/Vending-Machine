import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner (System.in);

        double Snoep1 = 1.25;
        double Snoep2 = .75;
        double Snoep3 = .90;
        double Snoep4 = .75;
        double Snoep5 = 1.50;
        double Snoep6 = .75;

        System.out.print("Kies Snoepnummer aub!");
        int Snoep = toetsenbord.nextInt();

        System.out.print("De prijs betaald is: ");
        double betaald = toetsenbord.nextDouble();

        if (Snoep == 2 || Snoep == 4 || Snoep == 6)
        {
            if (betaald >= Snoep2){
                System.out.println("Bedankt voor uw aankoop!");
        }
        if (betaald < Snoep2){
            System.out.println("U heeft nog " + "€" +(Snoep2-betaald) + " nodig");
        }
        }
        else if (Snoep == 1){
            if (betaald >= Snoep1){
                System.out.println("Bedankt voor uw aankoop!");
            }
            if (betaald < Snoep1)
            {
                System.out.println("U heeft nog " + "€" +(Snoep1-betaald) + " nodig");
            }
        }
        else if (Snoep == 3){
            if (betaald >= Snoep3){
                System.out.println("Bedankt voor uw aankoop!");
            }
            if (betaald < Snoep3){
                System.out.println("U heeft nog " + "€" +(Snoep3-betaald) + " nodig");
            }
        }
        else if (Snoep == 5){
            if (betaald >= Snoep5){
                System.out.println("Bedankt voor uw aankoop!");
            }
            if (betaald < Snoep5){
                System.out.println("U heeft nog " + "€" +(Snoep5-betaald) + " nodig");
            }
        }
    }
}
