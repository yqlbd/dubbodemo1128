package com.test.controller;

import com.test.bean.User;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by 343617 on 2016/11/28.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/showDubboUser.action")
    public String showDubboUser(Model model) {
        User user = userService.getDubboUser();
        model.addAttribute("user", user);
        return "showUser";
    }

}
