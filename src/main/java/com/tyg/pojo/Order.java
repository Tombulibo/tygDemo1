package com.tyg.pojo;

import lombok.Data;

import java.util.Date;

import java.util.Map;

@Data
public class Order {
    private Integer id;
    private String username;
    private Date time;
    private boolean isPay;
    private boolean isSend;
    private boolean isReceive;
    private boolean isComplete;
    private float price;
    private Integer addressID;
    private Map<Goods, Integer> goodsInfo;
}
