import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        int number1,number2;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1=num.nextInt();
        System.out.println("Enter number 2: ");
        number2=num.nextInt();
        number1=Math.abs(number1);
        number2=Math.abs(number2);
        if(number1==0||number2==0){
            System.out.println("No Greatest Factor");
        }
        while(number1!=number2){
            if(number1>number2){
                number1=number1-number2;
            }else{
                number2=number2-number1;
            }
        }
        System.out.println("Greatest Factor is: "+number1);
    }
}
