import java.util.*;
public class mutilpleOf10 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n 
        do{
            int n = sc.nextInt();
            if(n%10 == 0) {
                break;
            }
            System.out.println(n);
        }while(true);

    }
}
