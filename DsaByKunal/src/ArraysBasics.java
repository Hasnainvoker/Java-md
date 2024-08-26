import java.util.*;
public class ArraysBasics {
    public static void main(String[] args) {
        int[] arr = {12, 34, 11, 56, 78, 21,2,3,1,-56};
        int[] arr2 ={12,-18,-34,59,-90,134,0,2};
        int[] arr3 ={9,-1,-3,593,-90,12,8,2,0};
        int maxelement = maxele(arr);
        int minelement = minele(arr);
        System.out.println(minelement);
        System.out.println(maxelement);
        int _2ndlargestele= SecondLargest(arr);
        System.out.println(_2ndlargestele);
        int _2nssmall= SecondSmallest(arr);
        System.out.println(_2nssmall);
        int[] dup ={1,1,2,2};
       int dup_answer = RemoveDup(dup);
        System.out.println(dup_answer);
        Selection_sort(arr2);
        Insertion_sort(arr3);

    }

    static int maxele(int[] arr) { //MAX ELEMENT
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        return maxi;
    }

    //MIN ELEMENT
    static int minele(int[] arr) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

static int SecondLargest(int[] arr){ //2ND LARGEST
        int largest =arr[0];
        int _2largest = -9999;

        for(int i=1;i< arr.length;i++){
            if(arr[i]>largest){
                _2largest =largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>_2largest){
                    _2largest=arr[i];
            }

        }
    return _2largest;
    }


    static int SecondSmallest(int[] arr){ //2ND SMALLEST
        int smallest =arr[0];
        int _2smallest = 999999;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<smallest){
                _2smallest =smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<_2smallest){
                _2smallest=arr[i];
            }

        }
        return _2smallest;

    }

    // REMOVE DUPLICATES IN SORTED ARRAY
    static int RemoveDup(int[] arr){
     int i=0;
     for(int j=1;j< arr.length;j++){
         if(arr[i]!=arr[j]){
             arr[i+1] =arr[j];
             i++;
         }

     }
        System.out.println(Arrays.toString(arr));
     return i+1;
    }

    static void Selection_sort(int [] arr)
    {
        for(int i=0;i< arr.length-1;i++){ // N-1 PASSES
            int min=i;
            for(int j=i+1;j< arr.length;j++){ // N - ITERATIONS
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp =arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion_sort(int [] arr)
    {
        for(int i=1;i< arr.length;i++){
            int temp=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>temp){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1] =temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}