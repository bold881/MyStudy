package com.nvee.httpUtils;

public enum ParamEnum {
	REG_DYNC(1),
	REG_PERS(2),
	REG_MECH(3),
	USR_LOGIN(4),
	MOD_PASSD(5),
	QUY_CARS(6),
	QUY_DESIC(7),
	QUY_HISPAY(8),
	QUY_FINES(9),
	ADD_CAR(10),
	QUY_DRIVE(11),
	ADD_DRIVE(12),
	MOD_DRIVE(13),
	MOD_CAR(14),
	QUY_USER(15),
	VAL_ACCT(16),
	CARD_DYNC(17),
	ADD_CARD(18),
	DEL_CARD(19),
	QUY_CARD(20),
	QUY_CBIN(21),
	PAY_FINE(22),
	PAY_PHONE(23);
	
	private int type;
	ParamEnum(int type) {
		this.type = type;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
