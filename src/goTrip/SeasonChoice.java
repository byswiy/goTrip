package goTrip;

import java.util.Scanner;

public class SeasonChoice {

	public static void main(String[] args) {
		// 기능 : 계절 선택 후 추천되는 여행지
		Season ss = new Season();
		
		SeasonChoice line = new SeasonChoice();
		
		Scanner scanf = new Scanner(System.in);

		System.out.println("계절별 추천 여행지");
		System.out.print("계절 : ");
		String season = scanf.next();
		
		System.out.println("===== ===== ===== ===== =====");
		
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

}
