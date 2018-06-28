package com.text.land3;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {


    private UserDao userDao;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/register.html")
    public String register(){
        return "register";
    }

    @RequestMapping("/front/addregister")
    public String register(HttpServletRequest request){

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        if (password.equals(password2)){
            User userEntity = new User();
            userEntity.setUsername(username);
            userEntity.setPassword(password);
            userDao.save(userEntity);
            return "index";
        }else {
            return "register";
        }
    }

    @RequestMapping("")
    public String login(){
        return "login";
    }

    @RequestMapping("/addlogin")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User userEntity = userDao.findByUsernameAndPassword(username,password);
        String str = "";
        if (userEntity !=null){
            str = "index";
        }else {
            str = "login";
        }
        return str;
    }
}