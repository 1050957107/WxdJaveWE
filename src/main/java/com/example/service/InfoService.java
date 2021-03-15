package com.example.service;

import com.example.entity.info.InfoBean;

import java.util.List;

public interface InfoService {
    void insert(InfoBean infoBean) throws Exception;
    List<InfoBean> getInfo() throws Exception;
    boolean deleteInfo(int uid) throws Exception;
}
