import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.print("\nEnter a first number:");
            int a=s.nextInt();
            System.out.print("Enter a second number: ");
            int b=s.nextInt();
            System.out.println("\nChoose any number: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit :");
            int n=s.nextInt();
            switch(n){
                case 1:
                    System.out.print("Addition of "+ a + " and " + b +" = "+ add(a,b));
                    System.out.println("\n-------------------------");
                    break;
                case 2:
                    System.out.print("Subtraction of "+ a + " and " + b +" = "+ sub(a,b));
                    System.out.println("\n-------------------------");
                    break;
                case 3:
                    System.out.print("Multiplication of "+ a + " and " + b +" = "+ mul(a,b));
                    System.out.println("n-------------------------");
                    break;
                case 4:
                if(b!=0){
                    System.out.print("Division of "+ a + " and " + b +" = "+ div(a,b));
                    System.out.println("\n-------------------------");
                    break;
                }
                else{
                    System.out.println("Cannot divide by zero");
                    System.out.println("\n-------------------------");
                    break;
                }
                case 5:
                    System.out.print("Exiting.....");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    public static int add(int a,int b){
        return a + b;
    }
    public static int sub(int a,int b){
        return a - b;
    }
    public static int mul(int a,int b){
        return a * b;
    }
    public static float div(int a,int b){
        return (float) a / b;
    }
}