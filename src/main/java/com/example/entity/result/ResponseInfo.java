package com.example.entity.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseInfo {
    String code;
    long time;
    DataBean data;
    String msg;
}
