package food;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 머먹지 프로그램
		System.out.println("머먹지 프로그램 시작");
		// 메뉴를 추가(프로그램 자체에서 메뉴 설정)
		// 메뉴를 추가(이 프로그램 사용자가 직접 입력)
		// 메뉴들을 담을수 있는 공간을 만들기
		ArrayList<String> menuList = new ArrayList<String>();
		// 사용자로 부터 입력을 받기 위한 준비
		Scanner sc = new Scanner(System.in);
		// 메뉴을 입력
//		System.out.println("숫자를 입력하시오");
//		int a = sc.nextInt();
//		System.out.println("당신이 입력한 숫자는? " + a);

		// 여기서 부터 반복
		while (true) {
			System.out.println("메뉴를 입력하시오(0을 입력하면 입력 종료)");
//		sc.nextLine();   // 숫자입력 받고 난뒤 엔터키값(개행문자) 처리하기 위해
			System.out.print("메뉴입력: ");
			String menu = sc.nextLine(); // 메뉴를 입력 받기
			System.out.println("입력값: " + menu);
			// 만약에 입력값이 0 이면 반복문을 나가자
			if (menu.equals("0")) {   // 문자열을 비교 할 때 equals 메소드를 사용
				break;
			}
			// 메뉴 리스트에 담기
			menuList.add(menu);
		}
		// 여기까지 반복

//		System.out.println("당신이 입력한 메뉴의 갯수는? " + menuList.size());
//		System.out.println("당신이 입력한 메뉴는? " + menuList.get(0));
//		System.out.println("당신이 입력한 메뉴는? " + menuList.get(1));
//		System.out.println("당신이 입력한 메뉴는? " + menuList.get(2));
//		
		// 사용자가 여러개 입력을 한 메뉴를 한번에 출력하기 위해
//		for (int i=0; i<menuList.size(); i++) {
//			System.out.println("당신이 입력한 메뉴는? " + menuList.get(i));	
//		}
		for (String m : menuList) {
			System.out.println("당신이 입력한 메뉴는? " + m);	
		}
		// 위와 같이 메뉴를 하나 밖에 못담는데 내가 원하는데로 입력을 받고
		// 만약에 입력 받는것을 끝내기 위해 0을 입력하면 입력 받기 종료하고
		// 지금까지 입력된 메뉴 리스트를 출력

		// 메뉴들을 입력하고 저장된
		// 메뉴들 중에 하나를 알아서 추천
		// 추천 결과를 출력

	}

}
