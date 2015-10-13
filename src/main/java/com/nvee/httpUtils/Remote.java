package com.nvee.httpUtils;


public class Remote {
	public static void main(String[] args) {
		HttpClient client = new HttpClient();
		String urlStr =UrlEnum.initUrl(UrlEnum.APPS.getType());
		String paramStr = ReqMsg.getInstance(ParamEnum.PAY_PHONE.getType());//具体参数
		String reqStr = ReqEnum.APPREQ.getReq();//参数对象
		System.out.println("request="+paramStr);
		String resp = client.sendMsg(urlStr,paramStr ,reqStr);
		System.out.println("response"+resp);
	}
}
