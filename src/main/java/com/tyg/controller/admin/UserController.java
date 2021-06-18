package com.tyg.controller.admin;

import com.tyg.pojo.User;
import com.tyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String confirmLogin(HttpServletRequest request, Model model, @RequestParam("username") String user_name, @RequestParam("password") String password, @RequestParam("confirmlogo") String confirmlogo) {

        HttpSession session=request.getSession();
        String verificationCode = (String) session.getAttribute("certCode");
        if (!confirmlogo.equals(verificationCode))
        {
            model.addAttribute("errorMsg","验证码错误");
            return "login";
        }

        User rightUser = userService.getUserByName(user_name);
        //判断是否存在用户
        if (rightUser == null) {
            model.addAttribute("errorMsg", "该用户不存在");
            return "login";
        }
        if (!rightUser.getPassword().equals(password)) {
            model.addAttribute("errorMsg", "密码错误");
            return "login";
        }
        session.setAttribute("user",rightUser);
        return "main";
    }
    @RequestMapping("register")
    public String register() {
        return "register";
    }
    @RequestMapping("/registerResult")
    public String registerResult(User user,@RequestParam("username") String user_name,Model registerResult) {

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
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session=request.getSession();
        session.removeAttribute("user");
        return "login";
    }
    @RequestMapping("/information")
    public String information(Model userModel,HttpServletRequest request){
        HttpSession session=request.getSession();
        User user;
        user=(User) session.getAttribute("user");
        if (user==null)
        {
            return "login";
        }
        String username =user.getUsername();
        user=userService.getUserByName(username);
        userModel.addAttribute("user",user);
        return "information";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,@RequestParam("username") String username) {
        //从数据库从把product取出来
        User user = userService.getUserByName(username);
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
        model.addAttribute("errorMsg", "修改成功");
        return "user_edit";
    }
}