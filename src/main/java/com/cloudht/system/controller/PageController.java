package com.cloudht.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：YXling Create In 11:39 2018/6/3
 */
@RequestMapping("/page")
@Controller
public class PageController {
    @GetMapping({ "/about"})
    String about(Model model) {
        return "page/about";
    }
    @GetMapping({ "/codes"})
    String codes(Model model) {
        return "page/codes";
    }
    @GetMapping({ "/contact"})
    String contact(Model model) {
        return "page/contact";
    }
    @GetMapping({ "/gallery"})
    String gallery(Model model) {
        return "page/gallery";
    }
    @GetMapping({ "/services"})
    String services(Model model) {
        return "page/services";
    }
    @GetMapping({ "/single"})
    String single(Model model) {
        return "page/single";
    }
    @GetMapping({ "/register"})
    String register(Model model) {
        return "page/register";
    }

}
