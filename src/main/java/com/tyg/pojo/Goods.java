package com.tyg.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Goods {
    private Integer id;
    private String name;
    private Integer shopID;
    private Integer categoryID;
    private List<ImagePath> imagePaths;
    private String info;
    private float price;
    private Integer num;
}
