import java.util.Scanner;
public class first20Prime {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int numbers;
        System.out.println("Enter number of Prime you want");
        numbers=number.nextInt();
        int count=0;
        int N=2;
        while(count<numbers){
            if(isPrime(N)){
                System.out.println(N);
                count++;
            }N++;
        }
    }
    public static boolean isPrime(int n){
        if(n==2)return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }return true;
    }
}
