package com.tyg.dao;

import com.tyg.pojo.Goods;
import com.tyg.pojo.ImagePath;

import java.util.List;

public interface ImagePathDao {
    List<ImagePath> getImagePaths();
    ImagePath getImagePathByID(Integer pathID);
    List<ImagePath> findImagePath(Integer goodsID);
    int addImagePath(ImagePath imagePath);
    int deleteImagePath(ImagePath imagePath);
}
