package com.tyg.pojo;

import lombok.Data;

@Data
public class Address {
    private Integer id;
    private String username;
    private String province;
    private String city;
    private String country;
    private String detail;
    private String conName;
    private String conTel;
}
