public class BasicsRecursion {
    public static void main(String[] args) {
        int ans =fact(5);
        System.out.println(ans);
        int prod =funprod(1234);
        System.out.println(prod);
    }

    private static int funprod(int n) { // PRODUCT OF DIGITS
        if(n%10 == n){
            return n;
        }
        return (n%10) * funprod(n/10);
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }

}
