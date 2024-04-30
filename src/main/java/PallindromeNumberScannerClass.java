import java.util.Scanner;

public class PallindromeNumberScannerClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int rev =0;
         int temp=num;
        while (num>0)
        {
            int rem =num%10;
            num= num/10;
            rev = rev*10+rem;
        }

       if (temp==rev)
      {
           System.out.println("Pallindrome Number");
      }
        else
       {
            System.out.println("Not a Pallindrome Number");
       }
    }
}
