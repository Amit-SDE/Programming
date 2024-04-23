public class SwappNumber {
    public static void swap(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println("after swapping :"+a +" "+b);
    }
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        System.out.println("Before swapping : "+a +" " +b);
        swap(a,b);
        swap(30,40);
    }
}
