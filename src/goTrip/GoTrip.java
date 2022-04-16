package goTrip;

import java.util.ArrayList;
import java.util.Scanner;

public class GoTrip {
	
	public static void menuList() {
		System.out.println("===== ===== ===== ===== =====");
		
		System.out.println("<< 기능 창 >>");
		System.out.println("1. 여행 경비 입력창");
		System.out.println("2. 지역별 인기 추천 장소");
		System.out.println("3. 인기있는 지역 10군데");
		System.out.println("4. 검색한 지역 별 인기 시,군 추천");
		System.out.println("5. 검색 내역");
		System.out.println("6. 계절 선택에 따른 지역 추천");
		System.out.println("7. 후기, 게시판");
		
		System.out.println("===== ===== ===== ===== =====");
	}
	
	public static void printline() {
		System.out.println("------- -------- ------- ------- ------");
	}
	
	public void showSearchRegion(ArrayList<SearchRegion> region) {
		for(int n=0; n<region.size(); n++) {
			SearchRegion wantRegion = region.get(n);
			
			System.out.println(wantRegion.getRegion());
		}
	} 
	
	public static void travelExpensesInput() {
		Money money = new Money();
		Scanner scanf = new Scanner(System.in);
		
		// 반복문을 사용해서 금액이 맞지 않을 때 다시 재입력 할 수 있게 한다
		while(true) {
			System.out.print("금액 입력 -> ");
			int inputMoney = scanf.nextInt();
				
			if(inputMoney >= 50000 && inputMoney < 100000) {
				System.out.println("10만원 미만 추천여행지 입니다!");
				money.lessThan10();
				break;
				
			} else if(inputMoney >= 100000 && inputMoney < 200000) {
				System.out.println("10만원 이상 20만원 미만 추천여행지 입니다!");
				money.more10OrlessThan20();
				break;
				
			} else if(inputMoney >= 200000 && inputMoney < 300000) {
				System.out.println("20만원 이상 30만원 미만 추천여행지 입니다!");
				money.more20OrlessThan30();
				break;
				
			} else if(inputMoney >= 300000 && inputMoney < 400000) {
				System.out.println("30만원 이상 40만원 미만 추천여행지 입니다!");
				money.more30OrlessThan40();
				break;
				
			} else {
				System.out.println("금액은 5만원 이상 40만원 미만입니다 다시 입력해주세요");
				continue;
				
			}
		}
	}
	
	public static void popularPlaceOfRegion() {
		Scanner scanf = new Scanner(System.in);
		
		ArrayList<String> firstRegion = new ArrayList<>();
		firstRegion.add("경기도 -> 에버랜드, 한국민속촌, 쁘띠프랑스");
		firstRegion.add("인천 -> 을왕리 해수욕장, 송도 센트럴파크, 인천 대공원");
		firstRegion.add("서울 -> 복촌 한옥마을, 올림픽 공원, 낙산공원");
				
		ArrayList<String> secondRegion = new ArrayList<>();
		secondRegion.add("충청도 -> 꽂지 해수욕장, 남당항, 아산지중해");
		secondRegion.add("세종 -> 세종 호수공원, 국립세종수목원, 베어트리파크");
		secondRegion.add("대전 -> 국립중앙과학관, 대전아쿠아리움, 대전오월드");
			
		ArrayList<String> thirdRegion = new ArrayList<>();
		thirdRegion.add("강원도 -> 대관령 양떼 목장, 남이섬, 하슬라 아트월드");
				
		ArrayList<String> fourthRegion = new ArrayList<>();
		fourthRegion.add("경상도 -> 동피랑 벽화마을, 바람의 언덕, 매미성");
		fourthRegion.add("대구 -> 이월드, 83타워, 국립대구과학관");
		fourthRegion.add("울산 -> 대왕암 공원, 간절곶, 신화마을");
		fourthRegion.add("부산 -> 감천문화마을, 광안리해수욕장, 국립광주박물관");
				
		ArrayList<String> fifthRegion = new ArrayList<>();
		fifthRegion.add("전라도 -> 순천만 국가공원, 낙안읍성민속마을, 대흥사");
		fifthRegion.add("광주 -> 펭귄마을, 국립광주과학관, 국립광주박물관");
			
		GoTrip.printline();
			
		System.out.println("1. 경기도 | 인천 | 서울");
		System.out.println("2. 충청도 | 세종 | 대전");
		System.out.println("3. 강원도");
		System.out.println("4. 전라도 | 광주");
		System.out.println("5. 경상도 | 대구 | 울산 | 부산");
			
		GoTrip.printline();
				
		System.out.print("알고싶은 지역의 번호 선택해주세요 -> ");
		int number = scanf.nextInt();
			
		GoTrip.printline();
			
		if(number == 1) {
			System.out.println("<경기도 | 인천 | 서울>");
		} else if(number == 2) {
			System.out.println("<충청도 | 세종 | 대전>");
		} else if(number == 3) {
			System.out.println("<강원도>");
		} else if(number == 4) {
			System.out.println("<전라도 | 광주>");
		} else if(number == 5) {
			System.out.println("<경상도 | 대구 | 울산 | 부산>");
		} else {
			System.out.println("번호를 잘못입력하셨습니다");
		}
				
				
		if(number == 1) {
			for(int i=0; i<firstRegion.size(); i++) {
				String fR = firstRegion.get(i);
				System.out.println((i + 1) + ". " + fR);
			}
		} else if(number == 2) {
			for(int i=0; i<secondRegion.size(); i++) {
				String sR = secondRegion.get(i);
				System.out.println((i + 1) + ". " + sR);
			}
		} else if(number == 3) {
			for(int i=0; i<thirdRegion.size(); i++) {
				String tR = thirdRegion.get(i);
				System.out.println((i + 1) + ". " + tR);
			} 
		} else if(number == 4) {
			for(int i=0; i<fourthRegion.size(); i++) {
				String foR = fourthRegion.get(i);
				System.out.println((i + 1) + ". " + foR);
			} 
		} else if(number == 5) {
			for(int i=0; i<fifthRegion.size(); i++) {
				String fiR = fifthRegion.get(i);
				System.out.println((i + 1) + ". " + fiR);
			} 
		}		
	}
	
