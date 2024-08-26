public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={12,18,34,59,90,134};
        int target = 45;
        int ans =ceiling(arr,target);
        System.out.print(ans);

    }
    static int ceiling(int [] arr, int target){
        if(target >arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while(start<=end){ // CONDITION BREAKS WHEN START = END+1; OR START>END
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
        return start;
    }

}
