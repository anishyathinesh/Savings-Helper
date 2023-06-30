import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //pls commit rn
        Scanner in = new Scanner(System.in);

        System.out.print("enter base money: ");
        double baseMoney = Double.parseDouble(in.nextLine());

        System.out.println("essentials-savings-spending? ex 50-30-20");
        String divs = in.nextLine();

        String[] divSplit = divs.strip().split("-");
        ArrayList<Double> lst = new ArrayList<>();

        for (int i = 0; i < divSplit.length; i++) {
            lst.add(Double.parseDouble(divSplit[i]));
        }

        System.out.println("essential: $" + baseMoney * (lst.get(0) / 100));
        System.out.println("savings: $" + baseMoney * (lst.get(1) / 100));
        System.out.println("spending: $" + baseMoney * (lst.get(2) / 100));

        }

}