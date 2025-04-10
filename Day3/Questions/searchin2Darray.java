package Day3.Questions;

import java.util.Arrays;

public class searchin2Darray {

    static int[] search(int[][] a,int e){
        if(a.length==0){return new int[] {0,0};}
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==e){return new int[] {i+1,j+1};}
            }
        }
        return new int[] {0,0};

    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{43,12,54,12},{12,4,1,21}};
        System.out.println(Arrays.toString(search(arr, 43)));
        
    }

    
}
