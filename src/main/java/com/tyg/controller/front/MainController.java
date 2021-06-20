package com.tyg.controller.front;

import com.tyg.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping("/main")
    public String showAllGoods(Model model, HttpSession session) {

        String username;
        User user = (User) session.getAttribute("user");
        if (user == null) {
            username = null;
        } else {
            username = user.getUsername();
        }
        return "main";
    }

}
