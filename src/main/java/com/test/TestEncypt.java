package com.test;

import com.tool.TxnPwdEncryptUtils;

public class TestEncypt {
	public static void main(String[] args) {
		String str ="cain@172.19.25.20 pwd:cain2014 \n"+
					"cain@10.146.10.109    arm crm prm  pwd:cain123 \n"+
					"cain@10.146.10.110    acct order_server  order_cron \n"+
					"cain@10.146.10.111    operation_cron cust  acct_cron \n"+
					"cain@10.146.10.112    workflow report_server  report_cron \n"+
					"cain@10.146.10.113    arm crm prm \n"+
					"cain@10.146.10.114    operation_cron cust  acct_cron \n"+
					"cain@10.146.10.115    acct order_server  order_cron \n"+
					"cain@10.146.10.116    workflow report_server  report_cron \n"+
					"20 condb  hunanZS ";
		str = TxnPwdEncryptUtils.encrypt(str);
		System.out.println(str);
		String pwd = TxnPwdEncryptUtils.decrypt(str);
		System.out.println(pwd);
	}
	
}
