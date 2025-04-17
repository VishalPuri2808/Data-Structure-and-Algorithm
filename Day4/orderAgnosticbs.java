package Day4;

import java.util.Scanner;

public class orderAgnosticBS {

    static int search(int[] arr, int target){
            int start=0;
            int end = arr.length -1;
            boolean Asc = arr[start]<arr[end];

            if(start == end){return -1;}
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){return mid;}
                if(Asc){
                 if(arr[mid]<target){
                    start=mid+1;}
                 else{
                    end=mid-1;}
                }
                else{
                if(arr[mid]>target){
                    start=mid+1;}
                 else{
                    end=mid-1;}
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= {10,9,8,7,6,5,4,3,2,1};
        int target=in.nextInt();
        System.out.println(search(arr, target));
        
    }
    
}
