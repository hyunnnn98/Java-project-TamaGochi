package Gochi;

public class Gochi_Ending {
	void Ending(){
		if(Gochi_Status.c_Level == 10) {
			System.out.println("����");
		}
		if(Gochi_Status.s_Health <= 0) {
			System.out.println("����");
		}
	}
}