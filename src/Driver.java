import java.util.Scanner;
import java.text.DecimalFormat;

public class Driver {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingprice = userinput.nextDouble();

        int day = 1;
        double closingprice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true){
            System.out.println("Enter closing price for day " + day + "(any negative values to leave)");
            closingprice = userinput.nextDouble();
            if(closingprice < 0.0) break;
            double earnings = closingprice - buyingprice;
            if(earnings > 0.0){
                System.out.println("After day " +day+ ", you earned " + df.format(earnings) + "  per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " +day+ ", you lost " + df.format(-earnings) + "per share.");
            }
            else {
                System.out.println("After day " + day + " you have " + "no earnings per share" );
            }
            day++;
        }
        userinput.close();
    }
}
