import java.util.Scanner;

public class SumOfDigitsOfUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number :" );
        int x,y ;

        x = sc.nextInt();
        System.out.println("enter 2nd number:");
        y = sc.nextInt();
        int sum = (x+y);
        System.out.println("sum is :" + sum);
    }
}
