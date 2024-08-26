import java.util.Arrays;
public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr ={1,2,7,3,1,1,1,2,3,3};
        int target=6;
        int len =LongestSubarraySumWithSumK(arr,target);
        System.out.println(len);
        int target2=7;
        boolean _2sum=_2sumProblem(target2,arr);
        System.out.println(_2sum);

    }
// CAN BE DONE ALSO USING HASHMAPS WHERE WE GET INDEXES AS ANSWER OF THE ADDING ELEMENTS.
    private static boolean _2sumProblem(int target2, int[] arr) {
        int left=0;
        int right = arr.length-1;
        Arrays.sort(arr);
        int sum=0;
        while(left<right){
           sum=arr[right]+arr[left];
           if(sum ==target2)
           {
               return true;
           } else if (sum>target2) right--;
            else left++;
        }
        return false;
    }

    // THIS METHOD IS ONLY WHEN THE ARRAY HAS ONLY +VE'S AND 0'S.
    private static int LongestSubarraySumWithSumK(int[] arr,int target) {
        int left=0;
        int right =0;
        int sum=arr[0];
        int maxlen =0;
        int arr_lenght=arr.length;
        int count =0;
        while(right< arr_lenght){
            while(sum>target && left<=right){
                sum =sum-arr[left];
                left++;
            }
            if(sum==target){
                maxlen =Math.max(maxlen,right -left +1);
                count++;
            }
            right++;
            if(right<arr_lenght) sum=sum+arr[right];

        }
        System.out.println(count);
        return maxlen;
    }

}
