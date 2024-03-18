package oop.trials.fittracker.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserAccount {
    private String username;
    private String password;
    private String email;
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public UserAccount(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserAccount(){}

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email) throws IllegalArgumentException {
        if (validate(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format. Please re-enter your email.");
        }
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public boolean validate(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
