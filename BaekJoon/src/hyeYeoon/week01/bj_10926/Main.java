package hyeYeoon.week01.bj_10926;
import java.util.*;

public class Main {

	static String Id = "joonas";
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String A = sc.nextLine();
//		
//		System.out.println(A + "??!");
		
//		String Id = "joonas"; // 이미 존재하는 아이디로 가정
		
		Scanner sc = new Scanner(System.in);
		String regId = sc.nextLine();
		
		
		if (regId.length() > 50) {
			System.out.println("아이디는 50자 이하로 입력해주세요.");
		} else if (isStringLowerCase(regId) == false) {
			System.out.println("아이디는 소문자로 입력해주세요.");
		} else {
			if (regId.equals(Id)) {
				System.out.println(regId + "??!");
			} else {
				System.out.println("가입 가능!");
			}
		}
		

	}

	private static boolean isStringLowerCase(String str) {

		char[] charArray = str.toCharArray();

		int i;
		for (i = 0; i < charArray.length; i++) {
			if(!Character.isLowerCase(charArray[i])) return false;
		}

		return true;

	}
}
