import java.util.*;
public class MaxConcOnes {
    public static void main(String[] args) {
        int[] arr ={0,1,1,1,0,1};
        Scanner sc=new Scanner(System.in);
       // int d= sc.nextInt();
        int ans=MaxOnes(arr);
        System.out.println(ans);
        int[] arr2={56,-99,67,45,90,100,2,3};
        int RotateBy=2;
        RotateByD_Places(arr2,RotateBy);

    }

    private static void RotateByD_Places(int[] arr2,int d) {
        d=d%10;
        if(d==0) return ;
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] =arr2[i];
        }
        for(int i=d;i< arr2.length;i++){
            arr2[i-d]=arr2[i];
        }

        for(int i= arr2.length-d;i< arr2.length;i++)
        {
            arr2[i]=temp[i-(arr2.length-d)];
        }
        for(int nums :arr2){
            System.out.println(nums +" ");
        }

    }

    static int MaxOnes(int[] arr){
        int maxi=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){
                count++;
                maxi =Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }
}
