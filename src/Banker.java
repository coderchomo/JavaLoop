import java.util.Scanner;
public class Banker {
    public static void main(String[] args) {
        double firstMoney,rateByMonth,month;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tell me how much u put into a bank in the first month?: ");
        firstMoney=scanner.nextDouble();
        System.out.println("And rate by month of that Bank is?: ");
        rateByMonth=scanner.nextDouble();
        System.out.println("And last question. How long from first month?: ");
        month=scanner.nextDouble();
        double result=firstMoney*rateByMonth*month;
        System.out.println("So you will got "+result+" after "+month+" month");
    }
}
