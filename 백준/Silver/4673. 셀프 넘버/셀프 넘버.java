import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 10000보다 작거나 같은 셀프 넘버를 출력해야한다
        셀프 넘버는 자기 자신과 모든 자릿 수를 쪼개어 더한 값이 없을 때, 생성자가 없을 때를 셀프 넘버라고 한다.
        2는 1이 생성자. 4는 2가 생성자. 1, 3, 5, 7, 9는 없다.
        어떻게 생성자가 있는지, 아니면 없는지 알 수 있는가?
        어떤 배열을 만들고 거기에 1부터 생성자들을 돌아가면서 추가한다.
            생성자는 어떻게 추가 할 수 있나?
            1부터 자기 자신과 각 자리수를 더한 값을 배열에 넣는다.
        그리고 1부터 10,000까지 반복을 돌면서 없는 값을 출력한다.
         */
        boolean[] isSelfNumber = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int selfNumber = getSelfNumber(i);
            if (selfNumber <= 10000) {
                isSelfNumber[selfNumber] = true;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int getSelfNumber(int n) {
        int sum = n;
        while (n != 0) {
            sum += n %10;
            n /= 10;
        }
        return sum;
    }
}
