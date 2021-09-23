import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner draw=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Draw Triangle");
        System.out.println("2.Draw Square");
        System.out.println("3.Draw the rectangle");
        System.out.println("0.Exit");
        System.out.println("Enter your choice:");
        while(true){
            int choice=draw.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("$$$$$");
                    System.out.println("$$$$");
                    System.out.println("$$$");
                    System.out.println("$$");
                    System.out.println("$");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("$$$$$$$");
                    System.out.println("$$$$$$$");
                    System.out.println("$$$$$$$");
                    break;
                case 3:
                    System.out.println("Draw rectangle");
                    System.out.println("$$$$$$$$$");
                    System.out.println("$$$$$$$$$");
                    System.out.println("$$$$$$$$$");
                    System.out.println("$$$$$$$$$");
                    System.out.println("$$$$$$$$$");
                    System.out.println("$$$$$$$$$");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
