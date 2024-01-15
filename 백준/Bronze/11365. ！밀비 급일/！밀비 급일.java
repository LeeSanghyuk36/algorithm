import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** 뒤집으면 글자가 나온다. 반복문을 돌려 반대로 돌리면 될 것 같다.
         * 띄워쓰기는 어떻게 해야하는지 생각이 필요하다.
         * scanner 입력. 한 줄마다 뒤에서부터 읽기
         */
        Scanner sc = new Scanner(System.in);
//        String secret = ""; //

        while (true) {
            String secret = sc.nextLine();
            if (secret.equals("END")) { // 만약 secret의 받은 문자열이 "END"와 같다면
                break; // break
            }
            String[] arr = secret.split(""); // 하나씩 나눠서 배열에 넣기
            for (int i = arr.length - 1; i >= 0; i--) { // 뒤에서부터 출력 함
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}

