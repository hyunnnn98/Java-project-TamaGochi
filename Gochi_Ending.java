package Gochi;

//	게임이 끝났을시 조건 Level이 10일 경우 건강이 0일 경우
// 	충족될때 실행되는 클래스 

public class Gochi_Ending {
	
	void Ending(){
		if(Gochi_Status.c_Level == 10) {
			System.out.println("성공");
		}
		if(Gochi_Status.s_Health <= 0) {
			System.out.println("실패");
		}
	}
}
