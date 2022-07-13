package multicampus;

import java.util.*;

public class SeasonTest {
/*
 * switch case문 사용
 * 12, 1 ,2 -> 겨울
 * 3, 4, 5 -> 봄
 * 6, 7, 8 -> 여름
 * 9, 10, 11 ->가을
 잘못 입력했을 경우 처리

 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("월 입력(1~12) : ");
			int month = sc.nextInt();
			if(month == 0) {
				break;
			}
			if(month < 0 || month > 12) {
				System.out.println(month+"월은 존재하지 않습니다. 다시 입력해 주세요");
			}
			switch(month) {
			case 12, 1, 2:
				System.out.println(month+"월은 겨울입니다");
				break;
			case 3, 4, 5:
				System.out.println(month+"월은 봄입니다");
				break;
			case 6, 7, 8:
				System.out.println(month+"월은 여름입니다");
				break;
			case 9, 10, 11:
				System.out.println(month+"월은 가을입니다");
				break;
			}
			System.out.println("-----------------------");
			
		}
		System.out.println("SeasonTest 종료!!");
	}

}
