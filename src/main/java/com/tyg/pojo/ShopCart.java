package com.tyg.pojo;

import lombok.Data;

import java.util.Map;

@Data
public class ShopCart {
    private String username;
    private Map<Goods, Integer> goodsInfo;
}
