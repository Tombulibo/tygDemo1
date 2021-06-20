package com.tyg.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Goods {
    private long id;
    private String name;
    private long shopID;
    private long categoryID;
    private List<ImagePath> imagePaths;
    private String info;
    private float price;
    private int num;
}
