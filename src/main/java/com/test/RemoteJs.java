package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class RemoteJs {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		try {
			engine.eval(new FileReader(new File("E:/gitProject/MyStudy/src/com/js/test.js")));
			Invocable able = (Invocable)engine;
		
		   String callback = (String) able.invokeFunction("sayhello","aaa");
			System.out.println(callback);
			
			String[] cmd = {""};
			Runtime run =Runtime.getRuntime();
			Process  p = run.exec("./js/test.js");
			BufferedReader read =  new BufferedReader(new InputStreamReader(p.getInputStream()));
			System.out.println(read.readLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	}
	}

}
