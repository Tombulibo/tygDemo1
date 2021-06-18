package com.tyg.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class VerificationCodeImgController {
    @RequestMapping("/verificationCodeImg")
    public ModelAndView verificationCodeImg(){
        ModelAndView verificationCodeImg =new ModelAndView();
        verificationCodeImg.setViewName("verificationCodeImg");
        return verificationCodeImg;
    }
}
