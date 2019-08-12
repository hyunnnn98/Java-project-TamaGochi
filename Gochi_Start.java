package Gochi;

/*
 * Gochi_Start 에서는 시작문구를 출력, 게임시작을 선택
 * Scanner를 사용하기 위해, Main_Gochi 를 상속받음
*/
public class Gochi_Start extends Main_Gochi {
	
	void Start() {

		System.out.println("*********************************\n"
						 + "   BOKVENGERS : DamaGochi, 2019   \n"
						 + "   김범수, 이인준, 서청열, 정재순, 조승현   \n"
						 + "  @Copyright all right reserved  \n"
						 + "*********************************\n");
		
		System.out.print("게임 시작(1) > ");

		//게임을 시작하려면 '1'을 입력, '1'외의 숫자를 입력받으면 값을 재입력(무한반복문) 
		for(;;) {
			
			int start = scan.nextInt();
			
			switch(start) {
			case 1:
				System.out.println("게임을 시작합니다.\n");
				break;
			default:
				System.out.print("값을 다시 입력하세요. > ");
				continue;
			}
			if(start == 1)	break;
		}
		
	}
}