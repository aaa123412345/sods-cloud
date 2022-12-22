package org.eiefyp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/test")
    public String test(String info){
        return "Provider Recieve Msg："+info;
    }
}
