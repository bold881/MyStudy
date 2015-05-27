package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RemoteJs {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		try {
			engine.eval(new FileReader(new File("E:/gitProject/MyStudy/src/com/js/test.js")));
			Invocable able = (Invocable)engine;
		
		   String callback = (String) able.invokeFunction("sayhello");
			System.out.println(callback);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
