package org.fasttrackit;

public class Account {

    private final String username;
    private final String password;
    private final String greetingsMsg;


    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.greetingsMsg = "Hi "+username+"!";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGreetingsMsg() {
        return greetingsMsg;
    }
    @Override
    public String toString() {
        return this.username;
    }

}
