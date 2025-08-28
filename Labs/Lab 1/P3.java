
import java.util.Scanner;


public class P3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("starting: ");
        int starting = input.nextInt();

        System.out.println("ending: ");
        int ending = input.nextInt();

        System.out.println("increment: ");
        int increment = input.nextInt();

        if (starting > ending){
            System.out.println("Error Input!!");
            input.close();
            return;
        }

        final double CONVERSION_RATE = 1.82;

        System.out.println("US$\t\tS$");
        System.out.println("--------------");
        for (int usd = starting; usd <= ending; usd += increment){
            double sgd = usd * CONVERSION_RATE;
            if (sgd == (int)sgd){
                System.out.printf("%d\t\t%.2f\n", usd, sgd);
            } else {
                System.out.printf("%d\t\t%.2f\n", usd, sgd);
            }
        }

        System.out.println("US$\t\tS$");
        System.out.println("--------------");
        int usd = starting;
        while (usd <= ending) {
            double sgd = usd * CONVERSION_RATE;
            System.out.printf("%d\t\t%.1f\n", usd, sgd);
            usd += increment;
        }

        System.out.println("US$\t\tS$");
        System.out.println("--------------");
        usd = starting;
        do {
            double sgd = usd * CONVERSION_RATE;
            System.out.printf("%d\t\t%.1f\n", usd, sgd);
            usd += increment;
        } while (usd <= ending);
        
        input.close();

    }
}