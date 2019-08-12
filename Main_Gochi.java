package Gochi;

import java.util.Scanner;

/* Kind of class
	<Major class>
		- Main_Gochi
		- Gochi_Start
		- Gochi_Name
		- Gochi_Status
		- Gochi_Choice
		- Gochi_Ending
	<Sub class>
		- Gochi_LvEvent
		- Gochi_Limit
		- Gochi_Weather
		- Gochi_Function
		- Gochi_Game
*/

public class Main_Gochi {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Select game start
		Gochi_Start Start			= new Gochi_Start();
		
		//Input character name
		Gochi_Name Name				= new Gochi_Name();
		
		//Output character name, day, status
		Gochi_Status Status			= new Gochi_Status();
		
		//Select character action
		Gochi_Choice Choice			= new Gochi_Choice();

		//If character die output ending
		Gochi_Ending Ending			= new Gochi_Ending();
		
		//If choice '7' restart game 
		do {
			Start.Start();
			Name.Name();
			Status.Status();
			Choice.Choice();
			Ending.Ending();
		}while(Gochi_Choice.Choice == 7);
	}
}