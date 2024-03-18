package oop.trials.fittracker.tracker;
public class Tracker {
    private UserAccount userAccount;
    private UserProfile userProfile;
    private Goal userGoal;
    private Workout workout;
    private Graph graph;

    public void setUserAccount(UserAccount userAccount) {this.userAccount = userAccount;}

    public void setUserProfile(UserProfile userProfile) {this.userProfile = userProfile;}

    public void setUserGoal(Goal userGoal) {this.userGoal = userGoal;}

    public void setWorkout(Workout workout) {this.workout = workout;}

    public void setGraph(Graph graph) {this.graph = graph;}

    public UserAccount getUserAccount() {return userAccount;}

    public UserProfile getUserProfile() {return userProfile;}

    public Goal getUserGoal() {return userGoal;}

    public Workout getWorkout() {return workout;}

    public Graph getGraph() {return graph;}
}
