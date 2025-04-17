package Day1;
import java.util.Arrays;
import java.util.Scanner;

public class overLoading {

    static int sum(int a, int b){
        return a+b; 
    }
    static int sum(int a, int b, int c){
        return a+b+c; 
    }
    static String sum(){
        return "Sum is :";
    }
// passing int Variable arguments
    static void sum(int ...v){
            System.out.println(Arrays.toString(v));
        

    }

    static int sum (int a, int b, int ...v){
        int sum=0;
           sum = a +b;
        for(int i=0;i<v.length;i++){
           sum=sum+v[i];
        }
    return sum;
    }
// passing String variables arguments
    static void sum(String ...s){
        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args) {
        System.out.println(sum() +sum(1,2)+" and " +sum(3,2,1)  );

        int[] x = {3,2,4,1,3};
        sum(x);
        System.out.println("Printing vaiable arguments : " +sum(1,2,x));
        String[] s = {"vi "+"jio "+"airtel"};
        sum(s);
    }
    
}
