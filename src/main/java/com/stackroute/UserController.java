package com.stackroute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Configuration
@Controller
public class UserController
{
    User user=new User("Welcome to Stackroute!");
    @GetMapping("/*")
    public ModelAndView add()
    {
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("result",user.getMessage());
        return mv;
    }

}
