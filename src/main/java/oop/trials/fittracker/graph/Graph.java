package oop.trials.fittracker.graph;import java.time.LocalDate;
public class Graph{
    private LocalDate date;
    private Workout workout;
    private Goal goal;

    public void setDate(LocalDate date){
        this.date = date;
    }
    public void setWorkout(Workout workout){
        this.workout = workout;
    }
    public void setGoal(Goal goal){
        this.goal = goal;
    }
    public LocalDate getDate(){
        return date;
    }
    public Workout getWorkout(){
        return workout;
    }
    public Goal goal(){
        return goal;
    }
}
