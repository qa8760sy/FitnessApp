package com.mypack;

import com.mypack.database.*;

public class Main {
   // Connect test = new Connect();


    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.insert("Matt", "Klein", "mklein", "pass",
                66, 145);

    }
}
