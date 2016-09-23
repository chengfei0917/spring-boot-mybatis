package ggcc.controller;

import ggcc.domain.User;
import ggcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gg on 16/5/21.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"", "index"}, method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public User index() {
        User user = userService.getUser(1);
        return user;
    }
}
