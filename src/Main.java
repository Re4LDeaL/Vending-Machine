import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner (System.in);
        double[] SnoepPrijzen = new double[] {1.25, 0.75, 0.9, 0.75, 1.5, 0.75};
        int Snoep = 0;

        System.out.print("Toets Snoepnummer: ");
        Snoep = Integer.parseInt(toetsenbord.nextLine());
        if (!(Snoep <= SnoepPrijzen.length)){
            System.out.println("Helaas, we hebben deze niet meer op voorraad.");
            toetsenbord.close();
            return;
        }

        System.out.print("De prijs betaald is: ");
        double betaald = Double.parseDouble(toetsenbord.nextLine());

        while (betaald < (SnoepPrijzen[Snoep - 1])){
            System.out.print("U heeft nog " + "€" + NumberFormat.getCurrencyInstance().format(Math.abs((betaald - SnoepPrijzen[Snoep - 1]))) + " nodig voor " + Snoep);
            betaald += Double.parseDouble(toetsenbord.nextLine());
        }
        System.out.println("Bedankt voor het aankoop van " + Snoep + ", uw wisselgeld is " + NumberFormat.getCurrencyInstance().format(betaald - SnoepPrijzen[Snoep - 1]));

        toetsenbord.close();
        }
    }

