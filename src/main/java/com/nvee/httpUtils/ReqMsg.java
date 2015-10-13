package com.nvee.httpUtils;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class ReqMsg {
	private static Gson gson = new Gson();
	public static String getInstance(int i){
		Map<String,Object> param = new HashMap<String,Object>();
		Map<String,Object> paramObj = new HashMap<String,Object>();
		String ret = null;
		switch(i){
			case 1:ret = regiestDyn(param,paramObj);break;
			case 2:ret = personReg(param,paramObj);break;
			case 3:ret = merchantReg(param,paramObj);break;
			case 4:ret = login(param,paramObj);break;
			case 5:ret = modifyPwd(param,paramObj);break;
			case 6:ret = quyCarList(param,paramObj);break;
			case 7:ret = quyDescionFine(param,paramObj);break;
			case 8:ret = quyHistoryList(param,paramObj);break;
			case 16:ret = volidateAcct(param,paramObj);break;
			case 22:ret = payFine(param,paramObj);break;
			case 23:ret = payPhone(param,paramObj);break;
			default:ret = "";
		}
		return ret;
	}

	//实名认证
	private static  String regiestDyn(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("bizType", "biz_register");
    	param.put("orgNo","CI0000000001");
    	param.put("refNo","18373171090");
		return gson.toJson(param);
	}
	//实名认证
	private static  String volidateAcct(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("txnClass","2");
    	param.put("route","ptxn0001");
    	param.put("routeType","ptxn01");
    	param.put("gateWay", "bgw0001");  
		param.put("gatewayType", "T01");  
		param.put("txnType", "A01");  
		param.put("txnCustType", "14");  
		param.put("txnCustNo", "PC0000000072");  
		param.put("txnUserId", "164");  
		paramObj.put("cardNo", "6225757531126283");
		paramObj.put("realName", "刘干普");
		paramObj.put("idType", "01");
		paramObj.put("phone", "18373171080");
		paramObj.put("idNo", "43012219900327001x");
		param.put("paramObj", paramObj);
		return gson.toJson(param);
	}
	//违法缴费
	private static String payFine(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("orderType","TxnTraffic");
    	param.put("txnClass","1");
    	param.put("route","ptxn0001");
    	param.put("routeType","ptxn07");
    	param.put("gateWay","bgw0001");
    	param.put("gatewayType","T07");
    	param.put("txnType","1");
    	param.put("txnCustType", "14");
    	param.put("txnCustNo", "PC0000000072");
    	param.put("txnUserId", "164");
    	param.put("txnCode","703010");
    	param.put("driverLic","430121198008157074");
    	param.put("driverName","jack");
    	param.put("licPlate","湘AU0413");
    	param.put("licClass","02");
    	param.put("engineNo","589652");
    	param.put("tvSn","20150824095831001");
    	param.put("tvTime","2015-05-07 09:10:00");
    	param.put("tvAddress","长沙-湘潭西线高速公路200米（学士收费站出口）");
    	param.put("tvBehavior","未随车携带行驶证的");
    	param.put("tvScore","6");
    	param.put("tvFineAmt","10000");
    	param.put("tvLateFee","100");
    	param.put("tvDecisionNo","435107100001956");
    	param.put("tvParty","何移标");
    	param.put("tvDisOrg","435107000010");
    	param.put("tvDisOrgName","湖南省高速公路交通警察局长沙支队道林大队");
    	param.put("tvProcTime","2015-05-12 12:30:30");
    	param.put("tvProcOrg","435107000010");
    	param.put("tvProcOrgName","湖南省高速公路交通警察局长沙支队道林大队");
    	param.put("tvAmt","10100");
    	param.put("payDriverLic","43012219900327001x");
    	param.put( "cardNo","6214830109171164");
    	param.put("custType","14");
    	param.put("custNo","PC0000000072");
    	param.put("tvProcOrg","长沙市交警队");
    	param.put("status","1");
    	//txnRequest
    	paramObj.put("memo","交通罚款缴费");
    	paramObj.put( "extTraceNo","");
    	paramObj.put("txnCur","RMB");
    	paramObj.put("amt","10010");
    	paramObj.put("cardNo","6214830109171164");
    	paramObj.put("cvn2","248");
    	paramObj.put("exDate","1219");
    	paramObj.put("mchtNo","777290058113247");
    	paramObj.put("inCustNo","MC0000000001");
    	paramObj.put("inCustType","13");
    	paramObj.put("isIn","1");
    	paramObj.put( "txnType","C03");
    	paramObj.put( "txnClass","3");
    	paramObj.put("txnCustType", "14");
    	paramObj.put("txnCustNo", "PC0000000072");
    	paramObj.put( "txnUserId", "164");
    	paramObj.put( "orgNo","CI0000000001");
    	paramObj.put( "gateWay","2");
    	paramObj.put(  "gatewayType","1");
        param.put("txnRequest", paramObj);
		return gson.toJson(param);
	}
	//决定书查询
	private static String quyDescionFine(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("orderType","TxnTraffic");
		param.put("route","ptxn0001");
    	param.put("routeType","ptxn04");
    	param.put("gateWay", "bgw0001");  
		param.put("gatewayType", "T04");  
		param.put("txnClass","2");
		param.put("txnType", "6");  
		param.put("txnCustType", "14");  
		param.put("txnCustNo", "PC0000000072");  
		param.put("txnUserId", "164");
		param.put("driverLic", "63012219900327001x");
		param.put("tvDecisionNo", "435107100001956");
		return gson.toJson(param);
	}
	//个人会员注册
	private static String personReg(Map<String,Object> param,Map<String,Object> paramObj){
    	param.put("orgNo","CI0000000001");
    	param.put("orgName", "易宝机构");
    	param.put("userType", "01");
    	param.put("memberCode","0000005");
    	param.put("userName", "18373171078");
    	param.put("phone", "18373171078");
    	param.put("realName", null);
    	param.put("txnPwd", null);
    	param.put("idCard", null);
    	param.put("cardNo", null);
    	param.put("dynaCode","true");
    	param.put("inviter","");
    	param.put("loginPwd","YwP/HrGHrqQkxlI913qMAw");
		return gson.toJson(param);
	}
	//商户会员注册
	private static String merchantReg(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("orgNo","CI0000000001");
    	param.put("orgName", "易宝机构");
    	param.put("userType", "02");
    	param.put("memberCode","0000005");
    	param.put("userName", "18373171079");
    	param.put("phone", "18373171079");
    	param.put("merchantName", "测试商户名称");
    	param.put("licenseNumber","431003833");
    	param.put("corporateName", "nvee");
    	param.put("corporateIdCard","43012219900327001x");
    	param.put("realName", null);
    	param.put("txnPwd", null);
    	param.put("idCard", null);
    	param.put("cardNo", null);
    	param.put("dynaCode","true");
    	param.put("inviter","");
    	param.put("loginPwd","YwP/HrGHrqQkxlI913qMAw");
		return gson.toJson(param);
	}
	//用户登陆
	private static String login(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("route","app0001");
    	param.put("routeType","ops");
    	param.put("bizCode","00000002");  
    	param.put("custType",null);
    	param.put("custNo",null);
    	param.put("userId",null);
    	param.put("cardOrg","CI0000000001");
    	param.put("pageSize","10");
    	param.put("page","1");
    	paramObj.put("userName","18373171082");
    	paramObj.put("loginPwd","YwP/HrGHrqQkxlI913qMAw");
    	paramObj.put("phone","18373171082");
    	param.put("paramObj", paramObj);
		return gson.toJson(param);
	}
	//修改登陆密码
	private static String modifyPwd(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("route","app0001");
    	param.put("routeType","ops");
    	param.put("bizCode","00000003");  
    	param.put("custType","14");
    	param.put("custNo","PC0000000072");
    	param.put("userId","164");
    	param.put("cardOrg","CI0000000001");
    	param.put("pageSize","10");
    	param.put("page","0");
    	paramObj.put("userName","18373171082");
    	paramObj.put("oldLoginPwd","tBhh9rOECO/2H0nSl/Xr5w");//654321
    	paramObj.put("loginPwd","YwP/HrGHrqQkxlI913qMAw");
    	paramObj.put("sureLoginPwd","YwP/HrGHrqQkxlI913qMAw");//123456
    	param.put("paramObj", paramObj);
		return gson.toJson(param);
	}
	//查询指定会员的车辆
	private static String quyCarList(Map<String,Object> param,Map<String,Object> paramObj){
		param.put("route","app0001");
    	param.put("routeType","ops");
    	param.put("bizCode","00000004");
    	param.put("custType","14");
    	param.put("custNo","PC0000000072");
    	param.put("userId","164");
    	param.put("cardOrg","CI0000000001");
    	param.put("pageSize","10");
    	param.put("page","0");
		return gson.toJson(param);
	}
	private static String quyHistoryList(Map<String, Object> param,Map<String, Object> paramObj) {
		param.put("route","app0001");
    	param.put("routeType","ops");
    	param.put("bizCode","00000021");
    	param.put("custType","14");
    	param.put("custNo","PC0000000072");
    	param.put("userId","164");
    	param.put("cardOrg","CI0000000001");
    	param.put("pageSize","10");
    	param.put("page","0");
    	paramObj.put("txnType", "F01,F02,F03");
    	param.put("paramObj", paramObj);
		return gson.toJson(param);
	}
	private static String payPhone(Map<String, Object> param,Map<String, Object> paramObj) {
		param.put("route","app0001");
    	param.put("routeType","vgw");
    	param.put("bizCode","00000016");
    	param.put("custType","14");
    	param.put("custNo","PC0000000072");
    	param.put("userId","164");
    	param.put("cardOrg","CI0000000001");
    	param.put("pageSize","10");
    	param.put("page","0");
    	paramObj.put("province", "410000");
    	paramObj.put("operator", "01");
    	paramObj.put("phone", "18373171080");
    	paramObj.put("amt", "50");
    	paramObj.put("cardNo","6226388000000095");
    	param.put("paramObj", paramObj);
		return gson.toJson(param);
	}
}

