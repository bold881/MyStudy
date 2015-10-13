package com.nvee.httpUtils;

public enum ReqEnum {
	/*
	 * txnRequest
	 */
	PTXNREQ("txnRequest"),
	/*
	 * appSrvRequest
	 */
	APPREQ("appSrvRequest"),
	/*
	 * userRequest
	 */
	USEREQ("userRequest"),
	/*
	 * dynamicRequest
	 */
	DYNAREQ("dynamicRequest"),
	/*
	 * settleInfoRequest
	 */
	SETTREQ("settleInfoRequest");
	
	private String req;
	ReqEnum(String req) {
		this.req = req;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
}
