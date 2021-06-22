package com.tyg.controller.front;

import com.tyg.pojo.Category;
import com.tyg.pojo.Goods;
import com.tyg.pojo.ImagePath;
import com.tyg.pojo.User;
import com.tyg.service.CategoryService;
import com.tyg.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/main")
    public String showAllGoods(Model model, HttpSession session) {
        /*
        String username;
        User user = (User) session.getAttribute("user");
        if (user == null) {
            username = null;
        } else {
            username = user.getUsername();
        }
         */

        //数码分类
        List<Goods> digGoods = getCateGoods(1);
        model.addAttribute("digGoods", digGoods);

        //家电
        List<Goods> houseGoods = getCateGoods(2);
        model.addAttribute("houseGoods", houseGoods);

        //服饰
        List<Goods> colGoods = getCateGoods(3);
        model.addAttribute("colGoods", colGoods);

        //书籍
        List<Goods> bookGoods = getCateGoods(4);
        model.addAttribute("bookGoods", bookGoods);

        return "main";
    }

    public List<Goods> getCateGoods(Integer cateID) {
        //查询分类
        Category category = categoryService.getCategoryByID(cateID);

        if (category == null) {
            return null;
        }

        //查询属于刚查到的分类的商品
        List<Goods> goodsList = goodsService.getGoodsByCategory(cateID);

        List<Goods> goodsAndImage = new ArrayList<>();
        //获取每个商品的图片
        for (Goods goods:goodsList) {
            /*
            //判断是否为登录状态
            if (userid == null) {
                goods.setFav(false);
            } else {
                Favorite favorite = goodsService.selectFavByKey(new FavoriteKey(userid, goods.getGoodsid()));
                if (favorite == null) {
                    goods.setFav(false);
                } else {
                    goods.setFav(true);
                }
            }
             */

            List<ImagePath> imagePathList = goodsService.findImagePath(goods.getId());
            goods.setImagePaths(imagePathList);
            goodsAndImage.add(goods);
        }
        return goodsAndImage;
    }
}

