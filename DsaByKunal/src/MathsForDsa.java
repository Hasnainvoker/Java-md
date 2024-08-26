

public class MathsForDsa {
    public static void main(String[] args) {
        int[] arr ={2,3,3,4,2,6,4,2};
        System.out.println(ans(arr));
        int ans =bit(10,1);
        System.out.println(ans);
       boolean res =power2(234567);
        System.out.println(res);


    }

    private static boolean power2(int n) {
        int count =0;
        while(n>0){
            int ans=n&1;
            n =n>>1;
            if(ans==1)
            {
                count++;
            }

        }
        System.out.println("the no of 1's in this number are: " + count);
       if(count==1){
           return true;
       }
       else
       return false;
    }

    // FIND THE ELEMENT OCCURRING ONLY ONCE IN THE ARRAY
  // WHERE OTHERS ARE OCCURRING TWICE.
  // ANS = XOR THE WHOLE ARRAY
// if(n &(n-1)) ==0 -----------> then n is power of two.
    private  static int ans(int[] arr) {
        int unique =0;
        for(int nums:arr){
            unique =unique^nums;
        }
        return unique;
    }

    // FIND THE ith BIT
    static int bit(int num, int bitno){
        int ans =((num & (1 << (bitno - 1))) >> (bitno - 1));
        return ans;
    }
    // NUMBER DIVISIBLE BY 2 OR NOT


}
