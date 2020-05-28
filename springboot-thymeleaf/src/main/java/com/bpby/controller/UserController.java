package com.bpby.controller;

import com.bpby.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/header")
    public ModelAndView hello(Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("header");
        return mv;
    }


    @GetMapping
    public ModelAndView list(Model model) {
        User user = new User(1L,"bp","835977564@qq.com");
        User user1 = new User(2L,"bp","666666666@qq.com");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);

        model.addAttribute("userList",list);
        model.addAttribute("title", "用户管理");
        return new ModelAndView("users/list","userModel",model);
    }

    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id,Model model) {
        User user = new User(1L,"bp","835977564@qq.com");
        model.addAttribute("user",user);
        model.addAttribute("title", "查看用户");
        return new ModelAndView("users/view","userModel",model);
    }
    

    @GetMapping("/form")
    public ModelAndView createForm(Model model) {
        model.addAttribute("user",new User());
        model.addAttribute("title", "创建用户");
        return new ModelAndView("users/form","userModel",model);
    }

    @PostMapping
    public ModelAndView saveOrUpdateUser(User user) {
        User user1 = new User(2L,"bp","666666666@qq.com");
        return new ModelAndView("redirect:/users");//重定向到list页面
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteUser(@PathVariable("id") Long id) {
        return new ModelAndView("redirect:/users");//重定向到list页面
    }

    @GetMapping("/modify/{id}")
    public ModelAndView modifyUser(@PathVariable("id") Long id,Model model) {
        User user1 = new User(2L,"bp","666666666@qq.com");
        model.addAttribute("title", "修改用户");
        return new ModelAndView("users/modify","userModel",model);
    }

}