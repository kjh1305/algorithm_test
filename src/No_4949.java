import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_4949 {
    public static void main(String[] args) throws IOException {
        /**
         * 하나 또는 여러줄에 걸쳐서 문자열이 주어진다. 각 문자열은 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")등으로 이루어져 있으며, 길이는 100글자보다 작거나 같다. 각 줄은 마침표(".")로 끝난다.
         *
         * 입력의 종료조건으로 맨 마지막에 점 하나(".")가 들어온다.
         *
         * 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
         * 모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
         * 모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
         * 모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
         * 짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
         */
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 무한반복
        while (true){
            // 문자열을 읽음 한 라인씩
            String readLine = br.readLine();
            // 읽은 문자열이 "." 이면
            if (readLine.equals(".")){
                // 반복문 종료
                break;
            } else {
                // 읽은 문자열을 한 문자씩 쪼개서 배열로 만듬
                char[] chars = readLine.toCharArray();
                // 빈 문자열 생성
                String tmp_str = "";
                // 한 문자씩 체크
                for (char c : chars){
                    if (c == '[' || c == '(' || c == ')' || c == ']'){
                        // 문자열을 만들어줍니다.
                        tmp_str += c;
                        // "()", "[]"이 만들어지면 빈문자열로 바꾸어줍니다.
                        tmp_str = tmp_str.replace("()", "").replace("[]", "");
                    }
                }
                // 문자열이 빈 문자면 괄호짝이 맞으므로 yes 출력
                if (tmp_str.equals("")){
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
