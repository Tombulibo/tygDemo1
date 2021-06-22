package com.tyg.service;

import com.tyg.pojo.Goods;
import com.tyg.pojo.ImagePath;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoods();
    Goods getGoodsByID(Integer id);
    List<Goods> getGoodsByCategory(Integer cateID);
    int updateGoods(Goods goods);
    int addGoods(Goods goods);
    int deleteGoods(Goods goods);

    List<ImagePath> findImagePath(Integer id);
    int addImagePath(ImagePath imagePath);
    int deleteImagePath(ImagePath imagePath);
}
