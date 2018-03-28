package com.mySSM.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mySSM.dao.IUserDao;
import com.mySSM.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
}
