package com.tyg.controller;

import com.tyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
//@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("out");
        modelAndView.addObject("list",userService.findAll());
        return modelAndView;
    }

    @RequestMapping("/user/find")
    public ModelAndView find(@RequestParam("user_name") String user_name, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("out");
        modelAndView.addObject("user",userService.find(user_name));
        //System.out.println(userService.find(user_name).getUser_name());
        //response.sendRedirect(request.getContextPath());
        return modelAndView;
    }
}
