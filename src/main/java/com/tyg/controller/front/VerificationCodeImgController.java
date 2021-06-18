package com.tyg.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 程元通 on 2021/06/18.
 */
@Controller
public class VerificationCodeImgController {
    @RequestMapping("/verificationcodeimg")
    public ModelAndView verificationcodeimg(){
        ModelAndView verificationcodeimg=new ModelAndView();
        verificationcodeimg.setViewName("verificationcodeimg");
        return verificationcodeimg;
    }
}
