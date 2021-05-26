package com.example.controller;


import com.example.entity.info.Abnormal_Information_Statistics;
import com.example.entity.info.Exception_Information_List;
import com.example.entity.info.Game_Information_Statistics;
import com.example.entity.result.*;
import com.example.weight.Constant;
import com.example.entity.info.Basic_Information_Of_Equipment;
import com.example.service.InfoService;
import com.example.weight.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//http://localhost:8090
@RestController
@RequestMapping("/data")
public class WxdContotller {
    String pattern = "yyyy-MM-dd HH:mm:ss";
    @Autowired
    InfoService infoService;


    @RequestMapping(value = "/insert_Basic_Information_Of_Equipment_Infos", method = RequestMethod.POST)
    public ResponseInfo Basic_Information_Of_Equipment(@RequestParam HashMap<String, Object> data) {
        ResponseInfo resultInsertBean = new ResponseInfo();
        try {
            if (data.size()!=0) {
                infoService.insert_Basic_Information_Of_Equipment_Infos(insert_Basic_Information_Of_Equipment_Infos(data));
                ResultUtils.ResponseInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponseInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.ResponseInsertQuestException(resultInsertBean,e);
        }
        return resultInsertBean;
    }

    public Basic_Information_Of_Equipment insert_Basic_Information_Of_Equipment_Infos(HashMap<String ,Object> data){
        Basic_Information_Of_Equipment basic_information_of_equipment = new Basic_Information_Of_Equipment();
        basic_information_of_equipment.setSerial_number((String) data.get("serial_number"));
        basic_information_of_equipment.setDevice_id((String) data.get("device_id"));
        basic_information_of_equipment.setLocation_of_the_device((String) data.get("location_of_the_device"));
        basic_information_of_equipment.setDevice_start_date((String) data.get("device_start_date"));
        basic_information_of_equipment.setDevice_shutdown_date((String) data.get("device_shutdown_date"));
        basic_information_of_equipment.setDevice_activation_time((String) data.get("device_activation_time"));
        basic_information_of_equipment.setCreate_time(convertTimestamp2Date(System.currentTimeMillis(),pattern));
        return basic_information_of_equipment;
    }

    @RequestMapping(value = "/insert_Game_Information_Statistics_Infos", method = RequestMethod.POST)
    public ResponseInfo Game_Information_Statistics(@RequestParam HashMap<String, Object> data) {
        ResponseInfo resultInsertBean = new ResponseInfo();
        try {
            if (data.size()!=0) {
                infoService.insert_Game_Information_Statistics_Infos(insert_Game_Information_Statistics_Infos(data));
                ResultUtils.ResponseInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponseInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.ResponseInsertQuestException(resultInsertBean,e);
        }
        return resultInsertBean;
    }

    public Game_Information_Statistics insert_Game_Information_Statistics_Infos(HashMap<String ,Object> data){
        Game_Information_Statistics game_information_statistics = new Game_Information_Statistics();
        game_information_statistics.setGame_name((String) data.get("serial_number"));
        game_information_statistics.setDevice_id((String) data.get("device_id"));
        game_information_statistics.setLocation_of_the_device((String) data.get("location_of_the_device"));
        game_information_statistics.setGame_runs_day((String) data.get("game_runs_day"));
        game_information_statistics.setGame_runs_week((String) data.get("game_runs_week"));
        game_information_statistics.setGame_runs_month((String) data.get("game_runs_month"));
        game_information_statistics.setGame_runs_year((String) data.get("game_runs_year"));
        game_information_statistics.setGame_run_time_day((String) data.get("game_run_time_day"));
        game_information_statistics.setGame_run_time_week((String) data.get("game_run_time_week"));
        game_information_statistics.setGame_run_time_month((String) data.get("game_run_time_month"));
        game_information_statistics.setGame_run_time_year((String) data.get("game_run_time_year"));
        game_information_statistics.setTotal_operation_time_of_equipment((String) data.get("total_operation_time_of_equipment"));
        return game_information_statistics;
    }

    @RequestMapping(value = "/insert_Abnormal_Information_Statistics_Infos", method = RequestMethod.POST)
    public ResponseInfo Abnormal_Information_Statistics(@RequestParam HashMap<String, Object> data) {
        ResponseInfo resultInsertBean = new ResponseInfo();
        try {
            if (data.size()!=0) {
                infoService.insert_Abnormal_Information_Statistics_Infos(insert_Abnormal_Information_Statistics_Infos(data));
                ResultUtils.ResponseInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponseInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.ResponseInsertQuestException(resultInsertBean,e);
        }
        return resultInsertBean;
    }

    public Abnormal_Information_Statistics insert_Abnormal_Information_Statistics_Infos(HashMap<String ,Object> data){
        Abnormal_Information_Statistics abnormal_information_statistics = new Abnormal_Information_Statistics();
        abnormal_information_statistics.setDevice_id((String) data.get("device_id"));
        abnormal_information_statistics.setLocation_of_the_device((String) data.get("location_of_the_device"));
        abnormal_information_statistics.setNumber_of_abnormal_interruptions_day((String) data.get("number_of_abnormal_interruptions_day"));
        abnormal_information_statistics.setNumber_of_abnormal_interruptions_week((String) data.get("number_of_abnormal_interruptions_week"));
        abnormal_information_statistics.setNumber_of_abnormal_interruptions_month((String) data.get("number_of_abnormal_interruptions_month"));
        abnormal_information_statistics.setNumber_of_abnormal_interruptions_year((String) data.get("number_of_abnormal_interruptions_year"));
        abnormal_information_statistics.setAbnormal_exit_times_day((String) data.get("abnormal_exit_times_day"));
        abnormal_information_statistics.setAbnormal_exit_times_week((String) data.get("abnormal_exit_times_week"));
        abnormal_information_statistics.setAbnormal_exit_times_month((String) data.get("abnormal_exit_times_month"));
        abnormal_information_statistics.setAbnormal_exit_times_year((String) data.get("abnormal_exit_times_year"));
        return abnormal_information_statistics;
    }

    @RequestMapping(value = "/insert_Exception_Information_List_Infos", method = RequestMethod.POST)
    public ResponseInfo Exception_Information_List(@RequestParam HashMap<String, Object> data) {
        ResponseInfo resultInsertBean = new ResponseInfo();
        try {
            if (data.size()!=0) {
                infoService.insert_Exception_Information_List_Infos(insert_Exception_Information_List_Infos(data));
                ResultUtils.ResponseInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponseInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.ResponseInsertQuestException(resultInsertBean,e);
        }
        return resultInsertBean;
    }

    public Exception_Information_List insert_Exception_Information_List_Infos(HashMap<String ,Object> data){
        Exception_Information_List exception_information_list = new Exception_Information_List();
        exception_information_list.setDevice_id((String) data.get("device_id"));
        exception_information_list.setLocation_of_the_device((String) data.get("location_of_the_device"));
        exception_information_list.setInformation_feedback_after_pad_device_failure((String) data.get("information_feedback_after_pad_device_failure"));
        exception_information_list.setFeedback_of_information_after_the_failure_of_smp((String) data.get("feedback_of_information_after_the_failure_of_smp"));
        exception_information_list.setDevice_shutdown_information_feedback_after_failure_window((String) data.get("device_shutdown_information_feedback_after_failure_window"));
        exception_information_list.setCreate_time(convertTimestamp2Date(System.currentTimeMillis(),pattern));
        return exception_information_list;
    }

    @RequestMapping(value = "/delete_Basic_Information_Of_Equipment_Infos",method = RequestMethod.POST)
    public ResponseInfo delete_Basic_Information_Of_Equipment_Infos(@RequestParam int uid){
        ResponseInfo resultInsertBean = new ResponseInfo();
        try {
            boolean isTrue = infoService.delete_Basic_Information_Of_Equipment_Infos(uid);
            if (isTrue){
                ResultUtils.ResponseInsertSuccess(resultInsertBean);
            }else {
                ResultUtils.ResponseInsertError(resultInsertBean);
            }
        } catch (Exception e) {
            ResultUtils.ResponseInsertQuestException(resultInsertBean,e);
            e.printStackTrace();
        }
        return resultInsertBean;
    }

    @RequestMapping(value = "/get_Basic_Information_Of_Equipment_Infos", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Basic_Information_Of_Equipment_Infos() {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = get_Basic_Information_Of_Equipment_Infos();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result get_Basic_Information_Of_Equipment_Infos(){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.get_Basic_Information_Of_Equipment_Infos();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Basic_Information_Of_Equipment_Infos_fromData", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, Object> Basic_Information_Of_Equipment_Infos_Data(@RequestParam String startTime,@RequestParam String endTime) {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = get_Basic_Information_Of_Equipment_Infos_fromData(startTime,endTime);
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result get_Basic_Information_Of_Equipment_Infos_fromData(String startTime,String endTime){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.get_Basic_Information_Of_Equipment_Infos_fromData(startTime, endTime);
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/search_get_Basic_Information_Of_Equipment_Infos", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, Object> search_Basic_Information_Of_Equipment(@RequestParam String mydevice_id) {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = search_get_Basic_Information_Of_Equipment_Infos(mydevice_id);
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result search_get_Basic_Information_Of_Equipment_Infos(String mydevice_id){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.search_get_Basic_Information_Of_Equipment_Infos(mydevice_id);
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Basic_Information_Of_Equipment_Infos_day", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Basic_Information_Of_Equipment_Infos_Day() {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = get_Basic_Information_Of_Equipment_Infos_day();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result get_Basic_Information_Of_Equipment_Infos_day(){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.get_Basic_Information_Of_Equipment_Infos_day();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Basic_Information_Of_Equipment_Infos_week", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Basic_Information_Of_Equipment_Infos_Week() {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = get_Basic_Information_Of_Equipment_Infos_week();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result get_Basic_Information_Of_Equipment_Infos_week(){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.get_Basic_Information_Of_Equipment_Infos_week();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Basic_Information_Of_Equipment_Infos_month", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Basic_Information_Of_Equipment_Infos_Month() {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = get_Basic_Information_Of_Equipment_Infos_month();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result get_Basic_Information_Of_Equipment_Infos_month(){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.get_Basic_Information_Of_Equipment_Infos_month();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Basic_Information_Of_Equipment_Infos_year", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Basic_Information_Of_Equipment_Infos_Year() {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = get_Basic_Information_Of_Equipment_Infos_year();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result get_Basic_Information_Of_Equipment_Infos_year(){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.get_Basic_Information_Of_Equipment_Infos_year();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Game_Information_Statistics_Infos", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Game_Information_Statistics_Infos() {
        Map<String, Object> map = new HashMap<>();
        Game_Information_Statistics_Result resultBean = get_Game_Information_Statistics_Infos();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Game_Information_Statistics_Result get_Game_Information_Statistics_Infos(){
        Game_Information_Statistics_Result resultBean = new Game_Information_Statistics_Result();
        try {
            List<Game_Information_Statistics> infoBeanList = infoService.get_Game_Information_Statistics_Infos();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Game_Information_Statistics_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Game_Information_Statistics_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Game_Information_Statistics_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/search_get_Game_Information_Statistics_Infos", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, Object> search_get_Game_Information_Statistics(@RequestParam String mydevice_id) {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = search_get_Game_Information_Statistics_Infos(mydevice_id);
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result search_get_Game_Information_Statistics_Infos(String mydevice_id){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.search_get_Game_Information_Statistics_Infos(mydevice_id);
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Abnormal_Information_Statistics_Infos", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Abnormal_Information_Statistics_Infos() {
        Map<String, Object> map = new HashMap<>();
        Abnormal_Information_Statistics_Result resultBean = get_Abnormal_Information_Statistics_Infos();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Abnormal_Information_Statistics_Result get_Abnormal_Information_Statistics_Infos(){
        Abnormal_Information_Statistics_Result resultBean = new Abnormal_Information_Statistics_Result();
        try {
            List<Abnormal_Information_Statistics> infoBeanList = infoService.get_Abnormal_Information_Statistics_Infos();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Abnormal_Information_Statistics_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Abnormal_Information_Statistics_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Abnormal_Information_Statistics_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/search_get_Abnormal_Information_Statistics_Infos", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, Object> search_Abnormal_Information_Statistics(@RequestParam String mydevice_id) {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = search_get_Abnormal_Information_Statistics_Infos(mydevice_id);
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result search_get_Abnormal_Information_Statistics_Infos(String mydevice_id){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.search_get_Abnormal_Information_Statistics_Infos(mydevice_id);
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Exception_Information_List_Infos", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> Exception_Information_List() {
        Map<String, Object> map = new HashMap<>();
        Exception_Information_List_Result resultBean = get_Exception_Information_List_Infos();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Exception_Information_List_Result get_Exception_Information_List_Infos(){
        Exception_Information_List_Result resultBean = new Exception_Information_List_Result();
        try {
            List<Exception_Information_List> infoBeanList = infoService.get_Exception_Information_List_Infos();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Exception_Information_List_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Exception_Information_List_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Exception_Information_List_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Exception_Information_List_Infos_fromData", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, Object> Exception_Information_List_Infos_fromData(@RequestParam String startTime,@RequestParam String endTime) {
        Map<String, Object> map = new HashMap<>();
        Exception_Information_List_Result resultBean = get_Exception_Information_List_Infos_fromData(startTime,endTime);
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Exception_Information_List_Result get_Exception_Information_List_Infos_fromData(String startTime,String endTime){
        Exception_Information_List_Result resultBean = new Exception_Information_List_Result();
        try {
            List<Exception_Information_List> infoBeanList = infoService.get_Exception_Information_List_Infos_fromData(startTime, endTime);
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Exception_Information_List_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Exception_Information_List_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Exception_Information_List_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/search_get_Exception_Information_List_Infos", method = RequestMethod.POST)
    @CrossOrigin
    public Map<String, Object> search_Exception_Information_List(@RequestParam String mydevice_id) {
        Map<String, Object> map = new HashMap<>();
        Basic_Information_Of_Equipment_Result resultBean = search_get_Exception_Information_List_Infos(mydevice_id);
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Basic_Information_Of_Equipment_Result search_get_Exception_Information_List_Infos(String mydevice_id){
        Basic_Information_Of_Equipment_Result resultBean = new Basic_Information_Of_Equipment_Result();
        try {
            List<Basic_Information_Of_Equipment> infoBeanList = infoService.search_get_Exception_Information_List_Infos(mydevice_id);
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Basic_Information_Of_Equipment_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Basic_Information_Of_Equipment_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Basic_Information_Of_Equipment_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Exception_Information_List_Infos_day", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> get_Exception_Information_List_Day() {
        Map<String, Object> map = new HashMap<>();
        Exception_Information_List_Result resultBean = get_Exception_Information_List_Infos_day();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Exception_Information_List_Result get_Exception_Information_List_Infos_day(){
        Exception_Information_List_Result resultBean = new Exception_Information_List_Result();
        try {
            List<Exception_Information_List> infoBeanList = infoService.get_Exception_Information_List_Infos_day();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Exception_Information_List_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Exception_Information_List_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Exception_Information_List_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Exception_Information_List_Infos_week", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> get_Exception_Information_List_Week() {
        Map<String, Object> map = new HashMap<>();
        Exception_Information_List_Result resultBean = get_Exception_Information_List_Infos_week();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Exception_Information_List_Result get_Exception_Information_List_Infos_week(){
        Exception_Information_List_Result resultBean = new Exception_Information_List_Result();
        try {
            List<Exception_Information_List> infoBeanList = infoService.get_Exception_Information_List_Infos_week();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Exception_Information_List_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Exception_Information_List_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Exception_Information_List_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Exception_Information_List_Infos_month", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> get_Exception_Information_List_Year() {
        Map<String, Object> map = new HashMap<>();
        Exception_Information_List_Result resultBean = get_Exception_Information_List_Infos_month();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Exception_Information_List_Result get_Exception_Information_List_Infos_month(){
        Exception_Information_List_Result resultBean = new Exception_Information_List_Result();
        try {
            List<Exception_Information_List> infoBeanList = infoService.get_Exception_Information_List_Infos_month();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Exception_Information_List_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Exception_Information_List_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Exception_Information_List_QuestException(resultBean,e);
        }
        return resultBean;
    }

    @RequestMapping(value = "/get_Exception_Information_List_Infos_year", method = RequestMethod.GET)
    @CrossOrigin
    public Map<String, Object> get_Exception_Information_List_Month() {
        Map<String, Object> map = new HashMap<>();
        Exception_Information_List_Result resultBean = get_Exception_Information_List_Infos_year();
        map.put(Constant.CODE,resultBean.getCode());
        map.put(Constant.TIME,resultBean.getTime());
        map.put(Constant.MSG,resultBean.getMsg());
        map.put(Constant.DATA,resultBean.getData());
        return map;
    }

    public Exception_Information_List_Result get_Exception_Information_List_Infos_year(){
        Exception_Information_List_Result resultBean = new Exception_Information_List_Result();
        try {
            List<Exception_Information_List> infoBeanList = infoService.get_Exception_Information_List_Infos_year();
            if (infoBeanList.size()!=0){
                ResultUtils.Response_Exception_Information_List_Success(resultBean,infoBeanList);
            }else {
                ResultUtils.Response_Exception_Information_List_Error(resultBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtils.Response_Exception_Information_List_QuestException(resultBean,e);
        }
        return resultBean;
    }
    public static String convertTimestamp2Date(Long timestamp, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date(timestamp));
    }

}
