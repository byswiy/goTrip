package goTrip;

public class Money {

	public void lessThan10() {
		System.out.println("����, ��â, ����, �ܾ�, ����");
		System.out.println("����, ����, ��â, ����, ���");
		System.out.println("����, ����, ����, �ȵ�, ����");
		System.out.println("�뱸, �뿵, ����, �ϵ�, ���");
	}
	
	public void more10OrlessThan20() {
		lessThan10();
		System.out.println("����, ��õ, ����, ����, ����");
		System.out.println("��õ, ����, ����, ����, ����");
		System.out.println("�λ� â��, ����");
	}
	
	public void more20OrlessThan30() {
		more10OrlessThan20();
		System.out.println("�, ����, ����, ��â, ���V");
		System.out.println("����, �س�, ��ȭ, ��õ");
	}
	
	public void more30OrlessThan40() {
		more20OrlessThan30();
		System.out.println("����, �ξ�, ����, ����");
	}

}
