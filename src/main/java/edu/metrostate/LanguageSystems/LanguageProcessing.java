package edu.metrostate.LanguageSystems;

import edu.metrostate.LanguageSystems.EnglishText;
import edu.metrostate.UserDataProcessing;

import java.util.HashMap;

public class LanguageProcessing {
	public HashMap<String,String> EnglishLang = new HashMap<String,String>();
	public HashMap<String,String> SpanishLang = new HashMap<>();
	public Integer LanguageSetting = 0;
	
	
	//Case 0 = English
	//Case 1 = Spanish
	//Case 2 = Korean
	//Case 3 = Deutch

	//TODO: Fix spanish language taking prority at the moment despite language being set to 0(English) by default
	
	public void initLang(UserDataProcessing UDP) {
		EnglishText eMap = new EnglishText();
		EnglishLang = eMap.EnglishMap();
		SpanishText sMap = new SpanishText();
		SpanishLang = sMap.SpanishMap();
		LanguageSetting = UDP.getLangsetting();
	}
	
	//Console Print
	public void PrintLang(String inputString) {
		String outputString = " ";
		switch(LanguageSetting) {
			case 0: outputString = processLangENG(inputString);break;
			case 1: outputString = processLangSPA(inputString);break;
		}
		System.out.println(outputString);
	}
	public void PrintLang(String inputString,String input1) {
		String outputString = " ";
		switch(LanguageSetting) {
			case 0: outputString = processLangENG(inputString);break;
			case 1: outputString = processLangSPA(inputString);break;
		}
		outputString = outputString.replace("R1", input1);
		System.out.println(outputString);
	}
	public void PrintLang(String inputString,String input1,String input2) {
		String outputString = " ";
		switch(LanguageSetting) {
			case 0: outputString = processLangENG(inputString);break;
			case 1: outputString = processLangSPA(inputString);break;
		}
		outputString = outputString.replace("R1", input1);
		outputString = outputString.replace("R2", input2);
		System.out.println(outputString);
	}
	
	//Return for graphical output
	public String getLang(String inputString) {
		String outputString = " ";
		switch(LanguageSetting) {
			case 0: outputString = processLangENG(inputString);break;
			case 1: outputString = processLangSPA(inputString);break;
		}
		return outputString;
	}
	public String getLang(String inputString,String input1) {
		String outputString = " ";
		switch(LanguageSetting) {
			case 0: outputString = processLangENG(inputString);break;
			case 1: outputString = processLangSPA(inputString);break;
		}
		outputString = outputString.replace("R1", input1);
		return outputString;
	}
	public String getLang(String inputString,String input1,String input2) {
		String outputString = " ";
		switch(LanguageSetting) {
			case 0: outputString = processLangENG(inputString);break;
			case 1: outputString = processLangSPA(inputString);break;
		}
		outputString = outputString.replace("R1", input1);
		outputString = outputString.replace("R2", input2);
		return outputString;
	}
	
	//Get full map for util purposes
	public HashMap<String,String> getLangMap(){
		switch (LanguageSetting){
			case 0: return EnglishLang;
			case 1: return SpanishLang;
		}
		return EnglishLang;
	}

	//Processor
	private String processLangENG(String toProcess){
		if(EnglishLang.containsKey(toProcess)){
			return EnglishLang.get(toProcess);
		}
		else{
			return EnglishLang.get("default");
		}
	}

	private String processLangSPA(String toProcess){
		if(SpanishLang.containsKey(toProcess)){
			return SpanishLang.get(toProcess);
		}
		else{
			return SpanishLang.get("default");
		}
	}
}
