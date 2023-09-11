import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        각 자리를 나눈 방법이 뭘까.
        반복문을 하면서 idx 0, idx 2까지 str으로 자른다음 int로 바꾸고
        그걸 이제 각 자리들을 곱한다.
         */
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        boolean check = false; //yes, no 판단하는 변수

        for (int i = 1; i < n.length(); i++) {
            String a = n.substring(0, i); // 앞부분 문자열
            String b = n.substring(i); // 뒷부분 문자열

            if (calc(a) == calc(b)) {
                check = true;
                break;
            }
        }

        if (check) System.out.println("YES");
        else System.out.println("NO");
    }
    public static int calc(String s) {
        int ret = 1;
        for (int i = 0; i < s.length(); i++) {
            ret *= s.charAt(i) - '0';
        }
        return ret;
    }

}
