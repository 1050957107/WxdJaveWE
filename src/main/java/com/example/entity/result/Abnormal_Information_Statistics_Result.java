package com.example.entity.result;

import com.example.entity.info.Abnormal_Information_Statistics;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Abnormal_Information_Statistics_Result {
    String code;
    long time;
    List<Abnormal_Information_Statistics> data;
    String msg;
}
