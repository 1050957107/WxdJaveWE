package com.example.controller;


import com.example.entity.result.ResultBean;
import com.example.entity.result.ResultInsertBean;
import com.example.weight.Constant;
import com.example.entity.info.InfoBean;
import com.example.service.InfoService;
import com.example.weight.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//http://localhost:8090
@RestController
@RequestMapping("/data")
public class WxdContotller {

    @Autowired
    InfoService infoService;
    //添加数据
    @RequestMapping(value = "/management", method = RequestMethod.POST)
    public ResultInsertBean manaGement(@RequestParam HashMap<String, Object> data) {
        System.out.println(data.size());
        ResultInsertBean resultInsertBean = new ResultInsertBean();
        try {
            if (data.size()!=0) {
                infoService.insert(insertInfo(data));
                ResultUtils.ResponInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.ResponInsertQuestException(resultInsertBean,e);
        }
        return resultInsertBean;
    }
    //查询所有数据
    @RequestMapping(value = "/getinfo", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> getInfo() {
        Map<String, Object> map = new HashMap<>();
        ResultBean resultBean = onInfoList();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    //删除数据
    @RequestMapping(value = "/deleteinfo",method = RequestMethod.POST)
    public ResultInsertBean deleteInfo(@RequestParam int uid){
        ResultInsertBean resultInsertBean = new ResultInsertBean();
        try {
            boolean isTrue = infoService.deleteInfo(uid);
            if (isTrue){
                ResultUtils.ResponInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            ResultUtils.ResponInsertQuestException(resultInsertBean,e);
            e.printStackTrace();
        }
        return resultInsertBean;
    }
    public InfoBean insertInfo(HashMap<String ,Object> data){
        InfoBean infoBean = new InfoBean();
        infoBean.setGame_name((String) data.get("game_name"));
        infoBean.setEquipment_number((String) data.get("equipment_number"));
        infoBean.setLocation_of_equipment((String) data.get("location_of_equipment"));
        return infoBean;
    }
    public ResultBean onInfoList(){
        ResultBean resultBean = new ResultBean();
        try {
            List<InfoBean> infoBeanList = infoService.getInfo();
            if (infoBeanList.size()!=0){
                ResultUtils.ResponSuccess(resultBean,infoBeanList);
            }else {
                ResultUtils.ResponError(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.ResponQuestException(resultBean,e);
        }
        return resultBean;
    }
}
