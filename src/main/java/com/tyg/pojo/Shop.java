package com.tyg.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Shop {
    private Integer id;
    private String name;
    private String username;
    private List<ImagePath> imagePaths;
    private String info;
    private String delivery_address;
    private String delivery;
}
