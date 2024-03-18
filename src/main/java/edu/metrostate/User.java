package edu.metrostate;

import java.time.LocalDate;
import java.util.HashMap;

public class User {
    private Integer age =0;
    private Double weight =0.0;
    private Double height =0.0;
    private HashMap<String,HashMap<Integer,HashMap<Integer,HashMap<Integer,Double>>>> workouts = new HashMap<>(); //WorkoutType -> Year -> Month -> Day -> Minutes
    private Double waterOz = 0.0;
    private String email = "..........";
    private String name = "........";

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWaterOz() {
        return waterOz;
    }

    public void setWaterOz(Double waterOz) {
        this.waterOz = waterOz;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public HashMap<Integer, HashMap<Integer, HashMap<Integer, Double>>> getWorkoutListingsYear(String workoutType, Integer year){
        if(workouts.containsKey(workoutType)) {
            return workouts.get(workoutType);
        }
        else{
            return new HashMap<>();
        }
    }

    public void addWorkout(String workoutType, LocalDate currentDate, Double minutes){
        if(workouts.containsKey(workoutType)){
            if(workouts.get(workoutType).containsKey(currentDate.getYear())){
                if(workouts.get(workoutType).get(currentDate.getYear()).containsKey(currentDate.getMonthValue())){
                    if(workouts.get(workoutType).get(currentDate.getYear()).get(currentDate.getMonthValue()).containsKey(currentDate.getDayOfMonth())){
                        Double workoutMinutes = workouts.get(workoutType).get(currentDate.getYear()).get(currentDate.getMonthValue()).get(currentDate.getDayOfMonth());
                        workoutMinutes += minutes;
                        workouts.get(workoutType).get(currentDate.getYear()).get(currentDate.getMonthValue()).put(currentDate.getDayOfMonth(),workoutMinutes);
                    }
                }
            }
        }
        else{
            HashMap<LocalDate,Double> workout = new HashMap<>();
            workout.put(currentDate,minutes);
            //workouts.put(workoutType,workout);
        }
    }
}
