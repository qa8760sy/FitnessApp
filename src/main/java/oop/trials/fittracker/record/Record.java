package oop.trials.fittracker.record;
import java.time.LocalDate;
public interface Record {
    public String target = "";
    public LocalDate date = null;

    public void update();

    public void setDate(LocalDate date);

    public LocalDate getDate();
}
