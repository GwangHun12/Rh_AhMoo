package Project;
import java.util.Random;
import java.util.Scanner;

public class MiniPJ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int currentMoney = 10000;
        int fatigue = 0;
        int totalMoney = currentMoney;
        
        
        finish:
        while (true) {

            System.out.println("=================작업을 선택하세요.====================");
            System.out.println("잔액 : " + totalMoney);
            System.out.println("피로도 : " + fatigue);
            System.out.println();
            System.out.println("1. 아르바이트 하기");
            System.out.println("2. 쇼핑하기");
            System.out.println("3. 게임하기");
            System.out.println("4. 휴식");
            System.out.println("5. 잔액조회");
            System.out.println("6. 피로도조회");
            System.out.println("====================================================");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. 편의점 아르바이트 하기(8500원 피로도20) ");
                    System.out.println("2. 서빙 아르바이트 하기(10000원 피로도30)");
                    System.out.println("3. 노가다 뛰기(18000원 피로도60)");
                    System.out.println("4. 종료하기");

                    int work = scanner.nextInt();

                    switch (work) {
                        case 1:
                            int storemoney = 8500;
                            int storefatigue = 20;
                            if(fatigue > 80) {
                            	System.out.println("캐릭터의 피로도가 가득찼습니다.");
                            	break;
                            } else {
                            	System.out.println("=========알바를 시작합니다.....=========");
                            	System.out.println("=============알바중.....==============");
                            	System.out.println("============알바가 끝났습니다....===========");
                            	totalMoney += storemoney;
                            	fatigue += storefatigue;
                            	System.out.println("잔액 : " + totalMoney);
                            	System.out.println("피로도 : " + fatigue);
                            	break;
                            }

                        case 2:
                            int servMoney = 10000;
                            int servfatigue = 30;
                            if(fatigue > 70) {
                            	System.out.println("캐릭터의 피로도가 가득찼습니다.");
                            	break;
                            } else {
                            	System.out.println("=========알바를 시작합니다.....=========");
                            	System.out.println("=============알바중.....==============");
                            	System.out.println("============알바가 끝났습니다....===========");
                            	totalMoney += servMoney;
                            	fatigue += servfatigue;
                            	System.out.println("잔액 : " + totalMoney);
                            	System.out.println("피로도 : " + fatigue);
                            	break;
                            }

                        case 3:
                            int workMoney = 18000;
                            int workfatigue = 60;
                            if(fatigue > 40) {
                            	System.out.println("캐릭터의 피로도가 가득찼습니다.");
                            	break;
                            }else {
                            	System.out.println("=========알바를 시작합니다.....=========");
                            	System.out.println("=============알바중.....==============");
                            	System.out.println("============알바가 끝났습니다....===========");
                            	totalMoney += workMoney;
                            	fatigue += workfatigue;
                            	System.out.println("잔액 : " + totalMoney);
                            	System.out.println("피로도 : " + fatigue);
                            	break;
                            	}
                        case 4:
                            System.out.println("종료하기");
                            break finish;
                    }
                    break;

                case 2:
                    System.out.println("1. 옷 구매하기1 (-10000원 피로도 -20)");
                    System.out.println("2. 옷 구매하기2 (-15000원 피로도 -40)");
                    System.out.println("3. 종료하기");

                    int shop = scanner.nextInt();
                    switch (shop) {
                        case 1:
                            int buy1Money = 10000;
                            int buy1fatigue = 20;
                            if(totalMoney < buy1Money) {
                            	System.out.println("잔액이 부족합니다.");
                            	break;
                            } else {
                            	System.out.println("========== 옷 주문중 ... =========");
                            	System.out.println("========== 배송중 ... =========");
                            	System.out.println("======== 배송이 완료되었습니다. =======");
                            	totalMoney -= buy1Money;
                        		fatigue -= buy1fatigue;
                        		System.out.println("잔액 : " + totalMoney);
                        		System.out.println("피로도 : " + fatigue);
                        		break;
                            	
                            }

                        case 2:
                            int buy2Money = 15000;
                            int buy2fatigue = 40;
                            if(totalMoney < buy2Money) {
                            	System.out.println("잔액이 부족합니다.");
                            	break;
                            } else {
                            	System.out.println("========== 옷 주문중 ... =========");
                            	System.out.println("========== 배송중 ... =========");
                            	System.out.println("======== 배송이 완료되었습니다. =======");
                            	totalMoney -= buy2Money;
                            	fatigue -= buy2fatigue;
                            	System.out.println("잔액 : " + totalMoney);
                            	System.out.println("피로도 : " + fatigue);
                            	break;
                            }

                        case 3:
                            System.out.println("종료하기");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. 주사위 굴리기 (게임머니 3000원 승리시 x2)");
                    System.out.println("2. 베스킨라빈스 (게임머니 4000원 승리시 x2)");
                    System.out.println("3. 경마게임 (게임머니 4000원 승리시 x2)");
                    System.out.println("4. 종료하기");
                    int game = scanner.nextInt();
                    String User;
                    String com;
                    int UserCount = 0;
                    int comCount = 0;
                    String gamePlay;

                    Random ran = new Random();
                    switch (game) {
                        case 1:
                        	int gameMoney = 3000;
                        	if(totalMoney < gameMoney) {
                        		System.out.println("게임머니가 부족합니다.");
                        	} else {
                        		while (true) {
                        			System.out.println("===== 주사위 게임을 시작하겠습니다.=======");
                        			System.out.println("===== 승리시 +3000원 패배시 -3000원 =======");
                        			System.out.println("주사위를 굴리시려면 ENTER키를 누르세요");
                        			System.out.println("===========================================");
                        			
                        			Scanner scan = new Scanner(System.in);
                        			User = scan.nextLine();
                        			if (User.equals("")) {
                        				int ranNum = ran.nextInt(6) + 1;
                        				UserCount = ranNum;
                        				System.out.println("유저의 숫자는 : " + ranNum + " 입니다.");
                        			}
                        			System.out.println("컴퓨터의 주사위를 굴리시려면 ENTER키를 누르세요");
                        			com = scan.nextLine();
                        			if (com.equals("")) {
                        				int ranNum = ran.nextInt(6) + 1;
                        				comCount = ranNum;
                        				System.out.println("컴퓨터의 숫자는 : " + ranNum + " 입니다.");
                        			}
                        			System.out.println();
                        			
                        			if (UserCount > comCount) {
                        				System.out.println("당신이 이겼습니다");
                        				totalMoney += gameMoney;
                        				System.out.println("축하합니다! 승리하셔서 3000원을 획득하셨습니다.");
                        				System.out.println("잔액 : " + totalMoney);
                        			} else if (UserCount < comCount) {
                        				System.out.println("당신이 졌습니다");
                        				totalMoney -= gameMoney;
                        				System.out.println("패배하셨습니다. 게임머니 3000원을 잃었습니다.");
                        				System.out.println("잔액 : " + totalMoney);
                        			} else if (UserCount == comCount) {
                        				System.out.println("비겼습니다");
                        			}
                        			System.out.println();
                        			
                        			System.out.println("다시 하시겠습니까? (Y/N)");
                        			gamePlay = scan.nextLine();
                        			if (gamePlay.equalsIgnoreCase("N")) {
                        				break;
                        			}
                        		}
                        		
                        	}
                            break;

                        case 2:
                        	int Br31Money = 4000;
                        	if(totalMoney < Br31Money) {
                        		System.out.println("게임머니가 부족합니다.");
                        		break;
                        	} else {
                        		while (true) {
                        			System.out.println("====== 베스킨라빈스31 게임을 시작합니다.======");
                        			System.out.println("====== 승리시 + 4000원 패배시 - 4000원 ======");
                        			System.out.println("===========================================");

                        			System.out.println("숫자를 입력하세요.(1부터3까지만 가능)");
                        			Scanner scn = new Scanner(System.in);
                        			int userNum = scn.nextInt();
                        			if (userNum >= 1 && userNum <= 3) {
                        				UserCount += userNum;
                        				System.out.println("현재 숫자는 : " + UserCount);
                        				comCount = UserCount % 4;
                        				if (comCount == 0) {
                        					comCount = 1;
                        				}
                        				System.out.println("컴퓨터가 가져갈 숫자는 : " + comCount);
                        				UserCount += comCount;
                        				if (UserCount >= 31) {
                        					System.out.println("컴퓨터가 이겼습니다.");
                        					totalMoney -= Br31Money;
                        					System.out.println("패배하셨습니다. 게임머니 4000원을 잃었습니다.");
                        					System.out.println("잔액 : " + totalMoney);
                        					System.out.println("게임을 종료합니다.");
                        					break;
                        				} else if (UserCount == 30) {
                        					System.out.println("당신이 이겼습니다!");
                        					totalMoney += Br31Money;
                        					System.out.println("축하합니다! 승리하셔서 4000원을 획득하셨습니다.");
                        					System.out.println("잔액 : " + totalMoney);
                        					System.out.println("게임을 종료합니다.");
                        					break;
                        				}
                        			} else {
                        				System.out.println("입력 범위를 초과하였습니다.");
                        			}
                        		}
                        	}
                            break;

                        case 3:
                        	int horseMoney = 5000;
                        	if(totalMoney < horseMoney) {
                        		System.out.println("게임머니가 부족합니다.");
                        		break;
                        	} else {
                        		System.out.println("========== 경마게임을 시작합니다. ============");
                        		System.out.println("========== 적중성공 + 15000원 적중실패 - 5000원 ============");
                        		System.out.println("============== 공동우승시에는 + 10000원 ===============");
                        		System.out.println("우승말을 예측하여 숫자를 입력해주세요");
                        		System.out.println("숫자는 1 ~ 5 입력해주세요.");
                        		System.out.println("==============================================");
                        		Scanner scr = new Scanner(System.in);
                        		int userNum = scr.nextInt();
                        		int[] rank = new int[5]; 
                        		int[][] track = new int[5][25];
                        		int[] position = new int[5];
                        		
                        		
                        		for(int i=0; i<track.length; i++) {
                        			track[i][0] = i + 1; 
                        			track[i][20] = 9; 
                        		}
                        		
                        		boolean run = true;
                        		while(run) {
                        			for(int i=0; i<track.length; i++) {
                        				for(int j=0; j<track[i].length; j++) {
                        					if(track[i][j] == 0) {
                        						System.out.print("[ ] ");
                        					} else if(track[i][j] > 0 && track[i][j] < 6) {
                        						System.out.print("[" + track[i][j] + "] ");
                        					} else if(track[i][j] == 9) {
                        						System.out.print("■ ");
                        					}
                        				}
                        				System.out.println();
                        			}
                        			System.out.println();
                        			System.out.println();
                        			
                        			int goalIn = 0; 
                        			int winIdx = 0;
                        			for(int i=0; i<track.length; i++) {
                        				for(int j=0; j<20; j++) {
                        					if(track[i][j] != 0) {
                        						break;
                        					}
                        					if(track[i][j] == 0 && j == 19) {
                        						goalIn++;
                        						winIdx = i;
                        					}
                        				}
                        			}
                        			
                        			if(goalIn > 1) {
                        				System.out.println("공동 1등 발생");
                        				if(userNum == goalIn) {
                        					System.out.println("축하합니다! 우승말을 맞추셨습니다. 공동우승으로 게임머니 10000원을 획득하셨습니다.");
                        					totalMoney += horseMoney*2;
                        					System.out.println("잔액 : " + totalMoney);
                        				}else {
                        					System.out.println("1등말을 맞추지 못하였습니다. 게임머니 5000원이 차감됩니다.");
                        					totalMoney -= horseMoney;
                        					System.out.println("잔액 : " + totalMoney);
                        				}
                        				break;
                        			} else if(goalIn == 1) {
                        				System.out.println((winIdx+1) + "번 말 1등으로 골인");
                        				if(userNum == (winIdx+1)) {
                        					System.out.println("축하합니다! 우승말을 맞추셨습니다. 게임머니 15000원을 획득하셨습니다.");
                        					totalMoney += horseMoney*3;
                        					System.out.println("잔액 : " + totalMoney);
                        				}else {
                        					System.out.println("1등말을 맞추지 못하였습니다. 게임머니 5000원이 차감됩니다.");
                        					totalMoney -= horseMoney;
                        					System.out.println("잔액 : " + totalMoney);
                        				}
                        				break;
                        			}
                        			
                        			
                        			int r = 1; 
                        			for(int i=0; i<track.length; i++) {
                        				track[i][position[i]] = 0;
                        				position[i] += ran.nextInt(3)+1;
                        				track[i][position[i]] = i + 1;
                        				if(position[i] > 19) { 
                        					rank[i] = r;
                        					r++;
                        				}
                        			}
                        			
                        			try {
                        				Thread.sleep(500);
                        			} catch (Exception e) {
                        			}
                        		}
                        		
                        	}

                    	

                    
          
                        	
                        case 4:
                            System.out.println("종료하기");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1. 휴식하기 (피로도 -10)");
                    System.out.println("2. 종료하기");
                    int rest = scanner.nextInt();
                    switch (rest) {
                        case 1:
                            int restFatigue = 10;
                            if(fatigue <= 0) {
                            	System.out.println("피로도가 모두 회복되었습니다.");
                            	break;
                            }else {
                            	System.out.println("=========== 휴식중 ....===========");
                            	System.out.println("============= zZZ ===========");
                            	System.out.println("========= 회복되었습니다. ========");
                            	fatigue -= restFatigue;
                            	System.out.println("피로도 : " + fatigue);
                            	break;
                            }

                        case 2:
                            System.out.println("종료하기");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("잔액 : " + totalMoney);
                    break;

                case 6:
                    System.out.println("피로도 : " + fatigue);
                    break;
            }
        }
    }
}