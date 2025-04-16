package Day4;
import java.util.Scanner;
public class binaySearch {
    static int search(int[]arr, int target){
        int start=0;
        int end = arr.length -1;
        if(start == end){return -1;}
        while(start<=end){
            int mid=end+(start-end)/2;
             if(arr[mid]<target){start=mid+1;}
             else if(arr[mid]>target){end=mid-1;}
             else{return mid;}
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,3,4,5,12,13,19,20};
        int target=in.nextInt();
        System.out.println(search(arr, target));
    }
}
