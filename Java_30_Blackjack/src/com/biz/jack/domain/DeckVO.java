package com.biz.jack.domain;

/*
 * �÷���ī��
 * �ѹ��� 52���� ī��(��Ŀ����)
 * suit : ����(���̾Ƹ���,��Ʈ��), ������(�����̵墼,Ŭ�ι���)
 * denomination(����) 13���� ����
 * 	����, ���ĺ�
 * 	2 ~ 10, J(jack)Q(quen)K(king)A(ace)
 * 
 */
public class DeckVO {
	
	private String suit;
	private String denomination;
	private int value;
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "[suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
}
