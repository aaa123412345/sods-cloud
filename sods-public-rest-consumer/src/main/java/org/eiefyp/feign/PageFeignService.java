package org.eiefyp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sods-public-rest-provider")
public interface PageFeignService {

    @RequestMapping("/page/test")
    String test(@RequestParam("info") String info);


}
