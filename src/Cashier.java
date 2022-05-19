import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {

        int pearKg,appleKg,tomatoKg,bananaKg,aubergineKg;
        double pearPrice = 2.14,applePrice = 3.67,tomatoPrice = 1.11,bananaPrice = 0.95 ,aubergine = 5.0, total ;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your pearkg :");
        pearKg = input.nextInt();
        System.out.print("Please enter your applekg :");
        appleKg = input.nextInt();
        System.out.print("Please enter your tomatokg :");
        tomatoKg = input.nextInt();
        System.out.print("Please enter your bananakg :");
        bananaKg = input.nextInt();
        System.out.print("Please enter your auberginekg :");
        aubergineKg = input.nextInt();

        total = (pearKg*pearPrice + appleKg*applePrice + tomatoKg*tomatoPrice + bananaKg*bananaPrice + aubergineKg*aubergine);
        System.out.println("Total Price " + total );



    }
}
