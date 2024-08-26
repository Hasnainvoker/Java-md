public class Floor {
    public static void main(String[] args) {
        int[] arr ={12,18,34,59,90,134};
        int target = 11;
        int ans =floor(arr,target);
        System.out.print(ans);

    }
    static int floor(int [] arr, int target){
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
        return end;
    }
    }

