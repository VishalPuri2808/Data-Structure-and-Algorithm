package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {

    static int[] lSearch(int[] arr,int e){
        if(arr.length==0){
            return new int[] {};
        }
        for(int i=0;i<arr.length;i++){if(arr[i]==e){return new int[] {i+1,arr[i]};}}
        return new int[] {};
    }
    static boolean sSearch(String name, char a){
        if(name.isEmpty()){return false;}
        for(int i=0;i<name.length();i++){
            if(a==name.charAt(i)){return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr = {21,31,43,1,0,3,1,4,2,5};
        String str= "Pravan";
        System.out.print(str);
        System.out.println(sSearch(str,'v'));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(lSearch(arr,3)));
    }
    
}
