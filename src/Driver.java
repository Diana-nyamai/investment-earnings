import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter your buying price per share ");
        double buyingprice = userinput.nextDouble();

        int day = 1;
        double closingprice = 0.1;

        while(true){
            System.out.println("Enter closing price for the day");
            closingprice = userinput.nextDouble();
            if(closingprice < 0.0) break;
            double earnings = closingprice - buyingprice;
            if(earnings > 0.0){
                System.out.println("After day " +day+ ", you earned " + earnings + "per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " +day+ ", you lost " + (-earnings) + "per share.");
                
            }
        }
    }
}
