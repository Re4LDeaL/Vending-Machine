import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumberFormat df = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("€");
        dfs.setGroupingSeparator('.');
        dfs.setMonetaryDecimalSeparator(',');
        ((DecimalFormat) df).setDecimalFormatSymbols(dfs);

        Scanner toetsenbord = new Scanner(System.in);
        double[] SnoepPrijzen = new double[]{1.25, 0.75, 0.9, 0.75, 1.5, 0.75};
        int Snoep = 0;

        System.out.println("Welkom in Florence's Snoepautomaat!");
        System.out.println("Om te beginnen, u moet de snoepnummer intoetsen");
        System.out.println("En daarna kunt u geld inworpen");
        System.out.println("Toets [ja] in om verder te gaan");
        System.out.println("Toets [nee] om te stoppen");

        String[] strArray = new String[] {"1. Snickers - 1.25", "2. MilkyWay - 0.75", "3. Koek - 0.90", "4. Hamburger Snoep - 0.75", "5. Florence's Speciale Snoep - 1.50", "6. Snoep Niet GOED - 0.75"};

        Scanner commando = new Scanner(System.in);
        String NeeJa;
        while(true){
            NeeJa = commando.nextLine();
        if ((NeeJa.equalsIgnoreCase("ja")) ||
                NeeJa.equalsIgnoreCase("nee")) ;
        break;
    }

    if(NeeJa.equalsIgnoreCase("ja")){
        System.out.print("Toets Snoepnummer: ");
        System.out.println(Arrays.toString(strArray));
    }
    else{
        System.out.println("Okee, doei!");
    }



        Snoep = Integer.parseInt(toetsenbord.nextLine());
        if (!(Snoep <= SnoepPrijzen.length)){
            System.out.println("Helaas, we hebben deze niet meer op voorraad.");
            toetsenbord.close();
            return;
        }

        System.out.print("De prijs betaald is: ");
        double betaald = Double.parseDouble(toetsenbord.nextLine());

        while (betaald < (SnoepPrijzen[Snoep - 1])){
            System.out.print("U heeft nog " + NumberFormat.getCurrencyInstance().format(Math.abs((betaald - SnoepPrijzen[Snoep - 1]))) + " nodig voor " + " Snoepnummer " + Snoep);
            betaald += Double.parseDouble(toetsenbord.nextLine());
        }
        System.out.println("Bedankt voor het aankoop van " + Snoep + ", uw wisselgeld is " + NumberFormat.getCurrencyInstance().format(betaald - SnoepPrijzen[Snoep - 1]));

        toetsenbord.close();
        }
    }

