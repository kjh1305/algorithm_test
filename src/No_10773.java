import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if (num != 0){
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        int size = stack.size();
        int sum = 0;
        for (int i=0; i<size; i++){
            sum = sum + stack.pop();
        }
        System.out.println(sum);
    }
}
