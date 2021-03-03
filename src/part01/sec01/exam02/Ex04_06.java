package part01.sec01.exam02;

public class Ex04_06 {

	public static void main(String[] args) {

		int a=200;
		
		if(a<100) {
			System.out.println("100보다 작군요"); // True
			System.out.println("참이면 이 문장도 보입니다."); // 중괄호가 없으면 else와 겹침 
		}
		else {
			System.out.println("100보다 크군요");
			System.out.println("거짓이면 이문장도 보입니다.");
		
		}
		System.out.println("프로그램 끝.");
	}

}
