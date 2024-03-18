package oop.trials.fittracker.workout;

import java.time.LocalDate;

public abstract class Workout implements Record{
    private int amountOfTime;
    private double caloriesBurned;
    private int workoutIntensity;

    public void showCaloriesBurned() {
        System.out.println("You've burned "+caloriesBurned);
    }
    public void showInput(double input){
        System.out.println("You've entered " + input);
    }

    public void setCaloriesBurned(double caloriesBurned){
        this.caloriesBurned = caloriesBurned;
    }
    public abstract void calculateBurntCalories();

    public void rateWorkout(int intensity) {
        this.workoutIntensity = intensity;
    }
    @Override
    public void update(){

    }

    @Override
    public void setDate(LocalDate date) {

    }

    @Override
    public LocalDate getDate() {
        return null;
    }
    public void record(){

    }
