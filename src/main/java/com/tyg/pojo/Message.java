package com.tyg.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private Integer id;
    private String sendUser;
    private String receiveUser;
    private String content;
    private Date time;
}
