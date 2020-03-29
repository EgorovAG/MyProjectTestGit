package com.talwin;

public class User {
    private String login;
    private String password;
//    private double id;
//    private Role role;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
//        this.id = id;
//        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public double getId() {
//        return id;
//    }
//
//    public void setId(double id) {
//        this.id = id;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }

    @Override
    public String toString() {
        return "AuthUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
