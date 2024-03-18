package oop.trials.fittracker.workout;
class DistancedBased extends Workout{
    private double distance;
    private double weight;
    private int workoutIntensity;

    DistancedBased dbWorkout = new DistancedBased();
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setWorkoutIntensity(int intensity) {
        this.workoutIntensity = intensity;
    }

    public int getWorkoutIntensity() {
        return workoutIntensity;
    }
    public void calculateBurntcalories(){
        //METS X 3.5 X BW (KG) / 200 = KCAL/MIN
        double calories = 0.0;
        setCaloriesBurned(calories);
        showCaloriesBurned();
    }
    @Override
    public void calculateBurntCalories() {
        // Implement the METS formula for weight-based workout
        // METS X 3.5 X BW (KG) / 200 = KCAL/MIN
        double calories = getMETS() * 3.5 * weight / 200;
        setCaloriesBurned(calories);
    }

    public double getMETS() {
        double mets = determineMETSScore();
        return mets;
    }
    public double determineMETSScore() {
        int intensity = getWorkoutIntensity();

        if (intensity >= 7 && intensity <= 10) {
            return 6.0;
        } else if (intensity >= 4 && intensity <= 6) {
            return 4.0;
        } else if (intensity >= 1 && intensity <= 3) {
            return 1.5;
        } else {
            // Handle other cases or provide a default METS value
            return 3.0; // Default METS value for cases outside the specified scale
        }
    }
}
