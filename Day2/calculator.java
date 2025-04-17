package Day2;
import java.util.Scanner;

public class calculator{

    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static float div(float a, float b){
        return a/b;
    }

    static String wel(String name){
        return "Welcome "+ name +" to Calculator";
    }

     

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine(); 
        System.out.println(wel(name));

        System.out.println("enter 1st no.");
        int a = in.nextInt();
        System.out.println("enter 2nd no.");
        int b = in.nextInt();

        System.out.println("sum is:" + sum(a,b)+ "| sub is: "+sub(a,b)+ "| multiplication is :" +mul(a, b)+ "| division is :"+ div(a,b));

    } 

}