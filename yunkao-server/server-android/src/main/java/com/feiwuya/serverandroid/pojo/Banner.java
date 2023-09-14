package com.feiwuya.serverandroid.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 主页轮播图 bean
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banner {
    private int id;
    private String imgLink;
    private String hrefLink;
}
