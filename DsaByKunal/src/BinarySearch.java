
public class BinarySearch {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        int[] arr ={12,-18,-34,59,-90,134,0,2};
        int target = 90;
        int ans =binarysearch(arr,target);
        System.out.print(ans);

    }
    static int binarysearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]) {
                start=mid+1;
            }
            else if (target <arr[mid]) {
                end =mid-1;
            } else  {
               return mid;
            }
        }
        return -1;
    }
}
