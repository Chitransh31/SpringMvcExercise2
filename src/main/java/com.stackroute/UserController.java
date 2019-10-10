package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/")
    public  String homePage()
    {
        return "index";
    }
    @RequestMapping("/log")
    public ModelAndView log(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("name");
        String userPassword = request.getParameter("password");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("userName", userName);
        mv.addObject("userPassword", userPassword);

        return mv;
    }

}
