package com.liumapp.demo.proxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/13/18
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @RequestMapping("/hello")
    public void hello () {
    }

}
