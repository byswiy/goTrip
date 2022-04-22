package goTrip;

public class Money {

	public void lessThan10() {
		System.out.println("동해, 평창, 강릉, 단양, 영월");
		System.out.println("전주, 군산, 고창, 무주, 담양");
		System.out.println("광양, 목포, 광주, 안동, 영주");
		System.out.println("대구, 통영, 거제, 하동, 울산");
	}
	
	public void more10OrlessThan20() {
		lessThan10();
		System.out.println("서울, 인천, 속초, 수원, 시흥");
		System.out.println("순천, 여수, 보성, 고흥, 경주");
		System.out.println("부산 창원, 남해");
	}
	
	public void more20OrlessThan30() {
		more10OrlessThan20();
		System.out.println("곡성, 전주, 구례, 순창, 장픙");
		System.out.println("영광, 해남, 봉화, 사천");
	}
	
	public void more30OrlessThan40() {
		more20OrlessThan30();
		System.out.println("용인, 부안, 보령, 제주");
	}

}
