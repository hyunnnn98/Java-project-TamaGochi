package Gochi;

import java.util.Scanner;

public class Main_Gochi {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Gochi_Start Start			= new Gochi_Start();	// 시작 문구를 출력, 게임 시작 선택
		Gochi_Name Name				= new Gochi_Name();		// 캐릭터 이름을 입력
		Gochi_Status Status			= new Gochi_Status();	// 캐릭터의 Name, Day, Status를 출력
		Gochi_Choice Choice			= new Gochi_Choice();	// 캐릭터의 활동 Function을 Choice
//		Gochi_Function Function		= new Gochi_Function();	// Function에 따른 Status, Day, Weather를 변경
		Gochi_Ending Ending			= new Gochi_Ending();	// 캐릭터 사망 시, Ending 출력
		
		do {
			Start.Start();
			Name.Name();
			Status.Status();
			Choice.Choice();
			Ending.Ending();
		}while(Gochi_Choice.Choice == 7);
	}
}