package com.tyg.controller.admin;

import com.tyg.pojo.User;
import com.tyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "user_list";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/confirmLogin")
    public String confirmLogin(Model model, @RequestParam("user_name") String user_name, @RequestParam("password")  String password) {
        User rightUser = userService.getUserByName(user_name);
        //判断是否存在用户
        if (rightUser == null) {
            model.addAttribute("msg", "不存在该用户");
            return "login";
        }
        if (!rightUser.getPassword().equals(password)) {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
        return "successLogin";
    }
    @RequestMapping("register")
    public String register() {
        return "register";
    }
    @RequestMapping("/registerResult")
    public String registerResult(User user,@RequestParam("user_name") String user_name,Model registerResult) {

        User rightUser =userService.getUserByName(user_name);

        if (rightUser!=null)
        {
            registerResult.addAttribute("errorMsg","用户名被占用");
            return "register";
        }
        else {
            userService.addUser(user);
            return  "login";
        }
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,@RequestParam("user_name") String user_name) {
        //从数据库从把product取出来
        User user = userService.getUserByName(user_name);
        //将product存入model之中
        model.addAttribute("user", user);
        //跳转页面
        return "user_edit";
    }

    @RequestMapping("/edit")
    public String edit(Model model, User user) {
        //System.out.println(product);
        userService.updateUser(user);
        model.addAttribute(user);
        model.addAttribute("msg", "修改成功");
        return "user_edit";
    }
}