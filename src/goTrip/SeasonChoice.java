package goTrip;

import java.util.Scanner;

public class SeasonChoice {

	public static void main(String[] args) {
		// ��� : ���� ���� �� ��õ�Ǵ� ������
		Season ss = new Season();
		
		SeasonChoice line = new SeasonChoice();
		
		Scanner scanf = new Scanner(System.in);

		System.out.println("������ ��õ ������");
		System.out.print("���� : ");
		String season = scanf.next();
		
		System.out.println("===== ===== ===== ===== =====");
		
		System.out.println("<< " + season + " ��õ ������ >>");
		
		if(season.equals("��")) {
			ss.spring();
		} else if(season.equals("����")) {
			ss.summer();
		} else if(season.equals("����")) {
			ss.autumn();
		} else if(season.equals("�ܿ�")) {
			ss.winter();
		}
		
		
		
	}

}
