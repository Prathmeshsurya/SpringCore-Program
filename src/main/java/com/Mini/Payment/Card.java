package com.Mini.Payment;

public class Card implements iPayment {
	private String CardNo;
	private String CardName;
	@Override
	public boolean paymentVerification() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getCardNo() {
		return CardNo;
	}
	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}
	public String getCardName() {
		return CardName;
	}
	public void setCardName(String cardName) {
		CardName = cardName;
	}

}
