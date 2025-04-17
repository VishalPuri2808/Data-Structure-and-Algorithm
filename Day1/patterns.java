package Day1;
import java.util.Scanner;

public class patterns {
    
    public static void pattern1(int n){
        
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            System.out.print("*");
        }
        System.out.println();
    }}
    
    public static void pattern2(int n){
        
    for (int i=1; i<=n; i++){
        for (int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }}
    
    public static void pattern3(int n){
        
    for (int i=0; i<n; i++){
        for (int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }}
    
    public static void pattern4(int n){
        
    for (int i=1; i<=n; i++){
        for (int j=0; j<i; j++){
            System.out.print(i);
        }
        System.out.println();
    }}
    
    public static void pattern6(int n){
        
    for (int i=0; i<n; i++){
        for (int j=2; j<n-i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }}
    
    public static void pattern5(int n){
        
    for (int i=n-1; i>=1; i--){
        for (int j=0; j<i; j++){
            System.out.print(i);
        }
        System.out.println();
    }}
    
    
    
    public static void pattern7(int n){
     
    for (int j=0; j<n; j++){ 
    for (int i=0; i<n-j-1; i++){
    System.out.print(" ");    
    }
    for (int i=0; i<2*j+1; i++){
    System.out.print("*");    
    }
    
    for (int i=0; i<n-j-1; i++){
    System.out.print(" ");    
    }
    System.out.println();
    }}
    
    public static void pattern8(int n){
     
    for (int j=n-1; j>0; j--){ 
    for (int i=0; i<=n-j-1; i++){
    System.out.print(" ");    
    }
    for (int i=0; i<2*j-1; i++){
    System.out.print("*");    
    }
    
    for (int i=0; i<=n-j-1; i++){
    System.out.print(" ");    
    }
    System.out.println();
    }}
    
    
    public static void pattern9(int n){
     
    for (int j=0; j<n; j++){ 
    for (int i=0; i<n-j-1; i++){
    System.out.print(" ");    
    }
    for (int i=0; i<2*j+1; i++){
    System.out.print(j+1);    
    }
    
    for (int i=0; i<n-j-1; i++){
    System.out.print(" ");    
    }
    System.out.println();
    }}
    
    public static void pattern10(int n){
     
    for (int j=n-1; j>0; j--){ 
    for (int i=0; i<=n-j-1; i++){
    System.out.print(" ");    
    }
    for (int i=0; i<2*j-1; i++){
    System.out.print(j);    
    }
    
    for (int i=0; i<=n-j-1; i++){
    System.out.print(" ");    
    }
    System.out.println();
    }}
    
    
    public static void pattern11(int n){
    int start = 0;
    for (int i=1; i<=n; i++){
    if(i%2==0){
	start = 1;}
    else start = 0;
    
    for (int j=0; j<i; j++){
    System.out.print(start);
    start = 1 - start;
    }
    System.out.println();
    }}
    
    public static void pattern12(int n){
    int start = 1;
    for (int i=1; i<=n; i++){
    if(i%2==0){
	start = 0;}
    else start = 1;
    
    for (int j=0; j<i; j++){
    System.out.print(start);
    start = 1 - start;
    }
    System.out.println();
    }}
    
    
    public static void pattern13(int n){
    for (int i= 1; i<=n; i++){
    
    for (int j=1;j<=i;j++){
	System.out.print(i);}
    for (int j=1; j<=(n-i)*2 ; j++){
    System.out.print(" ");}
    for (int j=1;j<=i;j++){
	System.out.print(i);}
    
    System.out.println();
    }}
    
    public static void pattern14(int n){
    for (int i= 1; i<=n; i++){
    
    for (int j=1;j<=i;j++){
	System.out.print(j);}
    for (int j=1; j<=(n-i)*2 ; j++){
    System.out.print(" ");}
    for (int j=i;j>=1;j--){
	System.out.print(j);}
    
    System.out.println();
    }}
    
    
    public static void pattern15(int n){
    int k=1;
    for (int i =0; i<n; i++){
    for (int j=0; j<=i; j++){
    System.out.print(k++ + " ");
    }
    System.out.println();
    }}
    
    public static void pattern16(int n){
    int k=65;
    for (int i=0; i<n; i++){
    for (int j=0; j<=i; j++){
    System.out.print((char)k++ + " ");
    }
    System.out.println();
    }
    }
    
    public static void pattern17(int n){
    for (int i=0; i<n; i++){
    for (int j=65; j<=i+65; j++){
    System.out.print((char)j + " ");
    }
    System.out.println();
    }
    }
    
    
    public static void pattern18(int n){
    for (int i=0; i<n; i++){
    for (char ch='a'; ch<='a' + i; ch++){
    System.out.print(ch + " ");
    }
    System.out.println();
    }
    }
    
    public static void pattern19(int n){
    for (int i=1; i<=n; i++){
    for (char ch='a'; ch<'a'+n-i; ch++){
    System.out.print(ch + " ");
    }
    System.out.println();
    }
    }
    
    public static void pattern20(int n){
    for (int i=0; i<n; i++){
    
    for (char ch='a'; ch<='a'+i;ch++){
    System.out.print(ch);}

    for (int j=0; j<=2*(n-i)-3; j++){
    System.out.print(" ");
    }

    for (char ch=(char)('a'+ i); ch>='a';ch--){
    System.out.print(ch);
    }
    System.out.println();
    }
    }
    
    public static void pattern21(int n){
    for (int i=0; i<n; i++){
    
    for (char ch='a'; ch<'a'+n-i;ch++){
    System.out.print(ch);}

    for (int j=0; j<2*i; j++){
    System.out.print(" ");
    }

    for (char ch=(char)('a'+n-i-1); ch>='a';ch--){
    System.out.print(ch);
    }
    System.out.println();
    }
    }



  public static void main(String[] args) {
      
      Scanner obj = new Scanner(System.in);
      int n = 5;
      pattern1(n);
      System.out.println(".............................................................................");
      pattern2(n);
      System.out.println(".............................................................................");
      pattern3(n);
      pattern6(n);
      System.out.println(".............................................................................");
      pattern4(n);
      pattern5(n);
      System.out.println(".............................................................................");
      pattern7(n);
      pattern8(n);
      System.out.println(".............................................................................");
      pattern9(n);
      pattern10(n);

System.out.println("........................................................");

	  pattern11(n);
      System.out.println(".............................................................................");
 	  pattern12(n);
       System.out.println(".............................................................................");
 	  pattern13(n);
       System.out.println(".............................................................................");
      
 	  pattern14(n);
       System.out.println(".............................................................................");
 	  pattern15(n);
       System.out.println(".............................................................................");
 	  pattern16(n);
       System.out.println(".............................................................................");
 	  pattern17(n);
       System.out.println(".............................................................................");
 	  pattern18(n);
 	  pattern19(n);
System.out.println(".............................................................................");

 	  pattern20(n);
 	  pattern21(n);



      
      
      
        
    
  }
}