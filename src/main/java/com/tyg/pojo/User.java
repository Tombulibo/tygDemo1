package com.tyg.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String username;
    private String password;
    private String nickname;
    private String sex;
    private Date birthday;
    private String email;
    private String telephone;
    private boolean isSeller;
}
