package Gochi;

public class Gochi_Choice extends Main_Gochi{

	Gochi_Function Function = new Gochi_Function();	// Gochi_Function의 값을 불러오는 인스턴스 생성
	Gochi_Status Status		= new Gochi_Status();	// Gochi_Status의 값을 불러오는 인스턴스 생성
	Gochi_Limit Limit		= new Gochi_Limit();	// Gochi_Limit의 값을 불러오는 인스턴스 생성
	Gochi_Game Game			= new Gochi_Game();

	static int s_Day = 1;	// 시작 시 day는 '1' 로 초기화
	static int Choice;		// Gochi_Weather 클래스에 필요한 Choice값 전역변수 지정

	void Flow() {
		Function.Function();
		Limit.Limit();
		Status.Status();
	}
	
	void Choice() {
		
		// 메뉴선택(Choice) 시작
		for(;;) {	

			System.out.println("\n\n(1 : 샤워) (2 : 식사) (3 : 게임)\n"
							+ "(4 : 수면) (5 : 변소) (6 : 운동)\n"
							+ "(7 : 재시작) (8 : 종료)\n");
			System.out.print("활동을 선택 > ");
			
			Choice = scan.nextInt();		// Choice 선택 값을 입력
			
			switch(Choice) {
			case 1:	case 2:	case 5:	case 6:
				Flow();
				break;
			case 3:
				Game.Game();
				Flow();
				break;
			case 4:
				s_Day++;					// 수면을하면 날짜 s_Day값 1증가
				Flow();
				break;
			case 7:							// 재시작을 할 경우 캐릭터 능력치 초기화
				Gochi_Status.s_Clean	= 50;
				Gochi_Status.s_Tired	= 50;
				Gochi_Status.s_Full		= 50;
				Gochi_Status.s_Health	= 50;
				Gochi_Status.s_Dung		= 50;
				break;
			case 8:
				break;
			default:						// 1~8 사이의 값을 벗어났을시 선택으로 루프
				System.out.println("1 ~ 8 사이의 값을 입력");
				break;
			}			// switch문 종료
			
			if(Choice == 7) {
				System.out.println("\n재시작 합니다. \n");
				break;
			}
			if(Choice == 8) {				// 8입력시 for문 종료
				System.out.println("\n게임을 종료 합니다. \n");
				break;
			}
			if(Gochi_Status.c_Level == 10 || Gochi_Status.s_Health <= 0) {
				break;
			}// if문 종료
		} // for문 종료
	} // choice() 메소드 종료
}