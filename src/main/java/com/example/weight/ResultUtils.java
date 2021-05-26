package com.example.weight;

import com.example.entity.info.Abnormal_Information_Statistics;
import com.example.entity.info.Basic_Information_Of_Equipment;
import com.example.entity.info.Exception_Information_List;
import com.example.entity.info.Game_Information_Statistics;
import com.example.entity.result.*;

import java.util.List;


public class ResultUtils {
    public static void ResponseInsertSuccess(ResponseInfo resultInsertBean){
        resultInsertBean.setCode(Constant.SUCCESSCODE);
        resultInsertBean.setTime(System.currentTimeMillis());
        resultInsertBean.setMsg(Constant.RESPONSESUCCESS);
        resultInsertBean.setData(new DataBean(""));
    }
    public static void ResponseInsertError(ResponseInfo resultInsertBean){
        resultInsertBean.setCode(Constant.ERRORCODE);
        resultInsertBean.setTime(System.currentTimeMillis());
        resultInsertBean.setMsg(Constant.RESPONSEERROR);
        resultInsertBean.setData(new DataBean(""));
    }
    public static void ResponseInsertQuestException(ResponseInfo resultInsertBean, Exception e){
        resultInsertBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultInsertBean.setTime(System.currentTimeMillis());
        resultInsertBean.setMsg(e.getMessage());
        resultInsertBean.setData(new DataBean(""));
    }

    public static void Response_Basic_Information_Of_Equipment_Success(Basic_Information_Of_Equipment_Result resultBean, List<Basic_Information_Of_Equipment> infoBean){
        resultBean.setCode(Constant.SUCCESSCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSESUCCESS);
        resultBean.setData(infoBean);
    }

    public static void Response_Game_Information_Statistics_Success(Game_Information_Statistics_Result resultBean, List<Game_Information_Statistics> infoBean){
        resultBean.setCode(Constant.SUCCESSCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSESUCCESS);
        resultBean.setData(infoBean);
    }

    public static void Response_Abnormal_Information_Statistics_Success(Abnormal_Information_Statistics_Result resultBean, List<Abnormal_Information_Statistics> infoBean){
        resultBean.setCode(Constant.SUCCESSCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSESUCCESS);
        resultBean.setData(infoBean);
    }
    public static void Response_Exception_Information_List_Success(Exception_Information_List_Result resultBean, List<Exception_Information_List> infoBean){
        resultBean.setCode(Constant.SUCCESSCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSESUCCESS);
        resultBean.setData(infoBean);
    }

    public static void Response_Basic_Information_Of_Equipment_Error(Basic_Information_Of_Equipment_Result resultBean){
        resultBean.setCode(Constant.ERRORCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSEERROR);
        resultBean.setData(null);
    }
    public static void Response_Game_Information_Statistics_Error(Game_Information_Statistics_Result resultBean){
        resultBean.setCode(Constant.ERRORCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSEERROR);
        resultBean.setData(null);
    }

    public static void Response_Abnormal_Information_Statistics_Error(Abnormal_Information_Statistics_Result resultBean){
        resultBean.setCode(Constant.ERRORCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSEERROR);
        resultBean.setData(null);
    }
    public static void Response_Exception_Information_List_Error(Exception_Information_List_Result resultBean){
        resultBean.setCode(Constant.ERRORCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(Constant.RESPONSEERROR);
        resultBean.setData(null);
    }
    public static void Response_Basic_Information_Of_Equipment_QuestException(Basic_Information_Of_Equipment_Result resultBean, Exception e){
        resultBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(e.getMessage());
        resultBean.setData(null);
    }
    public static void Response_Game_Information_Statistics_QuestException(Game_Information_Statistics_Result resultBean, Exception e){
        resultBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(e.getMessage());
        resultBean.setData(null);
    }

    public static void Response_Abnormal_Information_Statistics_QuestException(Abnormal_Information_Statistics_Result resultBean, Exception e){
        resultBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(e.getMessage());
        resultBean.setData(null);
    }
    public static void Response_Exception_Information_List_QuestException(Exception_Information_List_Result resultBean, Exception e){
        resultBean.setCode(Constant.REQUESTEXCEPTIONCODE);
        resultBean.setTime(System.currentTimeMillis());
        resultBean.setMsg(e.getMessage());
        resultBean.setData(null);
    }
}
