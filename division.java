import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number 1");
        double num1 = sc.nextInt();
        System.out.println("Enter number 2");
        double num2 = sc.nextInt();
        if(num2>0){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Invalid input!!,number 2 cannot be zero ");
        }
    }
}
