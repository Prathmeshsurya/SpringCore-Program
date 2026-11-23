package com.Mini.Payment;

public class Paytem implements iPayment {
	private String QRcode;
	private String Name;
	@Override
	public boolean paymentVerification() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getQRcode() {
		return QRcode;
	}
	public void setQRcode(String qRcode) {
		QRcode = qRcode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
