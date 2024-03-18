package edu.metrostate;

import edu.metrostate.Database.Profile;
import edu.metrostate.Database.Simple_workout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class UserDataProcessing {

    public User currentUser;
    public HashMap<String,Integer> userGoals;
    public Integer langsetting = 0;
    public HashMap<String,ArrayList<String>> AllUserInfo;
    public void initData(){
        currentUser = new User();
        userGoals = new HashMap<>();
        AllUserInfo = AllProfileInfo();
        String username = "mklein"; //TODO: Get Username from Login Form.
        currentUser.setName(AllUserInfo.get(username).get(0) + " " + AllUserInfo.get(username).get(1));
        currentUser.setAge(Integer.parseInt(AllUserInfo.get(username).get(6)));
        currentUser.setEmail(AllUserInfo.get(username).get(5));
        currentUser.setHeight(Double.parseDouble(AllUserInfo.get(username).get(3)));
        currentUser.setWeight(Double.parseDouble(AllUserInfo.get(username).get(4)));
    }

    public User getUser(){
        return currentUser;
    }
    public Integer getLangsetting(){return langsetting;};
    public HashMap<String,ArrayList<String>> AllProfileInfo(){
        HashMap<String,ArrayList<String>> toReturn = new HashMap<>();
        Profile info = new Profile();
        ArrayList<String> ListofProfiles = info.getAll();
        for(String values:ListofProfiles){
            String[] valuesInRow = values.split(":");
            ArrayList<String> remainingValues = new ArrayList<>();
            for(int i=1;i< valuesInRow.length;i++){
                if(i != 3) {
                    //3 Is the username which is already grabbed by the hashmap
                    remainingValues.add(valuesInRow[i]);
                }
            }
            toReturn.put(valuesInRow[3],remainingValues);
        }
        return toReturn;
    }
}
