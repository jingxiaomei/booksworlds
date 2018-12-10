package com.booksworld.adminconsumer.controller;

import com.booksworld.util.StringUtil;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@Slf4j
@Controller
public class IndexController {

    public static final Map<String, String> LOGINACCOUNT;
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
    static {
        LOGINACCOUNT = new HashMap<String, String>();
        LOGINACCOUNT.put("admin1", "zahb63151");
        LOGINACCOUNT.put("admin2", "zahb63152");
        LOGINACCOUNT.put("admin3", "zahb63153");
        LOGINACCOUNT.put("admin4", "zahb63154");
        LOGINACCOUNT.put("gaolaoban", "gaolaoban");
    }

    @RequestMapping("index")
    public ModelAndView indexView() {
        return new ModelAndView("index");
    }

    @RequestMapping("login")
    public ModelAndView loginView(HttpServletRequest request,
                                  @RequestParam(name = "username")String username,
                                  @RequestParam(name = "password")String password) {
        String accountPass = LOGINACCOUNT.get(username);
        if (!StringUtil.isEmpty(accountPass) && accountPass.equals(password)) {
            request.getSession().setAttribute("loginUser", username);
            return new ModelAndView("redirect:/main");
        }
        return new ModelAndView("redirect:/index");
    }
}
