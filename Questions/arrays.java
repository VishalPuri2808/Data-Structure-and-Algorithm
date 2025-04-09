package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void Acreate(int[] arr, int s){   
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the elements:");
        for(int i=0; i<s;i++){
            arr[i]=in.nextInt();
        }
    }
    static void Aprint(int[] v){
        System.out.println(Arrays.toString(v));
    }
    static void aSwap(int[] v,int i1,int i2){
        int temp= v[i1-1];
        v[i1-1]=v[i2-1];
        v[i2-1]=temp;
    }
    static void aReverse(int[] v){
        System.out.print("Array after reverse:");
    int start=1;
    int end=v.length;
    if(v.length==0){
        System.out.println("Array is empty");
    }
    while(start < end){
        aSwap(v, start, end);
        start++;
        end--;
    }
    }
    static void searchElement(int[] v, int e){
        for(int i=0; i<v.length; i++){
            if(v[i]==e){
                System.out.print("Element is present at index:" + (i+1));
            }
            else{System.out.println("Not found!");}
        }   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int s= in.nextInt();
        int[] arr =new int[s];
        Acreate(arr, s);
        Aprint(arr);
        System.out.print("Enter the indexes to swap:");
        int i1=in.nextInt();
        int i2=in.nextInt();
        aSwap(arr,i1,i2);
        Aprint(arr);
        aReverse(arr);
        Aprint(arr);
        System.out.print("Element you want to search:");
        int e=in.nextInt();
        searchElement(arr, e);



        
    }
    
}
