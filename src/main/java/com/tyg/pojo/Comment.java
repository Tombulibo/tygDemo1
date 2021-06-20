package com.tyg.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private Integer id;
    private String username;
    private Integer goodsID;
    private Integer point;
    private String content;
    private Date time;
}
