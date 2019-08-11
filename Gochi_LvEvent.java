package Gochi;
//quiz랑 lvevent 메서드 정리해야함
public class Gochi_LvEvent extends Main_Gochi {

	static int c_LvHealth	= 0;
	static int answer		= 0;

	void LvEvent() {

		switch(Gochi_Status.c_Level) {
		case 3:		c_LvHealth = 1;		break;
		case 6:		c_LvHealth = 2;		break;
		case 9:		c_LvHealth = 3;		break;
		default:						break;						
		}

		if(Gochi_Status.c_Level == 3 || Gochi_Status.c_Level == 6 || Gochi_Status.c_Level == 9) {
			if(Gochi_Status.Lv_Case / 100 > 0) {
				
				Gochi_Status.Lv_Case = 0;
				System.out.println("\n★★★★★축 Lv. " + Gochi_Status.c_Level + " 달성★★★★★");
				System.out.print("Event가 발생했습니다. Quiz를 실행하겠습니까? 예(1) 아니오(2) ");
				int choice = scan.nextInt();

				if(choice == 1)		Quiz();
			}
		}

	}

	void Quiz() {
		switch(Gochi_Status.c_Level) {
		case 3:
			System.out.println("넌센스 문제 : 반성문을 영어로 하면?");
			System.out.println("(1) global\t(2) Half Castle Door\t(3) Actor Sorry.Moon");

			input_Answer();

			if (answer == 1)	answer_True();
			else				answer_False();

			break;
		case 6:
			System.out.println("JAVA 문제 : 생성자를 불러오는 예약어는?");
			System.out.println("(1) void\t(2) new\t(3) scanner");

			input_Answer();

			if (answer == 2)	answer_True();
			else				answer_False();

			break;
		case 9:
			System.out.println("넌센스 문제 : 반성문을 영어로 하면 ?");
			System.out.println("(1) global\t(2) Half Castle Door\t(3) Actor Sorry.Moon");

			input_Answer();

			if (answer == 3)	answer_True();
			else				answer_False();

			break;
		}
	}

	void input_Answer() {
		System.out.println(Gochi_Name.name + " 의 선택은??? > ");
		answer = scan.nextInt();
	}

	void answer_True() {
		System.out.println("정답입니다!!!");
		System.out.println("기본 능력치가 증가됩니다.");

		Gochi_Status.s_Clean	= 50;
		Gochi_Status.s_Tired	= 50;
		Gochi_Status.s_Full		= 50;
		Gochi_Status.s_Health	= 50;
		Gochi_Status.s_Dung		= 50;
	}
	void answer_False() {
		System.out.println("틀렸습니다!!!");
		System.out.println("기본 능력치가 감소됩니다.");

		Gochi_Status.s_Clean	= 30;
		Gochi_Status.s_Tired	= 30;
		Gochi_Status.s_Full		= 30;
		Gochi_Status.s_Health	= 30;
		Gochi_Status.s_Dung		= 30;
	}

}