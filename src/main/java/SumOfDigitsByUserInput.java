import java.util.Scanner;

public class SumOfDigitsByUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("enter the !st number :");
        x = sc.nextInt();
        System.out.println("enter 2nd number :");
        y = sc.nextInt();
        int sum = (x+y);
        System.out.println("sum is : "+sum);

    }
}
