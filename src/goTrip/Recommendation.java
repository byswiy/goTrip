package goTrip;

import java.util.ArrayList;

public class Recommendation {

	public static void main(String[] args) {
		// ��� : ��õ top10
		Region region1 = new Region("����");
		Region region2 = new Region("�λ�");
		Region region3 = new Region("����");
		Region region4 = new Region("����");
		Region region5 = new Region("����");
		Region region6 = new Region("��õ");
		Region region7 = new Region("����");
		Region region8 = new Region("����");
		Region region9 = new Region("�뱸");
		Region region10 = new Region("����");
		
		
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
		System.out.println("<< ��õ top 10 >>");
		
		for(int i=0; i<recommendCountry.size(); i++) {
			System.out.println((i + 1) + ". " + recommendCountry.get(i));
		}
		
		System.out.println("===== ===== ===== ===== =====");
		
		
		
	}

}
