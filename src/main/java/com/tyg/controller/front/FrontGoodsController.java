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
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FrontGoodsController {

    @Autowired
    GoodsService goodsService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String detailGoods(Integer id, Model model, HttpSession session) {

        if(id == null) {
            return "redirect:/main";
        }

        User user = (User) session.getAttribute("user");

        //要传回的数据存在HashMap中
        Map<String,Object> goodsInfo = new HashMap<String,Object>();

        //查询商品的基本信息
        Goods goods = goodsService.getGoodsByID(id);

        /*
        if (user == null) {
            goods.setFav(false);
        } else {
            Favorite favorite = goodsService.selectFavByKey(new FavoriteKey(user.getUserid(), id));
            if (favorite == null) {
                goods.setFav(false);
            } else {
                goods.setFav(true);
            }
        }
         */

        //查询商品类别
        Category category = categoryService.getCategoryByID(goods.getCategoryID());

        //商品图片
        List<ImagePath> imagePath = goodsService.findImagePath(id);

        //商品评论
        /*
        //商品折扣信息
        Activity activity = activityService.selectByKey(goods.getActivityid());
        goods.setActivity(activity);

         */

        //返回数据
        goodsInfo.put("goods", goods);
        goodsInfo.put("cate", category);
        goodsInfo.put("image", imagePath);
        model.addAttribute("goodsInfo",goodsInfo);
//        model.addAllAttributes(goodsInfo);
        /*
        //评论信息
        CommentExample commentExample=new CommentExample();
        commentExample.or().andGoodsidEqualTo(goods.getGoodsid());
        List<Comment> commentList=commentService.selectByExample(commentExample);
        for (Integer i=0;i<commentList.size();i++)
        {
            Comment comment=commentList.get(i);
            User commentUser=userService.selectByPrimaryKey(comment.getUserid());
            comment.setUserName(commentUser.getUsername());
            commentList.set(i,comment);
        }
        model.addAttribute("commentList",commentList);

         */

        return "detail";
    }

}
