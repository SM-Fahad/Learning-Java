import java.util.Scanner;

public class testcode {

 public static void main(String[] args) {
    
    Scanner f = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = f.nextInt();
    
    long result = 1L;
    for (int i=1; i<=n; i++) {
        result *= i; 
        
    }
    System.out.println("Factorial of " + n + " is = " + result);
    f.close();
 }
     // int k = 7;
    
    // for (int i=0; i<=10; i++) {
    //     System.out.println(k + " x " + i + " = " +  k*i);
    // }
}