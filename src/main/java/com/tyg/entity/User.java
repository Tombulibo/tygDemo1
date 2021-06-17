package com.tyg.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String user_name;
    private String password;
    private String delivery_address;
    private String nickname;
    private String sex;
    private Date birthday;
    private String email;
    private String telephone;
    private boolean isSeller;
}
