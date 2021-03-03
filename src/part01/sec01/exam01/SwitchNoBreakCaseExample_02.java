package part01.sec01.exam01;

public class SwitchNoBreakCaseExample_02 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간:"+time+"시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break; // break;는 스위치가 반복하는걸 멈춰줌.
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
		}
		
	}

}
