import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class No_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i=1; i<=n; i++){
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                for (int j=max+1; j<=num; j++){
                    stack.push(j);
                    result.add("+");
                }
                max = num;
                stack.pop();
                result.add("-");
            } else {
                int pop_num = stack.pop();
                if (pop_num > num){
                    result.clear();
                    result.add("NO");
                    break;
                } else {
                    result.add("-");
                }
            }
        }
        result.stream().forEach(System.out::println);
    }
}
