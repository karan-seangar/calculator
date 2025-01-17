import java.util.Scanner;
public class largest_number {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number 1");
        double num1 = sc.nextInt();
        System.out.println("Enter number 2");
        double num2 = sc.nextInt();
        System.out.println("Enter number 3");
        double num3 = sc.nextInt();
        double greatest;

        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num1 && num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        
        System.out.println("The greatest number is: " + greatest);
    }
}
