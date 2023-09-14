package com.feiwuya.serverandroid.dao;

import com.feiwuya.serverandroid.pojo.Banner;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerDao {
    @Select("select * from yunkao_banner order by id")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "img_link", property = "imgLink"),
            @Result(column = "href_link", property = "hrefLink")
    })
    List<Banner> getAllBanner();
}
