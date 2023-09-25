package com.feiwuya.yunkaoserver.controller;

import com.feiwuya.yunkaoserver.pojo.Carousel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarouselController {
    @GetMapping("/test")
    public String test() {
        return "测试";
    }
}
