package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.info.InfoBean;
import com.example.mapper.InfoMapper;
import com.example.service.InfoService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InfoServiceImpl implements InfoService{

	@Autowired
    InfoMapper infoMapper;
    public void insert(InfoBean infoBean){
        infoMapper.addInfo(infoBean);
    }

    @Override
    public List<InfoBean> getInfo() {
        return infoMapper.getInfo();
    }

    @Override
    public boolean deleteInfo(int uid) throws Exception {
        return infoMapper.deleteInfo(uid);
    }
}
