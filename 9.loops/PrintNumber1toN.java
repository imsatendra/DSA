import java.util.*;
class PrintNumber1toN {
    public static void main(String[] args) {
        // System.out.println("Hello World in Java"); 
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int counter = 1;

      while(counter <= n ){
        System.out.print(counter + " ");
        counter++;
        
      }
    //   System.out.println();100
      
    }
}