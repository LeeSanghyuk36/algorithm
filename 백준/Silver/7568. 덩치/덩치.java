import java.util.Scanner;

class Person {
    int weight;
    int height;
    int rank;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.rank = 1; // 일단 모두 1등으로 초기화
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 각 사람의 정보(몸무게와 키)를 저장할 배열
        Person[] people = new Person[n];

        // 입력 받은 정보로 Person 객체 생성 후 배열에 저장
        for (int i = 0; i < n; i++) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            people[i] = new Person(w, h);
        }

        // 등수 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 같은 사람은 비교하지 않음

                // i번째 사람과 j번째 사람을 비교하여 등수 결정
                if (people[i].weight < people[j].weight && people[i].height < people[j].height) {
                    people[i].rank++;
                }
            }
        }

        // 등수 출력
        for (int i = 0; i < n; i++) {
            System.out.print(people[i].rank + " ");
        }

        scanner.close();
    }
}
