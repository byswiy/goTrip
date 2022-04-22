package goTrip;

import java.util.ArrayList;

public class Recommendation {

	public static void main(String[] args) {
		// ��� : ��õ top10
		Region region1 = new Region("제주");
		Region region2 = new Region("부산");
		Region region3 = new Region("전주");
		Region region4 = new Region("서울");
		Region region5 = new Region("경주");
		Region region6 = new Region("인천");
		Region region7 = new Region("강릉");
		Region region8 = new Region("속초");
		Region region9 = new Region("대구");
		Region region10 = new Region("여수");
		
		
		ArrayList<Region> recommendCountry = new ArrayList<>();
		recommendCountry.add(region1);
		recommendCountry.add(region2);
		recommendCountry.add(region3);
		recommendCountry.add(region4);
		recommendCountry.add(region5);
		recommendCountry.add(region6);
		recommendCountry.add(region7);
		recommendCountry.add(region8);
		recommendCountry.add(region9);
		recommendCountry.add(region10);
		
		System.out.println("===== ===== ===== ===== =====");
		System.out.println("<< 추천 top 10 >>");
		
		for(int i=0; i<recommendCountry.size(); i++) {
			System.out.println((i + 1) + ". " + recommendCountry.get(i));
		}
		
		System.out.println("===== ===== ===== ===== =====");
		
		
		
	}

}
