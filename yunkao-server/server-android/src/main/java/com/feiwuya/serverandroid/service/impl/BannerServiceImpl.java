package com.feiwuya.serverandroid.service.impl;

import com.feiwuya.serverandroid.dao.BannerDao;
import com.feiwuya.serverandroid.pojo.Banner;
import com.feiwuya.serverandroid.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<Banner> getAllBanner() {
        return bannerDao.getAllBanner();
    }
}
