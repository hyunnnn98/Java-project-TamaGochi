package Gochi;

/*
 * Gochi_Choice 에서 캐릭터의 동작을 선택 시,
 * Gochi_Function 에서 Status 값을 변경하고,
 * Gochi_Limit 에서 제한값을 비교 후,
 * Gochi_Status 를 통해 값을 출력한다.
*/

public class Gochi_Choice extends Main_Gochi{

	Gochi_Function Function = new Gochi_Function();
	Gochi_Status Status		= new Gochi_Status();
	Gochi_Limit Limit		= new Gochi_Limit();
	Gochi_Game Game			= new Gochi_Game();

	static int s_Day = 1;	
	static int Choice;		

//	Choice에서 반복적으로 실행되는 Function, Limit, Status기능을 통합
	void Flow() {
		Function.Function();
		Limit.Limit();
		Status.Status();
	}
	
//	Gochi에 대한 활동을 선택할수있는 메서드
	void Choice() {
		
		// 사용자가 계속적으로 활동을 선택할수있게 반복문 for을 사용 
		for(;;) {	

			System.out.println("\n\n(1 : 샤워) (2 : 식사) (3 : 게임)\n"
							+ "(4 : 수면) (5 : 변소) (6 : 운동)\n"
							+ "(7 : 재시작) (8 : 종료)\n");
			System.out.print("활동을 선택 > ");
			
			Choice = scan.nextInt();		
			
			//	1,2,5,6 같은 경우는 Flow라는 메서드를 불러와서 실행			
//				3 같은 경우는 Game이라는 새로운 메서드를 불러옴
//				4 같은 경우는 수면을 할 시 날짜가 증가하는 메서드를 불러옴
//				7 같은 경우는 새로운 게임을 시작할 수있는 초기값을 설정함
//				8 같은 경우는 종료
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
			case 7:
				Gochi_Status.s_Clean	= 50;
				Gochi_Status.s_Tired	= 50;
				Gochi_Status.s_Full		= 50;
				Gochi_Status.s_Health	= 50;
				Gochi_Status.s_Dung		= 50;
				break;
			case 8:
				break;
			default:						
				System.out.println("1 ~ 8 사이의 값을 입력");
				break;
			}			// switch문 종료
			
			if(Choice == 7) {
				System.out.println("\n재시작 합니다. \n");
				break;
			}
			if(Choice == 8) {				
				System.out.println("\n게임을 종료 합니다. \n");
				break;
			}
			
//			레벨이 10일때 Game Clear
//			건강이 0이하일경우 Game Over
			if(Gochi_Status.c_Level == 10 || Gochi_Status.s_Health <= 0) {
				break;
			}// if문 종료
		} // for문 종료
	} // choice() 메소드 종료
}