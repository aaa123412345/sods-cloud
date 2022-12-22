package org.eiefyp.controller;


import org.eiefyp.feign.PageFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageRestController {
    @Autowired
    private PageFeignService pageFeignService;

    @RequestMapping("/test")
    public String test() {
        return pageFeignService.test("Test");
    }
    @RequestMapping("value = /hi")
    public String hi() {
        return pageFeignService.test("hi");
    }

    @RequestMapping("/{pathVariable}")
    public String yourRequestMethod(@PathVariable("pathVariable")String pathVariable){
        return pageFeignService.test(pathVariable);
    }


}
