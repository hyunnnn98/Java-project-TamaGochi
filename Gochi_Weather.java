package Gochi;

public class Gochi_Weather{
	
//	교수님의 Feedback 받음
//	처음 생성한 Weather() 메서드는 리턴타입이 void로서 반환값이 없는 메서드였다. 그래서 sysout 에서 불러오려고할때 오류가 남
//	교수님 "메서드를 불러온다고 적으면 뭐하나 ? 반환값이 없는데."
// 	해결방안  : Weather 객체를 리턴타입이 String인 자료형으로 바꿈
	
//	String으로 return값으로 지정시 null로 초기화를 시키는게 중요!
	String getTodaysWeather() {
	
		int w_Change = 0;
		
		String weatherStatusofToday = null;
		
		//	Choice 4는 수면		
		if(Gochi_Choice.Choice == 4)	w_Change = (int)(Math.random()*4);
				
		switch(w_Change) {
		case 0:
			weatherStatusofToday = "오늘의 날씨 : 맑음 *";
			break;
		case 1:
			weatherStatusofToday = "오늘의 날씨 : 흐림 *";
			break;
		case 2:
			weatherStatusofToday = "오늘의 날씨 : 비옴 *";
			break;
		case 3:
			weatherStatusofToday = "오늘의 날씨 : 눈   *";
			break;
		}
		
		return weatherStatusofToday;
	}
}