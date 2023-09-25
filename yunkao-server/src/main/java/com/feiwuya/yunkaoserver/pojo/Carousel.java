package com.feiwuya.yunkaoserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carousel {
    private Integer id;
    private String urlAddress;
    private String desc;
    private Timestamp alterTime;


}
