package Gochi;

//캐릭터의 이름을 입력 받음

public class Gochi_Name extends Main_Gochi{
	
	static String name = "";
	
	void Name() {
		System.out.print("캐릭터 이름(한글 3자리) 입력 > ");
		name = scan.next();
	}
}