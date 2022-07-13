package multicampus;
import java.util.*;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String s = sc.next();
		char ch = s.charAt(0);
		switch(ch) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			System.out.println("모음 입니다.");
			break;
		default :
			System.out.println("자읍 입니다.");
		}
	}

}
