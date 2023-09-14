package com.feiwuya.serverandroid.controller;

import com.feiwuya.serverandroid.pojo.Banner;
import com.feiwuya.serverandroid.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping("/banner")
    public List<Banner> getAllBanner() {
        return bannerService.getAllBanner();
    }
}
