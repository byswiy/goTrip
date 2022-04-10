package goTrip;

import java.util.Scanner;

public class Search {
	
	public void printLines() {
		System.out.println("===== ===== ===== ===== ===== =====");
	}

	public static void main(String[] args) {
		// 기능 : 여행 경비 입력 창
		
		Search line = new Search();
		
		Scanner scanf = new Scanner(System.in);
		
		line.printLines();
		System.out.println("최소 30만원에서 최대 300만원으로 입력 해야합니다");
		
		System.out.print("최소금액 입력 -> ");
		int minAmount = scanf.nextInt();
		
		System.out.print("최대금액 입력 -> ");
		int maxAmount = scanf.nextInt();
		
		if(minAmount < 300000) {
			line.printLines();
			System.out.println("최소금액이 맞지 않습니다");
		} else if(maxAmount > 3000000) {
			line.printLines();
			System.out.println("쵀대금액이 맞지 않습니다");
		} 
		

	}
}
