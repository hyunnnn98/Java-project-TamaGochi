package Gochi;

public class Gochi_Start extends Main_Gochi {
	void Start() {
		System.out.println("*********************************\n"
						 + "*  BOKVENGERS : DamaGochi, 2019 *\n"
						 + "*    김범수, 이인준, 정재순, 조승현	*\n"
						 + "* @Copyright all right reserved *\n"
						 + "*********************************\n");
		
		System.out.print("게임 시작(1) > ");
	
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