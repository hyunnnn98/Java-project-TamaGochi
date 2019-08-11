package Gochi;

public class Gochi_Status extends Main_Gochi{

	Gochi_Weather Weather		= new Gochi_Weather();
	Gochi_LvEvent LvEvent 		= new Gochi_LvEvent();
	
	static int s_Clean	= 50;
	static int s_Tired	= 50;
	static int s_Full	= 50;
	static int s_Health	= 50;
	static int s_Dung	= 50;
	static int Lv_Case	= 0;
	//status의 초기화 값 50 저장
	//캐릭터의 status 변수(청결, 피로, 포만감, 건강, 용변)

	static int c_Level = 1;

	void Status() {

		if(s_Health / 100 > 0 ) {
			Lv_Case = s_Health;
			c_Level++;
			s_Clean		= 40;
			s_Tired		= 40;
			s_Full		= 40;
			s_Health	= 40;
			s_Dung		= 40;
		}

		//레벨이 3, 6, 9가 달성했을 때 레벨 조건 확인 및 이벤트 발생 메서드 호출
		LvEvent.LvEvent(); 	
		
		System.out.println("\n***********************************************");
		System.out.print("* 이름 : 귀요미 " + Gochi_Name.name + "\tlevel : " + c_Level
						+ "\n*" + Gochi_Choice.s_Day + "일차\t");
		Weather.Weather();
		//이름, 일자, 날씨 출력
		char o = '■', x = '□';	//status 칸 표시
		
		//s_Clean(청결 status) 표시
		System.out.print("\n* 청결    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Clean / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Clean);
		
		//s_Tired(피로 status) 표시
		System.out.print("\n* 피로    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Tired / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Tired);
		
		//s_Full(포만감 status) 표시
		System.out.print("\n* 포만감 : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Full / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Full);
		
		//s_Health(건강 status) 표시
		System.out.print("\n* 건강    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Health / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Health);
		
		//s_Dung(용변 status) 표시
		System.out.print("\n* 용변    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Dung / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Dung);
		System.out.println("\n***********************************************");

	}
}