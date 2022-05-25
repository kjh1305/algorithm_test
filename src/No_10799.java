import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_10799 {
    public static void main(String[] args) throws IOException {
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        pipe(str);

    }
    public static void pipe(String str){
        // str 문자열 char 배열로 만들기
        char[] chars = str.toCharArray();
        // 스택 생성
        Stack<Character> stack = new Stack<>();
        // 쪼개진 새막대기 합계
        int sum = 0;
        // 직전 입력 초기화
        char tmp_c = ' ';
        // chars 반복
        for (char c: chars){
            // 여는 괄호면
            if (c == '('){
                // 스택에 푸시
                stack.push(c);
                // 닫는 괄호면
            } else if (c == ')'){
                // 직전입력 비교
                // 직전입력이 '(' 이면
                if (tmp_c == '('){
                    // 스택에서 pop
                    stack.pop();
                    // '('가 맞으면 "()" 레이저 이므로 앞에 여는 괄호 총 개수(스택의 사이즈)를 count
                    sum += stack.size();
                // 직전입력이 ')' 이면
                } else if (tmp_c == ')'){
                    // pop 가 ')'면 연속 닫는 괄호 이므로 1을 더해준다.
                    stack.pop();
                    sum += 1;
                }
            }
            // 직전 입력
            tmp_c = c;
        }
        System.out.println(sum);
    }
}
