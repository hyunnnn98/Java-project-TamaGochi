package Gochi;
//Gochi_Choice�� switch(choice) �����ȿ��� ���� �� �޼ҵ�
//(1 : ����) (2 : �Ļ�) (3 : ����) (4 : ����) (5 : �뺯) (6 : �)

public class Gochi_Function{

	void Function() {
				
		switch(Gochi_Choice.Choice){
		case 1:		// ����
			Gochi_Status.s_Clean	+= 20;
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Tired	-= 10;
			break;
		case 2:		// �Ļ�
			Gochi_Status.s_Full		+= 20;
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Dung		+= 20;
			break;
		case 3:		// ����
			if(Gochi_Game.result_Game == 1) {			//game_Win
				Gochi_Status.s_Tired	+= 10;
				Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			}
			else if(Gochi_Game.result_Game == 0) {		//game_Lose
				Gochi_Status.s_Tired	+= 20;
				Gochi_Status.s_Health	-= 10;
			}
			break;
		case 4:		// ����
			Gochi_Status.s_Tired	-= 20;
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Full		-= 20;
			break;			
		case 5:		// �뺯
			Gochi_Status.s_Dung		-= 20;
			Gochi_Status.s_Clean	-= 10;
			break;
		case 6:		// �
			Gochi_Status.s_Health	+= (10 - Gochi_LvEvent.c_LvHealth);
			Gochi_Status.s_Tired	+= 20;
			Gochi_Status.s_Full		-= 20;
			break;
		}
	}
}