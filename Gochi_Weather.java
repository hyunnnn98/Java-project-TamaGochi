package Gochi;

public class Gochi_Weather{
	
//	static int w_Change = 0;
	
	void Weather() {
	
		int w_Change = 0;
		
		if(Gochi_Choice.Choice == 4)	w_Change = (int)(Math.random()*4);
		
		switch(w_Change) {
		case 0:
			System.out.print("¿À´ÃÀÇ ³¯¾¾ : ¸¼À½ *");
			break;
		case 1:
			System.out.print("¿À´ÃÀÇ ³¯¾¾ : Èå¸² *");
			break;
		case 2:
			System.out.print("¿À´ÃÀÇ ³¯¾¾ : ºñ¿È *");
			break;
		case 3:
			System.out.print("¿À´ÃÀÇ ³¯¾¾ : ´«   *");
			break;
		}
	}
}