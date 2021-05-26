package com.example.entity.result;

import com.example.entity.info.Basic_Information_Of_Equipment;
import com.example.entity.info.Exception_Information_List;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Exception_Information_List_Result {
    String code;
    long time;
    List<Exception_Information_List> data;
    String msg;
}
