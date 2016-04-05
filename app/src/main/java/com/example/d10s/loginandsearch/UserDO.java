package com.example.d10s.loginandsearch;

/**
 * Created by D10S on 4/5/16.
 */
public class UserDO {
    public String username;
    public String email;
    public String password;
    public String name;
    public String programmingLanguage;

    public UserDO(String username, String email, String password, String name,
                  String programmingLanguage) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
    }
}
