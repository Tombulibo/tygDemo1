package com.tyg.service.impl;

import com.tyg.dao.GoodsDao;
import com.tyg.dao.ImagePathDao;
import com.tyg.pojo.Goods;
import com.tyg.pojo.ImagePath;
import com.tyg.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private ImagePathDao imagePathDao;

    @Override
    public List<Goods> getGoods(){
        return goodsDao.getGoods();
    }

    @Override
    public Goods getGoodsByID(Integer id){
        return goodsDao.getGoodsByID(id);
    }

    @Override
    public List<Goods> getGoodsByCategory(Integer cateID){
        return goodsDao.getGoodsByCategory(cateID);
    }

    @Override
    public int updateGoods(Goods goods){
        return goodsDao.updateGoods(goods);
    }

    @Override
    public int addGoods(Goods goods){
        return goodsDao.addGoods(goods);
    }

    @Override
    public int deleteGoods(Goods goods){
        return goodsDao.deleteGoods(goods);
    }

    @Override
    public List<ImagePath> findImagePath(Integer id){
        return imagePathDao.findImagePath(id);
    }

    @Override
    public int addImagePath(ImagePath imagePath){
        return imagePathDao.addImagePath(imagePath);
    }

    @Override
    public int deleteImagePath(ImagePath imagePath){
        return imagePathDao.deleteImagePath(imagePath);
    }
}
