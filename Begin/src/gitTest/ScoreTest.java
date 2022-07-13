package gitTest;
import java.util.*;

public class ScoreTest {
/*
 * 점수입력 0~100
 * 학년입력 1~4
 * 60점 이상 합격, 미만 불합격
 * 4학년 70점 이상 합격
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("학년을 입력하세요(1~4) : ");
			int grade = sc.nextInt();
			System.out.print("점수를 입력하세요(0~100) : ");
			int score = sc.nextInt();
			
			if(grade == 4) {
				if(score >= 70 && score <= 100) {
					System.out.println(grade+"학년"+", 점수:"+score+"\t합격입니다!");
					break;
				}
				else if(score >= 0 && score < 70) {
					System.out.println(grade+"학년"+", 점수:"+score+"\t불합격입니다ㅠㅠ");
					break;
				}
				else {
					System.out.println("점수 오류!! 다시 입력해주세요(1~100)");
				}
			}
			else if(grade >= 1 && grade <= 3) {
				if(score >= 60 && score <= 100) {
					System.out.println(grade+"학년"+", 점수:"+score+"\t합격입니다!");
					break;
				}
				else if(score >= 0 && score < 60) {
					System.out.println(grade+"학년"+", 점수:"+score+"\t불합격입니다ㅠㅠ");
					break;
				}
				else {
					System.out.println("점수 오류!! 다시 입력해주세요(1~100)");
				}
			}
			else {
				System.out.println("학년 오류!! 다시 입력해주세요(1~4)");
			}
		}
	}

}
