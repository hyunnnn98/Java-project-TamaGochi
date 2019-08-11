package Gochi;
//Gochi_Choice의 switch(choice) 구문안에서 구동 할 메소드
//(1 : 샤워) (2 : 식사) (3 : 게임) (4 : 수면) (5 : 용변) (6 : 운동)

public class Gochi_Function{

	void Function() {
				
		switch(Gochi_Choice.Choice){
		case 1:		// 샤워
			Gochi_Status.s_Clean	+= 20;
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Tired	-= 10;
			break;
		case 2:		// 식사
			Gochi_Status.s_Full		+= 20;
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Dung		+= 20;
			break;
		case 3:		// 게임
			if(Gochi_Game.result_Game == 1) {			//game_Win
				Gochi_Status.s_Tired	+= 10;
				Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			}
			else if(Gochi_Game.result_Game == 0) {		//game_Lose
				Gochi_Status.s_Tired	+= 20;
				Gochi_Status.s_Health	-= 10;
			}
			break;
		case 4:		// 수면
			Gochi_Status.s_Tired	-= 20;
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Full		-= 20;
			break;			
		case 5:		// 용변
			Gochi_Status.s_Dung		-= 20;
			Gochi_Status.s_Clean	-= 10;
			break;
		case 6:		// 운동
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Tired	+= 20;
			Gochi_Status.s_Full		-= 20;
			break;
		}
	}
}