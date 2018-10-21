package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by hello world on 2018/10/21.
 */
@Controller
@RequestMapping("userTest")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService service;

    @RequestMapping("/select")
    public List selectAll() {
        return service.selectAll();
    }

    @RequestMapping("/selectPage")
    public String selectByPage(Map map) {
        List<User> list = service.selectAll();
        logger.debug("===================================================");
        map.put("list", list);
        return "forward:/index.jsp";
    }
}
