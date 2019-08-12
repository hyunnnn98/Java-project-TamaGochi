package Gochi;

/*
 * Gochi_Choice에서 게임을 실행할 경우, random으로 게임을 실행하고, 게임 결과를 출력
*/

public class Gochi_Game extends Main_Gochi {
	
	//게임이 이길 경우와 졌을 경우, status 변화를 다르게 하기 위한 변수
	static int result_Game = 1;
	
	void Game() {
		int random_Game = (int)((Math.random())*2)+1;
		
		switch(random_Game) {
		//가위바위보 게임
		case 1:
			int user, com;
			for(;;) {
				System.out.printf("가위(1) 바위(2) 보(3) 게임을 시작합니다");

				user = scan.nextInt();

				com = (int)(Math.random()*3)+1;

				System.out.println(Gochi_Name.name + ": "+ user + "입니다");
				System.out.println("컴퓨터 : "+ com + "입니다");

				switch(user-com){
				case -2: 
				case 1:
					System.out.println("user Win");
					result_Game = 1;		//gaem_Win → result_Game 에 '1' 입력
					break;
				case -1:
				case 2:
					System.out.println("user Lose");
					result_Game = 0;		//gaem_Lose → result_Game 에 '0' 입력
					break;
				case 0:
					System.out.println("user Draw try again");
					continue;

				}
				break;
			}
			break;
		
		//숫자맞추기 게임
		case 2:
			System.out.print("숫자맞추기 게임에 오신것을 환영합니다. \n"
							+"총 기회가 3번 주어집니다. \n"
							+"1부터10가지의 숫자 중 하나의 숫자를 선택하여 \n"
							+"컴퓨터가 생각하고 있는 숫자를 맞추면 됩니다. \n\n");
			int G_Computer = (int)(Math.random()*10)+1;
			int count = 1;
			System.out.print("숫자를 입력해주세요 >");
			int G_User = scan.nextInt();
			System.out.println();
			for (;;) {
				if (G_User != G_Computer) {
					if (G_User > G_Computer) {
						System.out.print("땡 조금 멍청하시네요 down 다시 한번 잘 생각해보세요.\n"
								+"숫자를 입력해주세요 >");
						G_User = scan.nextInt();
						System.out.println();
					}else {
						System.out.print("땡 조금 멍청하시네요 up 다시 한번 잘 생각해보세요.\n"
								+"숫자를 입력해주세요 >");
						G_User = scan.nextInt();
						System.out.println();
					}
				}else {
					System.out.println(Gochi_Name.name + ":" + G_User + " 컴퓨터:" + G_Computer);
					System.out.println("축하합니다~~ 맞췄습니다.");
					result_Game = 1;		//gaem_Win → result_Game 에 '1' 입력
					break;
				}
				count++;
				if (count > 2) {
					System.out.println("기회가 끝났습니다ㅠㅠ 정말 멍청하시네요.");
					result_Game = 0;		//gaem_Lose → result_Game 에 '0' 입력
					break;
				}
				
			}
			break;
		}
	}
}