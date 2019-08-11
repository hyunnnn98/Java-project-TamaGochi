package Gochi;

public class Gochi_Limit{

	void Limit() {

		int count_Clean		= 1;	// 피부병 카운트 인자값
		int exit_Clean		= 1;	// 피부병 탈출 인자값
		
		int count_Dirty		= 1;
		int exit_Dirty		= 1;
		
		int count_Tired		= 1;	// 만성피로 카운트 인자값
		int exit_Tired		= 1; 	// 만성피로 탈출 인자값

		int count_Full		= 1;	// 고도비만 카운트 인자값
		int exit_Full		= 1;	// 고도비만 탈출 인자값

		int count_Less		= 1;	// 영양실조 카운트 인자값
		int exit_Less		= 1;	// 영양실조 탈출 인자값

		int count_Dung		= 1;	// 용변 카운트 인자값
		int exit_Dung		= 1;	// 용변 탈출 인자값

		int count_Health	= 1;	// 영양실조 카운트 인자값



		//청결-------------------------------------------------------------------------------------//
		//청결 → 90 이상일 때, 샤워를 하면 배고픔 -20
		if(Gochi_Status.s_Clean >= 80 && Gochi_Choice.Choice == 1 && exit_Clean == 1) {
			System.out.println("캐릭터가 피부병에 걸렸습니다.");
			exit_Clean ++;
		}else if(Gochi_Status.s_Clean >= 100) {
			
			if(Gochi_Choice.Choice == 1) {
			System.out.printf("캐릭터가 피부병에걸려 건강이 \"%d\" 추가감소하였습니다.\n", count_Clean*10);
			Gochi_Status.s_Health -= count_Clean*10;

			count_Clean++;

			if(count_Clean > 3) 		count_Clean = 3;		// count_Clean의 최대값은 3
			}

		}else if(Gochi_Status.s_Clean < 100) {
			if(Gochi_Status.s_Clean <= 80 && exit_Clean > 1) {
				System.out.println("피부병을 탈출했습니다.");
				exit_Clean = 1;	// 피부병 탈출 (초기화)
			}
			count_Clean = 1;	// s_Clean가 100 미만으로 내려가면 count는 1로 초기화
		}
		
		//청결 → 20이하일때 더러워짐에 걸림
				if(Gochi_Status.s_Clean <=20 && Gochi_Status.s_Clean > 0 && exit_Dirty == 1) {
					System.out.println("캐릭터가 더러워졌습니다.");
					exit_Dirty ++;

				}else if(Gochi_Status.s_Clean <= 0) {	//청결 → 0이하일때, 건강 -10, -20, -30

					System.out.printf("캐릭터가 더러워져서 건강이 \"%d\" 추가감소하였습니다.\n", count_Dirty*10);
					Gochi_Status.s_Health -= count_Dirty*10;
					count_Dirty ++;

					if(count_Dirty > 3) 		count_Dirty = 3;		// count_Dirty의 최대값은 3

				}else if(Gochi_Status.s_Clean >= 20 && exit_Dirty > 1) {	//청결이 20 이상으로 회복 시 더러워짐 탈출(초기화)
					count_Dirty = 1; 	// s_Dirty가 20 초과하면 count는 1로 초기화
					exit_Dirty = 1;	// 더러워짐 탈출 (초기화)
					System.out.println("더러워짐에서 탈출했습니다.");
				} // 더러워짐 종료 



		//피로-------------------------------------------------------------------------------------//
		//피로 → 80 이상일 때, 만성피로 / 100일 때, 건강 -10, -20, -30
		if(Gochi_Status.s_Tired >= 80 && Gochi_Status.s_Tired < 100 && exit_Tired == 1) {
			System.out.println("캐릭터가 만성피로에 걸렸습니다.");
			exit_Tired ++;
		}else if(Gochi_Status.s_Tired <= 0) Gochi_Status.s_Tired = 0;
		else if(Gochi_Status.s_Tired >= 100) {

			System.out.printf("캐릭터가 피로하여 건강이 \"%d\" 추가감소하였습니다.\n", count_Tired*10);
			Gochi_Status.s_Health -= count_Tired*10;

			count_Tired++;

			if(count_Tired > 3) 		count_Tired = 3;		// count_Tired의 최대값은 3


		}else if(Gochi_Status.s_Tired < 100) {
			if(Gochi_Status.s_Tired <= 80 && exit_Tired > 1) {
				System.out.println("만성피로를 탈출했습니다.");
				exit_Tired = 1;	// 만성피로 탈출 (초기화)
			}
			count_Tired = 1;	// s_Tired가 100 미만으로 내려가면 count는 1로 초기화

		}

		//포만감-------------------------------------------------------------------------------------//
		//포만감 → 80 이상일 때, 포만감 / 100일 때, 건강 -10, -20, -30
		if(Gochi_Status.s_Full >= 80 && Gochi_Status.s_Full < 100 && exit_Full == 1) {
			System.out.println("캐릭터가 고도비만에 걸렸습니다. 운동이 필요합니다.");
			exit_Full ++;

		}else if(Gochi_Status.s_Full >= 100) {

			System.out.printf("캐릭터가 고도비만에 걸려 건강이 \"%d\" 추가감소하였습니다.\n", count_Full*10);
			Gochi_Status.s_Health -= count_Full*10;

			count_Full++;

			if(count_Full > 3)			count_Full = 3;			// count_Full의 최대값은 3

		}else if(Gochi_Status.s_Full < 100) {

			if(Gochi_Status.s_Full <= 80 && exit_Full > 1) {
				System.out.println("고도비만을 탈출했습니다.");
				exit_Full = 1;	// 고도비만 탈출 (초기화)
			}
			count_Full = 1; 	// s_Full가 100 미만으로 내려가면 count는 1로 초기화
		}

		//포만감 → 20이하일때 영양실조에 걸림
		if(Gochi_Status.s_Full <=20 && Gochi_Status.s_Full > 0 && exit_Less == 1) {
			System.out.println("캐릭터가 영양실조에 걸렸습니다.");
			exit_Less ++;

		}else if(Gochi_Status.s_Full <= 0) {	//포만감 → 0이하일때, 건강 -10, -20, -30

			System.out.printf("캐릭터가 영양실조에 걸려 건강이 \"%d\" 추가감소하였습니다.\n", count_Less*10);
			Gochi_Status.s_Health -= count_Less*10;
			count_Less ++;

			if(count_Less > 3) 		count_Less = 3;		// count_less의 최대값은 3

		}else if(Gochi_Status.s_Full >= 20 && exit_Less > 1) {	//포만감이 20 이상으로 회복 시 영양실조 탈출(초기화)
			count_Less = 1; 	// s_less가 20 초과하면 count는 1로 초기화
			exit_Less = 1;	// 영양실조 탈출 (초기화)
			System.out.println("영양실조를 탈출했습니다.");
		} // 영양실조 종료 

		// 용변-------------------------------------------------------------------------------------//
		// 용변 → 80이상일 때, 문구 용변 / 100일 때, 건강 -10, -20, -30
		if (Gochi_Status.s_Dung >= 80 && Gochi_Status.s_Dung < 100 && exit_Dung ==1) {
			System.out.println("캐릭터가 장염에 걸렸습니다. 화장실을 가야 합니다.");
			exit_Dung++;
		}else if(Gochi_Status.s_Dung <= 0) Gochi_Status.s_Dung = 0;	
		else if (Gochi_Status.s_Dung >=100) {
			System.out.printf("캐릭터가 장염에 걸려 건강이 \"%d\" 추가감소하였습니다.\n", count_Dung*10);
			Gochi_Status.s_Health -= 10*count_Dung;

			count_Dung++;
			if (count_Dung > 3) count_Dung = 3;				// count_Dung의 최댓값은 3

		}else if (Gochi_Status.s_Dung < 100) {
			if (Gochi_Status.s_Dung <= 80 && exit_Dung > 1) {
				System.out.println("장염을 탈출했습니다.");
				exit_Dung = 1;	//장염 탈출
			}
			count_Dung 	= 1;	//s_Dung가 100 미만으로 내려가면 count는 1로 초기화

		}

		//건강 -------------------------------------------------------------------------------------//
		// 건강 → 20 이하일 때, 건강이 악화됨 / 0이 되면 사망
		if(Gochi_Status.s_Health <= 20 && Gochi_Status.s_Health > 0 && count_Health == 1) {
			System.out.println("건강이 악화되었습니다. 치료가 필요합니다.");
		}
		else if(Gochi_Status.s_Health <= 0) {
			System.out.println("캐릭터가 사망하였습니다.");
		}

	}
}