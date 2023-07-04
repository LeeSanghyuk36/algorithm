import java.util.Scanner;

//5명의 학생의 평균 점수를 구하라
public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
				
		for(int s = 0; s < 5; s++) {
			int score = sc.nextInt();
			if(score<40) {
				score = 40;
			}
			sum += score;
		}
		
		int average = sum / 5;
		System.out.println(average);
		
		sc.close();
	}

}
