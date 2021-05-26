package com.example.entity.result;

import com.example.entity.info.Basic_Information_Of_Equipment;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Basic_Information_Of_Equipment_Result {
    String code;
    long time;
    List<Basic_Information_Of_Equipment> data;
    String msg;
}
