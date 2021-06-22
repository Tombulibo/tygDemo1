package com.tyg.dao;

import com.tyg.pojo.Goods;
import com.tyg.pojo.ImagePath;

import java.util.List;

public interface GoodsDao {
    List<Goods> getGoods();
    Goods getGoodsByID(Integer id);
    List<Goods> getGoodsByCategory(Integer cateID);
    int updateGoods(Goods goods);
    int addGoods(Goods goods);
    int deleteGoods(Goods goods);
}
