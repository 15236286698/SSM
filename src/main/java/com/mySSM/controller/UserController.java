package com.mySSM.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mySSM.dao.IUserDao;
import com.mySSM.model.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserDao userDao;

    @RequestMapping("/showUser")//不要.do也可以
    public void  selectUser(HttpServletRequest request
    , HttpServletResponse response) throws IOException
    {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userID=Long.parseLong(request.getParameter("id"));
        User user=this.userDao.selectUser(userID);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
    @RequestMapping("/index2")
    public String index2()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ParsePosition pos = new ParsePosition(0);

        Date datetime = formatter.parse("2018-03-28 18:04:00", pos);
        User model=new User();
        model.setEmail("10836123@qq.com");
        model.setPassword("10836");
        model.setUsername("ceshi");
        model.setRegIp("115.28.35.65");
        model.setRegTime(datetime);

        model.setRole("临时用户");
        model.setStatus(1);
        this.userDao.addUser(model);

        return "user/index";
    }
}
