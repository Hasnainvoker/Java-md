public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr= {121,1200,56,234,678545,34,9000};
        int ans =EvenDigits(arr);
        System.out.println(ans);

    }

    static int EvenDigits(int[] arr){
        int count =0;
        for(int nums:arr){
            if(even(nums))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
         int no_of_digits=digits(nums);
         if(no_of_digits%2 ==0){
             return true;
         }
         return false;
    }

    static int digits(int nums){
        int count=0;
        while(nums>0){
            count++;
            nums =nums/10;
        }
        return count;
    }
}
