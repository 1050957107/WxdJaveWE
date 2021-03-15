package com.example.weight;

import com.example.entity.info.InfoBean;
import com.example.entity.result.DataBean;
import com.example.entity.result.ResultBean;
import com.example.entity.result.ResultInsertBean;

import java.util.List;


public class ResultUtils {
    public static void ResponInsertSuccess(ResultInsertBean resultInsertBean){
        resultInsertBean.setCode(Constant.SUCCESSCODE);
        resultInsertBean.setTime(System.currentTimeMillis());
        resultInsertBean.setMsg(Constant.RESPONSESUCCESS);
        resultInsertBean.setData(new DataBean(""));
    }
    public static void ResponInsertError(ResultInsertBean resultInsertBean){
        resultInsertBean.setCode(Constant.ERRORCODE);
        resultInsertBean.setTime(System.currentTimeMillis());
        resultInsertBean.setMsg(Constant.RESPONSEERROR);
        resultInsertBean.setData(new DataBean(""));
    }
    public static void ResponInsertQuestException(ResultInsertBean resultInsertBean,Exception e){
        resultInsertBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultInsertBean.setTime(System.currentTimeMillis());
        resultInsertBean.setMsg(e.getMessage());
        resultInsertBean.setData(new DataBean(""));
    }

    public static void ResponSuccess(ResultBean resultBean, List<InfoBean> infoBean){
        resultBean.setCode(Constant.SUCCESSCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSESUCCESS);
        resultBean.setData(infoBean);
    }
    public static void ResponError(ResultBean resultBean){
        resultBean.setCode(Constant.ERRORCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSEERROR);
        resultBean.setData(null);
    }
    public static void ResponQuestException(ResultBean resultBean,Exception e){
        resultBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(e.getMessage());
        resultBean.setData(null);
    }
}
