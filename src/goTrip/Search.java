package goTrip;

import java.util.Scanner;

public class Search {
	
	public void printLines() {
		System.out.println("===== ===== ===== ===== ===== =====");
	}

	public static void main(String[] args) {
		// ��� : ���� ��� �Է� â
		
		Search line = new Search();
		
		Scanner scanf = new Scanner(System.in);
		
		line.printLines();
		System.out.println("�ּ� 30�������� �ִ� 300�������� �Է� �ؾ��մϴ�");
		
		System.out.print("�ּұݾ� �Է� -> ");
		int minAmount = scanf.nextInt();
		
		System.out.print("�ִ�ݾ� �Է� -> ");
		int maxAmount = scanf.nextInt();
		
		if(minAmount < 300000) {
			line.printLines();
			System.out.println("�ּұݾ��� ���� �ʽ��ϴ�");
		} else if(maxAmount > 3000000) {
			line.printLines();
			System.out.println("����ݾ��� ���� �ʽ��ϴ�");
		} 
		

	}
}
