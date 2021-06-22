package com.tyg.dao;

import com.tyg.pojo.Category;
import com.tyg.pojo.Shop;

import java.util.List;

public interface ShopDao {
    List<Shop> getShops();
    Shop getShopByID(Integer id);
    int updateShop(Shop shop);
    int addShop(Shop shop);
    int deleteShop(Shop shop);
}
