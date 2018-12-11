package com.booksworld.adminconsumer.controller;

import com.booksworld.util.AjaxResult;
import com.booksworld.util.StringUtil;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @ResponseBody
    @RequestMapping(value = "login")
    public AjaxResult loginView(HttpServletRequest request,
                                  @RequestParam(name = "username")String username,
                                  @RequestParam(name = "password")String password) {
        AjaxResult result = new AjaxResult();
        LOG.error("来了");
        String accountPass = LOGINACCOUNT.get(username);
        if (!StringUtil.isEmpty(accountPass) && accountPass.equals(password)) {
            request.getSession().setAttribute("loginUser", username);
            result.setSuccess(true);
        }
        return result;
    }

    @RequestMapping("main")
    public String mian() {
        return "main";
    }

    @RequestMapping("out")
    public String out(HttpServletRequest request) {
        request.getSession().removeAttribute("loginUser");
        return "redirect:index";
    }
}
