package com.example.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;

    public Users() {
    }
}
