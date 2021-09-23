import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter checking number ");
        number=scanner.nextInt();
        if(isPrime(number)){
            System.out.println("This number is Prime");
        }else{
            System.out.println("This is not a Prime");
        }
    }
    public static boolean isPrime(int number){
        if(number==1)return false;
        if(number==2)return true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)return false;
        }return true;
    }

}
