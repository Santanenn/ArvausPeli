import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input;
        int arvaukset = 0;
        String oikeaNimi = ("Kalevi");

        do{
            System.out.println("Arvaa nimi. Kirjoita lopeta lopettaaksesi.");
            input = in.nextLine();       
            arvaukset++;     

            if(input.equals(oikeaNimi))
            {
                System.out.println("Oikein!");
                System.out.println("Arvasit " + arvaukset + " kertaa.");
                break;
            }
            if(input.equals("lopeta"))
            {
                System.out.println("Arvasit " + arvaukset + " kertaa.");
                break;
            }
        }
        while(true);


    }
}
