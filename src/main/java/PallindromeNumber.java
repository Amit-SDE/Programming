public class PallindromeNumber {
    public static void main(String[] args)
    {
        int num = 3553;
        int rev = 0;
        int temp = num;
        while(num>0)
        {
            int rem = num%10;
            num=num/10;
            rev = rev*10+rem;
        }
        if(temp==rev)
        {
            System.out.println("Pallindrome Number");
        }
        else
        {
            System.out.println("Not a pallindrome Number");
        }

    }
}
