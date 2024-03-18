package oop.trials.fittracker.goal;
import java.time.LocalDate;
public class Goal implements Record{
    private String goalType;
    private double goalValue;
    private double currentWeight;

    public void setGoalType(String goalType){
        this.goalType = goalType;
    }
    public void setValue(double goalValue){
        this.goalValue = goalValue;
    }
    public void setCurrentWeight(double currentWeight){
        this.currentWeight = currentWeight;
    }
    public String getGoalType(){
        return goalType;
    }
    public double getValue(){
        return goalValue;
    }
    public double getCurentWeight(){
        return currentWeight;
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
}
