package com.nvee.httpUtils;

public enum UrlEnum {
	
	APPS(1),PTXN(2),REG(3),DYNC(4),SAVEBANK(5),CARDBIN(6),DELBANK(7),QUYBANK(8);
	private int type;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	UrlEnum(int type) {
		this.type = type;
	}
	public static String initUrl(int i){
		String url = null;
		switch(i){
			case 1 :url = "http://127.0.0.1:8383/ca-web-srv/apps/appSrvRequest.action";break;
			case 2 :url = "http://172.19.29.65:8430/ca-web-srv/ptxn/doTxn.action";break;
			case 3 :url = "http://172.19.29.65:8430/ca-web-srv/userRegister/register.action";break;
			case 4 :url = "http://172.19.29.65:8430/ca-web-srv/dynamic/send.action";break;
			case 5 :url = "http://172.19.29.65:8430/ca-web-srv/bankCard/saveBankCard.action";break;
			case 6 :url = "http://172.19.29.65:8430/ca-web-srv/bankCard/getCardBin.action";break;
			case 7 :url = "http://172.19.29.65:8430/ca-web-srv/bankCard/deleteBankCard.action";break;
			case 8 :url = "http://172.19.29.65:8430/ca-web-srv/bankCard/queryBankCardByUserId.action";break;
			default:url = "";break;
		}
		return url;
	}
}
