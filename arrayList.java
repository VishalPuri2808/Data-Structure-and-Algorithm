import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        list.set(2, 52);
        for (int i=0;i<5;i++){
            list.remove(0);
            System.out.println(list);
        }

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        for (int i=0;i<5;i++){
            list2.add(new ArrayList<>());
        }
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                list2.get(i).add(in.nextInt());}

        }
        

        System.err.println(list2);
    }

    
    

    
}
