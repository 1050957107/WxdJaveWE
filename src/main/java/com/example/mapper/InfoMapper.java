package com.example.mapper;

import com.example.entity.info.InfoBean;

import java.util.List;

public interface InfoMapper {
    void addInfo(InfoBean infoBean);
    List<InfoBean> getInfo();
    boolean deleteInfo(int uid);
}

