import java.util.Scanner;

// 삼각형 종류 구분.
/* 각 3개를 선언.
 * 모두 60이면 Equilateral
 * 합이 180이고 두 각이 같으면 Isosceles
 *   '' 같은 각이 없으면 Scalene.
 * 합이 180이 아니면 Error*/
public class Main {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	// 세각의 합이 일단 180 이어야 삼각형.
	
	int ang1 = sc.nextInt();
	int ang2 = sc.nextInt();
	int ang3 = sc.nextInt();
	
	int sum = ang1 + ang2 + ang3;
	
	
	// sum != 180 -> print Error.
	if (sum != 180) {
		System.out.println("Error");
	}else{
		if (ang1 == ang2 && ang2 == ang3 && ang3 == ang1) {
		System.out.println("Equilateral");
		}
		else if (ang1 == ang2 || ang2 == ang3 || ang3 == ang1) {
			System.out.println("Isosceles");
			}
		else {
			System.out.println("Scalene");
			}
	}		
	sc.close();
	}
}
