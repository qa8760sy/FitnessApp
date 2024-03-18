package oop.trials.fittracker.user;

public class UserProfile {
    private int age;
    private float height, weight;
    private Goal goal;

    public UserProfile(){

    }
    public UserProfile(UserAccount userAccount){
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public Goal getGoal() {
        return goal;
    }
}
