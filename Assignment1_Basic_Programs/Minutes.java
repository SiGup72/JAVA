import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        int m = scan.nextInt();

        int tdays = m / (60 * 24); 

        int years = tdays / 365;
        int rdays = tdays % 365;
        int months = rdays / 30;  
        int days = rdays % 30;

        System.out.println(m + " minutes is approximately:");
        System.out.println(years + "-" + months + "-" + days);

        System.out.println("SIA GUPTA 24CSU201");
    }
}



