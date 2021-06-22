package com.tyg.service;

import com.tyg.pojo.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> getShops();
    Shop getShopByID(Integer id);
    int updateShop(Shop shop);
    int addShop(Shop shop);
    int deleteShop(Shop shop);
}
