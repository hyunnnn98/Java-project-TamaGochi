package Gochi;

import java.util.Scanner;

public class Main_Gochi {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Gochi_Start Start			= new Gochi_Start();	// ���� ������ ���, ���� ���� ����
		Gochi_Name Name				= new Gochi_Name();		// ĳ���� �̸��� �Է�
		Gochi_Status Status			= new Gochi_Status();	// ĳ������ Name, Day, Status�� ���
		Gochi_Choice Choice			= new Gochi_Choice();	// ĳ������ Ȱ�� Function�� Choice
//		Gochi_Function Function		= new Gochi_Function();	// Function�� ���� Status, Day, Weather�� ����
		Gochi_Ending Ending			= new Gochi_Ending();	// ĳ���� ��� ��, Ending ���
		
		do {
			Start.Start();
			Name.Name();
			Status.Status();
			Choice.Choice();
			Ending.Ending();
		}while(Gochi_Choice.Choice == 7);
	}
}