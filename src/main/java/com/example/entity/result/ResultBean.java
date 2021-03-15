package com.example.entity.result;

import com.example.entity.info.InfoBean;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResultBean {
    String code;
    long time;
    List<InfoBean> data;
    String msg;
}
