package Gochi;

public class Gochi_Weather{
	
//	�������� Feedback ����
//	ó�� ������ Weather() �޼���� ����Ÿ���� void�μ� ��ȯ���� ���� �޼��忴��. �׷��� sysout ���� �ҷ��������Ҷ� ������ ��
//	������ "�޼��带 �ҷ��´ٰ� ������ ���ϳ� ? ��ȯ���� ���µ�."
// 	�ذ���  : Weather ��ü�� ����Ÿ���� String�� �ڷ������� �ٲ�
	
//	String���� return������ ������ null�� �ʱ�ȭ�� ��Ű�°� �߿�!
	String getTodaysWeather() {
	
		int w_Change = 0;
		
		String weatherStatusofToday = null;
		
		//	Choice 4�� ����		
		if(Gochi_Choice.Choice == 4)	w_Change = (int)(Math.random()*4);
				
		switch(w_Change) {
		case 0:
			weatherStatusofToday = "������ ���� : ���� *";
			break;
		case 1:
			weatherStatusofToday = "������ ���� : �帲 *";
			break;
		case 2:
			weatherStatusofToday = "������ ���� : ��� *";
			break;
		case 3:
			weatherStatusofToday = "������ ���� : ��   *";
			break;
		}
		
		return weatherStatusofToday;
	}
}