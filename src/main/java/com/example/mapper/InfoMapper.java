package com.example.mapper;

import com.example.entity.info.Abnormal_Information_Statistics;
import com.example.entity.info.Basic_Information_Of_Equipment;
import com.example.entity.info.Exception_Information_List;
import com.example.entity.info.Game_Information_Statistics;
import com.example.entity.result.Basic_Information_Of_Equipment_Result;

import javax.swing.*;
import javax.xml.validation.Validator;
import java.util.List;

public interface InfoMapper {
    void insert_Basic_Information_Of_Equipment_Infos(Basic_Information_Of_Equipment basic_information_of_equipment);
    List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos();
    boolean delete_Basic_Information_Of_Equipment_Infos(int uid);

    void insert_Game_Information_Statistics_Infos(Game_Information_Statistics game_information_statistics);
    List<Game_Information_Statistics> get_Game_Information_Statistics_Infos();
    boolean delete_Game_Information_Statistics_Infos(int uid);

    void insert_Abnormal_Information_Statistics_Infos(Abnormal_Information_Statistics abnormal_information_statistics);
    List<Abnormal_Information_Statistics> get_Abnormal_Information_Statistics_Infos();
    boolean delete_Abnormal_Information_Statistics_Infos(int uid);

    void insert_Exception_Information_List_Infos(Exception_Information_List exception_information_list);
    List<Exception_Information_List> get_Exception_Information_List_Infos();
    boolean delete_Exception_Information_List_Infos(int uid);

    List<Exception_Information_List> get_Exception_Information_List_Infos_day();
    List<Exception_Information_List> get_Exception_Information_List_Infos_week();
    List<Exception_Information_List> get_Exception_Information_List_Infos_month();
    List<Exception_Information_List> get_Exception_Information_List_Infos_year();

    List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_day();
    List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_week();
    List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_month();
    List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_year();

    List<Basic_Information_Of_Equipment> search_get_Basic_Information_Of_Equipment_Infos(String mydevice_id);
    List<Basic_Information_Of_Equipment> search_get_Game_Information_Statistics_Infos(String mydevice_id);
    List<Basic_Information_Of_Equipment> search_get_Abnormal_Information_Statistics_Infos(String mydevice_id);
    List<Basic_Information_Of_Equipment> search_get_Exception_Information_List_Infos(String mydevice_id);

    List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_fromData(String startTime, String endTime);
    List<Exception_Information_List> get_Exception_Information_List_Infos_fromData(String startTime, String endTime);
}