	public static void popularPlaceTop10() {
		Scanner scanf = new Scanner(System.in);
		
		Region region1 = new Region("부산");
		Region region2 = new Region("남해");
		Region region3 = new Region("삼척");
		Region region4 = new Region("서울");
		Region region5 = new Region("전주");
		Region region6 = new Region("공주");
		Region region7 = new Region("순천");
		Region region8 = new Region("인천");
		Region region9 = new Region("제주도");
		Region region10 = new Region("안동");
			
			
		ArrayList<Region> recommendRegion= new ArrayList<>();
		recommendRegion.add(region1);
		recommendRegion.add(region2);
		recommendRegion.add(region3);
		recommendRegion.add(region4);
		recommendRegion.add(region5);
		recommendRegion.add(region6);
		recommendRegion.add(region7);
		recommendRegion.add(region8);
		recommendRegion.add(region9);
		recommendRegion.add(region10);
			
		GoTrip.printline();
		System.out.println("<< 추천 top 10 >>");
			
		for(int i=0; i<recommendRegion.size(); i++) {
			System.out.println("•" + recommendRegion.get(i));
		}
	}
	
	public static String searchCityCountryDistrict() {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("12개 지역 중 하나를 입력해주세요! -> ");
		String wantRegion = scanf.next();
			
		GoTrip.printline();
				
		SearchRegion wantR1 = new SearchRegion("강원도");
		SearchRegion wantR2 = new SearchRegion("경기도");
		SearchRegion wantR3 = new SearchRegion("인천");
		SearchRegion wantR4 = new SearchRegion("서울");
		SearchRegion wantR5 = new SearchRegion("충청도");
		SearchRegion wantR6 = new SearchRegion("대전");
		SearchRegion wantR7 = new SearchRegion("경상도");
		SearchRegion wantR8 = new SearchRegion("대구");
		SearchRegion wantR9 = new SearchRegion("울산");
		SearchRegion wantR10 = new SearchRegion("부산");
		SearchRegion wantR11 = new SearchRegion("전라도");
		SearchRegion wantR12 = new SearchRegion("광주");
				
		ArrayList<SearchRegion> sR = new ArrayList<>();
		sR.add(wantR1);
		sR.add(wantR2);
		sR.add(wantR3);
		sR.add(wantR4);
		sR.add(wantR5);
		sR.add(wantR6);
		sR.add(wantR7);
		sR.add(wantR8);
		sR.add(wantR9);
		sR.add(wantR10);
		sR.add(wantR11);
		sR.add(wantR12);
				
		for(SearchRegion wantRg: sR) {
			String name = wantRg.getRegion();

			if(name.equals("강원도") && wantRegion.equals("강원도")) {
				System.out.println("동해, 평창, 강릉, 속초, 영주, 봉화");
				GoTrip.printline();
				break;
			} else if(name.equals("경기도") && wantRegion.equals("경기도")) {
				System.out.println("수원, 시흥, 안성, 용인, 파주, 가평, 포천, 과천, 화성, 평택");
				GoTrip.printline();
				break;
			} else if(name.equals("인천") && wantRegion.equals("인천")) {
				System.out.println("중구, 서구, 계양, 부평, 남동, 동구, 연수");
				GoTrip.printline();
				break;
			} else if(name.equals("서울") && wantRegion.equals("서울")) {
				System.out.println("강동, 관악, 동대문, 강남, 영등포, 용산, 종로, 마포, 서초, 강북");
				GoTrip.printline();
				break;
			} else if(name.equals("충청도") && wantRegion.equals("충청도")) {
				System.out.println("단양, 영월, 충주, 청주, 보령, 논산, 서산, 태안, 당진");
				GoTrip.printline();
				break;
			}  else if(name.equals("대전") && wantRegion.equals("대전")) {
				System.out.println("동구, 중구, 유성구, 대덕구, 서구");
				GoTrip.printline();
				break;
			} else if(name.equals("경상도") && wantRegion.equals("경상도")) {
				System.out.println("안동, 영주, 경주, 통영, 거제, 하동, 창원, 남해, 사천, 진주");
				GoTrip.printline();
				break;
			} else if(name.equals("대구") && wantRegion.equals("대구")) {
				System.out.println("동구, 남구, 수성구, 중구, 달성군, 달서구");
				GoTrip.printline();
				break;
			} else if(name.equals("울산") && wantRegion.equals("울산")) {
				System.out.println("남구, 북구, 울주군, 중구, 동구");
				GoTrip.printline();
				break;
			} else if(name.equals("부산") && wantRegion.equals("부산")) {
				System.out.println("해운대, 부산진, 강서, 사상, 동래구, 중구, 남구");
				GoTrip.printline();
				break;
			} else if(name.equals("전라도") && wantRegion.equals("전라도")) {
				System.out.println("전주, 군산, 무주, 목포, 여수, 보성, 해남, 담양, 순천, 고창");
				GoTrip.printline();
				break;
			} else if(name.equals("광주") && wantRegion.equals("광주")) {
				System.out.println("광산구, 서구, 동구, 북구, 남구");
				GoTrip.printline();
				break;
			} // end if
		} // end for
		return wantRegion;
	}
	
