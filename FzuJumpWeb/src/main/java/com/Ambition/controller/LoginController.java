package com.Ambition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String Login(HttpServletRequest req, @RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if(username.equals("admin") && password.equals("123456")){
            HttpSession session = req.getSession();
            session.setAttribute("userInfo","admin");
            return "dashboard";
        }
        else{
            model.addAttribute("msg","用户名或者密码失败");
            return "main";
        }
    }
    @RequestMapping("/user/logout")
    public String Login(HttpServletRequest req,Model model){
        HttpSession session = req.getSession();
        session.invalidate();
        return "redirect:/index.html";
    }
}
