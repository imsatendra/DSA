import java.util.*;
public class SumofFirtsNnaturalNumber {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // for(int i=1;i<=n;i++){
        //     sum += i;
        // }

        // System.out.println("sum " + sum);
        int i=1;
        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println("sum " + sum);
    }
}
