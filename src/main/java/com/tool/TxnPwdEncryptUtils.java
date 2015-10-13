package com.tool;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Description: 交易密码加密
 * @Createdate 2014年3月26日.
 **/
public class TxnPwdEncryptUtils {

	private final static String strkey = "A98FHWKWE213KDSA";

	// 加密
	public static String encrypt(String str) {
		String encryptStr = null;
		try {
			byte[] raw = strkey.getBytes();
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// "算法/模式/补码方式"
			// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
			IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			byte[] encrypted = cipher.doFinal(str.getBytes());
			//此处使用BASE64做转码功能，同时能起到2次加密的作用
			//encryptStr = new BASE64Encoder().encode(encrypted);
			encryptStr = HexUtils.encodeHex(encrypted);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return encryptStr;
	}

	//解密
	public static String decrypt(String encryptStr){
		try {
			byte[] raw = strkey.getBytes("ASCII");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			// 先用base64解密
			//byte[] encrypted1 = new BASE64Decoder().decodeBuffer(encryptStr);
			byte[] encrypted1 = HexUtils.decodeHex(encryptStr);
			try {
				byte[] original = cipher.doFinal(encrypted1);
				String originalString = new String(original);
				return originalString;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(TxnPwdEncryptUtils.encrypt("6315894611766944"));
		System.out.println(TxnPwdEncryptUtils.encrypt("6225882415370695"));
		System.out.println(TxnPwdEncryptUtils.encrypt("6225882415370695").length());
		
		System.out.println(TxnPwdEncryptUtils.decrypt("2F8C6B19BD61D68AE7BDDD897348855EF14F2827E0B10B59653B543504684772"));
		System.out.println(TxnPwdEncryptUtils.decrypt("9057F1728C01D89A5A7D3CBEF9CA0A82DE05E28B49E95E04D4B2401BC4A4D350"));
		
	}
}
