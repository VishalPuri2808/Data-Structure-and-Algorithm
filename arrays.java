import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    static void insert(int[] v){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<v.length ; i++){
             v[i]=in.nextInt();
        }
    }

    static void print(int[] v){
        for(int num: v){
            System.out.print(num + " ");
        }
        System.out.println("\nWith way 2 : \n"+Arrays.toString(v));
    }

    static void dInsert(int[][] v){
        Scanner in = new Scanner(System.in);
        int element=0;
        for(int i=0; i<v.length; i++){
            for(int j=0; j<v[i].length;j++){
                element = in.nextInt();
                v[i][j]=element;
            }
        }
    }

    static void dPrint(int[][] v){
        for(int i=0; i<v.length; i++){
            System.out.println(Arrays.toString(v[i]));
        }

        System.out.println("\nWith way 3:\n");
        for(int[] arr: v){
            System.out.print(Arrays.toString(arr));
        }

    }

    static void userD(String[][] s){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<s.length; i++){
            for(int j=0; j<s[i].length; j++){
                System.out.print("Insert: ");
                String name= in.nextLine();
                s[i][j]=name;
            }
            System.out.println();
        }
    }

    static void userP(String[][] s){
        for(int i=0; i<s.length; i++){
                System.out.println(Arrays.toString(s[i]));            
        }
        for (String[] arr: s){
            System.out.println(Arrays.toString(arr));
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        // insert(arr);
        // print(arr);
System.out.println("\n..............................2D Array................................................");

        int[][] arr2 = new int[3][3];
        // dInsert(arr2);
        // dPrint(arr2);

        String[][] arr3 = new String[2][2];
        userD(arr3);
        userP(arr3);

    }
    
}
