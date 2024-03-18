package edu.metrostate.LanguageSystems;

import java.util.HashMap;

public class EnglishText {
	public HashMap<String,String> EnglishMap(){
		HashMap<String,String> loadedMap = new HashMap<String,String>();
		loadedMap.put("default","Error: This Message Not Found, Please Contact Developer.");
		loadedMap.put("application.title","Fitness Tracker");
		loadedMap.put("application.update.button","Check for Updates");
		//Main Menu
		loadedMap.put("mainmenu.buttons.profile","Profile");
		loadedMap.put("mainmenu.buttons.workout","Add Workout");
		loadedMap.put("mainmenu.buttons.goal","Add Goal");
		loadedMap.put("mainmenu.buttons.exit","Exit");
		loadedMap.put("mainmenu.buttons.viewgraph","View Graphs");
		//Profile
		loadedMap.put("profilemenu.label.age","Age: R1");
		loadedMap.put("profilemenu.label.name","Name: R1");
		loadedMap.put("profilemenu.label.weight","Weight: R1lb");
		loadedMap.put("profilemenu.label.email","Email: R1");
		//Settings
		loadedMap.put("settingsbar.button.language","Language");
		loadedMap.put("settingsbar.button.theme","Theme");
		loadedMap.put("settings.title","Settings");
		//Toasters
		loadedMap.put("toast.welcome", "Welcome R1");
			//Time Notifications
		loadedMap.put("toast.time.update.app", "It has been R1 days since you last logged in.");
		loadedMap.put("toast.time.update.calories", "It has been R1 days since you last recorded a meal.");
		loadedMap.put("toast.time.update.workout", "It has been R1 days since you last recorded a workout.");
		loadedMap.put("toast.time.update.water", "It has been R1 days since you last logged your water intake.");
			//Workout Notifications
		loadedMap.put("toast.workout.sunny.jog", "It is a sunny day, it might be good for a jog.");
		loadedMap.put("toast.workout.sunny.swim", "It is a sunny day, it might be good for a swim.");
		loadedMap.put("toast.workout.sunny.hike", "It is a sunny day, it might be good for a hike.");
		loadedMap.put("toast.workout.rainy.gym", "It is a rainy day, it might be a good day for the gym.");
		loadedMap.put("toast.workout.rainy", "It is a rainy day, it might be a good day for the gym.");
		//Adding User Information
		loadedMap.put("entry.water.amount.popup", "Added R1oz of water");
		loadedMap.put("entry.water.title", "Enter your water intake");
		loadedMap.put("entry.calorie.amount.popup", "Added R1 calories");
		loadedMap.put("entry.calorie.title", "Enter your caloric intake");
		loadedMap.put("entry.exercise.amount.popup", "Added R1 minutes of R2");
		loadedMap.put("entry.exercise.title", "Enter your exercise information");
		//Graphics display text for graphs
		loadedMap.put("graphic.exercise.title", "R1 minutes of R2");
		loadedMap.put("graphic.exercise.axis1", "R1"); //Used for Time: Hour/Day/Month
		loadedMap.put("graphic.exercise.axis2", "Minutes");
		loadedMap.put("graphic.util.minute", "minute");
		loadedMap.put("graphic.util.hour", "hour");
		return loadedMap;
	}
}
