package com.company;

import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String pass;

    public User(String name, String login, String pass) {
        this.name = name;
        this.login = login;
        this.pass = pass;

    }
    public void helloUser(String login, String pass, User[] userArray ) {
        for (int i = 0; i < userArray.length; i++) {
            String uLogin = userArray[i].getLogin();
            String uPass = userArray[i].getPass();
            if (uLogin.equals(login) && uPass.equals(pass)) {
                System.out.println("hello " + userArray[i].getName());
                return;
            }
        }
        System.out.println("no user find");
    }



    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "User: " + name +
                ", login='" + login +
                ", pass='" + pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(login, user.login) &&
                Objects.equals(pass, user.pass);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}






