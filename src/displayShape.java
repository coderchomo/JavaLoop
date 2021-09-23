import java.util.Scanner;
public class displayShape {
        public static void main(String[] args) {
            System.out.println("MENU");
            System.out.println("1.Print Rectangle");
            System.out.println("2.Print The Square Triangle");
            System.out.println("3.Print Isosceles Triangle");
            System.out.println("4.Exit");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your choice:");
            while(true){
                int choice=scanner.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Print rectangle");
                        Scanner rec=new Scanner(System.in);
                        int width,height;
                        System.out.println("Enter Height");
                        height=rec.nextInt();
                        System.out.println("Enter width");
                        width=rec.nextInt();
                        for(int i=0;i<height;i++) {
                            System.out.println("");
                            for (int j=0;j<width;j++) {
                                System.out.print("*");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Print The Square Triangle(bottom-left)");
                        for(int i=1;i<=5;i++){
                            System.out.println("");
                            for(int j=1;j<=i;j++){
                                System.out.print("*");
                            }
                        }
                        System.out.println("");
                        System.out.println("Print The Square Triangle(top-left)");
                        for (int i=5;i>=1;i--){
                            System.out.println("");
                            for (int j=1;j<=i;j++){
                                System.out.print("*");
                            }
                        }
                        System.out.println("");
                        System.out.println("Print The Square Triangle(bottom-right)");
                        for (int i=5;i>0;i--){
                            System.out.println("");
                            for (int j=0;j<i;j++){
                                System.out.print("");
                                for (int k=0;k<(5-i);k++){
                                    System.out.print("*");
                                }
                            }
                        }
                        System.out.println("");
                        System.out.println("Print The Square Triangle(top-right)");
                        break;
                    case 3:

                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("No choice");
                        break;
                }
            }
        }
    }
