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
        int k = n;
        ArrayList<String> result = new ArrayList<>();
        for (int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            stack.push(num);
            result.add("+");
            if (num == k){
                stack.pop();
                k=-1;
                result.add("-");
                ArrayList<Integer> tmp_list = new ArrayList<>();
                for (int j=0; j<stack.size(); j++){
                    int pop_num = stack.pop();
                    tmp_list.add(pop_num);
                }
            }
        }
    }
}