	public static void searchHistory() {
		
	}
	
	public static void searchSeason() {
		Scanner scanf = new Scanner(System.in);
		
		Season ss = new Season();
		
		GoTrip.printline();

		System.out.println("계절별 추천 여행지");
		System.out.print("계절 : ");
		String season = scanf.next();
			
		GoTrip.printline();
			
		System.out.println("<< " + season + " 추천 여행지 >>");
			
		if(season.equals("봄")) {
			ss.spring();
		} else if(season.equals("여름")) {
			ss.summer();
		} else if(season.equals("가을")) {
			ss.autumn();
		} else if(season.equals("겨울")) {
			ss.winter();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		GoTrip.menuList();
		
		System.out.println();
		
		System.out.print("원하시는 기능의 번호를 선택해주세요 -> ");
		int num = scanf.nextInt();
		
		System.out.println();
		
		switch(num) {
		
		// case 1 기능 : 여행 경비를 입력 할 수 있는 창
		case MenuNumber.travelExpensesInput:
			// 해당하는 금액에 따라 여행지를 추천해준다
			GoTrip.printline();
			
			GoTrip.travelExpensesInput();
			break;
		// 여행 경비 입력 후 여행지 추천 종료
		
		// 지역별 인기 추천 장소 실행 
		case MenuNumber.popularPlaceOfRegion:
			GoTrip.popularPlaceOfRegion();
			break;
		// 지역별 인기 추천 장소 실행 종료
			
		// 인기있는 10군데
		case MenuNumber.popularPlaceTop10:
			GoTrip.popularPlaceTop10();
				
			GoTrip.printline();
			break;
		// 인기있는 10군데 지역 추천 종료
			
		// 검색한 지역 별 인기 시, 군 추천 기능창 실행
		case MenuNumber.searchCityCountryDistrict:
			boolean isRunning = true;
			
			while(isRunning) {
				GoTrip.searchCityCountryDistrict();
				
				System.out.println("검색을 계속 하시겠습니까? (y / n)");
				char answer = scanf.next().charAt(0);
				
				if(answer == 'n') {
					isRunning = false;
				}
			}
			break;
		// // 검색한 지역 별 인기 시, 군 추천 기능창 종료
		
		// 검색 내역 실행 (기능 보류)
		case MenuNumber.searchHistory: 
			
			break;
		// 검색 내역 종료
			
		// 계절별 나라 추천 기능창 실행
		case MenuNumber.searchSeason:
			GoTrip.searchSeason();
			break;
		
		// 계절 별 추천 지역 기능창 종료
			
		// 후기 창 실행 (기능 보류)
		case MenuNumber.review:
			break;
		
		// 후기 창 종료
		
		}
	}	
}
