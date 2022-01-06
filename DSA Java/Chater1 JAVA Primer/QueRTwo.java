import java.util.*;

public class QueRTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] A = new int[n];
        

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            
        }
        int [] B = A.clone();

        System.out.println(Arrays.toString(B));
    }
    
}
//this was an verbel problem this profgram only takes arry input 
//uncomplete