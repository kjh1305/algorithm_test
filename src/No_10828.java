import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class No_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        for(int i=0; i<n; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String s = stringTokenizer.nextToken();
            if (s.indexOf("push") != -1) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                stack.push(num);
            } else if (s.indexOf("top") != -1){
                if (stack.empty() == true){
                    System.out.println("-1");
                } else {
                    Integer pop = stack.pop();
                    System.out.println(pop);
                    stack.push(pop);
                }
            } else if (s.indexOf("size") != -1){
                System.out.println(stack.size());
            } else if (s.indexOf("empty") != -1){
                if (stack.empty() == true){
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.indexOf("pop") != -1){
                if (stack.empty() == true){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}
