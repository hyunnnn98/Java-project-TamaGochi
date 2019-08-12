package Gochi;

//  게임을 시작했을 때 캐릭터의 status의 초기값을 설정해주고 출력창에 표시를 해주기 위한 클래스 
//	캐릭터의 status는 Gochi_Choice가 끝났을 시 항상 출력해준다.
// 	레벨업을 했을 시에 초기값을 설정을 해줌

public class Gochi_Status extends Main_Gochi{
	
	Gochi_Weather WeatherInfo	= new Gochi_Weather();
	Gochi_LvEvent LvEvent 		= new Gochi_LvEvent();
	
	//status의 초기화 값 50 저장
	//캐릭터의 status 변수(청결, 피로, 포만감, 건강, 용변)
	static int c_Level		= 1;
	static int s_Clean		= 50;
	static int s_Tired		= 50;
	static int s_Full		= 50;
	static int s_Health		= 50;
	static int s_Dung		= 50;
	static int Lv_Case		= 0;
	
	//Status을 콘솔창에 나타내기 위한 메서드
	void Status() {
		
		// 건강이 100이상 일 시 레벨이 증가하고 Status을 초기화 해줌
		if(s_Health / 100 > 0 ) {
			
			// Gochi_LvEvent class에서 LvEvent라는 메서드를 실행 시킬 때 한번만 실행 시키기위해 만들어 놓은 브레이크변수
			Lv_Case	= s_Health;
			c_Level++;
			s_Clean		= 40;
			s_Tired		= 40;
			s_Full		= 40;
			s_Health	= 40;
			s_Dung		= 40;
		}

//		3, 6, 9 도달 시 LvEvent메서드 실행
		LvEvent.LvEvent();
		
		System.out.println("\n***********************************************");
		System.out.print("* 이름 : 귀요미 " + Gochi_Name.name + "\tlevel : " + c_Level
						+ "\n*" + Gochi_Choice.s_Day + "일차\t" + WeatherInfo.getTodaysWeather());
		
		// status 칸 표시
		// Ex) 청결 수치가 50일 때 ■■■■■□□□□□으로 출력
		char o = '■', x = '□';	
		
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