package com.booksworld.adminconsumer.controller.main;

import com.booksworld.adminconsumer.controller.IndexController;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Controller
public class MainController {

    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    public static final String  REST_URL_PREFIX = "http://localhost:8763";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/toEduCourse",method = RequestMethod.GET)
    public String list(Model model)
    {
        List<> eduCourseList = restTemplate.getForObject(REST_URL_PREFIX + "/EduCourse/toIndex", List.class);
        model.addAttribute("eduCourseList",eduCourseList);
        return "index";

    }
}
