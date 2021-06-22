package com.tyg.service.impl;

import com.tyg.dao.ShopDao;
import com.tyg.pojo.Shop;
import com.tyg.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Shop> getShops(){
        return shopDao.getShops();
    }

    @Override
    public Shop getShopByID(Integer id){
        return shopDao.getShopByID(id);
    }

    @Override
    public int updateShop(Shop shop){
        return shopDao.updateShop(shop);
    }

    @Override
    public int addShop(Shop shop){
        return shopDao.addShop(shop);
    }

    @Override
    public int deleteShop(Shop shop){
        return shopDao.deleteShop(shop);
    }
}
