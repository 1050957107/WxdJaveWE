package com.example.serviceImpl;

import com.example.entity.info.Abnormal_Information_Statistics;
import com.example.entity.info.Exception_Information_List;
import com.example.entity.info.Game_Information_Statistics;
import com.example.entity.result.Basic_Information_Of_Equipment_Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.info.Basic_Information_Of_Equipment;
import com.example.mapper.InfoMapper;
import com.example.service.InfoService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InfoServiceImpl implements InfoService{

	@Autowired
    InfoMapper infoMapper;
    public void insert_Basic_Information_Of_Equipment_Infos(Basic_Information_Of_Equipment basic_information_of_equipment){
        infoMapper.insert_Basic_Information_Of_Equipment_Infos(basic_information_of_equipment);
    }

    @Override
    public List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos() {
        return infoMapper.get_Basic_Information_Of_Equipment_Infos();
    }

    @Override
    public boolean delete_Basic_Information_Of_Equipment_Infos(int uid) {
        return infoMapper.delete_Basic_Information_Of_Equipment_Infos(uid);
    }

    @Override
    public void insert_Game_Information_Statistics_Infos(Game_Information_Statistics game_information_statistics) {
        infoMapper.insert_Game_Information_Statistics_Infos(game_information_statistics);
    }

    @Override
    public List<Game_Information_Statistics> get_Game_Information_Statistics_Infos() {
        return infoMapper.get_Game_Information_Statistics_Infos();
    }

    @Override
    public boolean delete_Game_Information_Statistics_Infos(int uid) {
        return infoMapper.delete_Game_Information_Statistics_Infos(uid);
    }

    @Override
    public void insert_Abnormal_Information_Statistics_Infos(Abnormal_Information_Statistics abnormal_information_statistics) {
        infoMapper.insert_Abnormal_Information_Statistics_Infos(abnormal_information_statistics);
    }

    @Override
    public List<Abnormal_Information_Statistics> get_Abnormal_Information_Statistics_Infos() {
        return infoMapper.get_Abnormal_Information_Statistics_Infos();
    }

    @Override
    public boolean delete_Abnormal_Information_Statistics_Infos(int uid) {
        return infoMapper.delete_Abnormal_Information_Statistics_Infos(uid);
    }

    @Override
    public void insert_Exception_Information_List_Infos(Exception_Information_List exception_information_list) {
        infoMapper.insert_Exception_Information_List_Infos(exception_information_list);
    }

    @Override
    public List<Exception_Information_List> get_Exception_Information_List_Infos() {
        return infoMapper.get_Exception_Information_List_Infos();
    }

    @Override
    public boolean delete_Exception_Information_List_Infos(int uid) {
        return infoMapper.delete_Exception_Information_List_Infos(uid);
    }

    @Override
    public List<Exception_Information_List> get_Exception_Information_List_Infos_day() {
        return infoMapper.get_Exception_Information_List_Infos_day();
    }

    @Override
    public List<Exception_Information_List> get_Exception_Information_List_Infos_week() {
        return infoMapper.get_Exception_Information_List_Infos_week();
    }

    @Override
    public List<Exception_Information_List> get_Exception_Information_List_Infos_month() {
        return infoMapper.get_Exception_Information_List_Infos_month();
    }

    @Override
    public List<Exception_Information_List> get_Exception_Information_List_Infos_year() {
        return infoMapper.get_Exception_Information_List_Infos_year();
    }

    @Override
    public List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_day() {
        return infoMapper.get_Basic_Information_Of_Equipment_Infos_day();
    }

    @Override
    public List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_week() {
        return infoMapper.get_Basic_Information_Of_Equipment_Infos_week();
    }

    @Override
    public List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_month() {
        return infoMapper.get_Basic_Information_Of_Equipment_Infos_month();
    }

    @Override
    public List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_year() {
        return infoMapper.get_Basic_Information_Of_Equipment_Infos_year();
    }

    @Override
    public List<Basic_Information_Of_Equipment> search_get_Basic_Information_Of_Equipment_Infos(String mydevice_id) {
        return infoMapper.search_get_Basic_Information_Of_Equipment_Infos(mydevice_id);
    }

    @Override
    public List<Basic_Information_Of_Equipment> search_get_Game_Information_Statistics_Infos(String mydevice_id) {
        return infoMapper.search_get_Game_Information_Statistics_Infos(mydevice_id);
    }

    @Override
    public List<Basic_Information_Of_Equipment> search_get_Abnormal_Information_Statistics_Infos(String mydevice_id) {
        return infoMapper.search_get_Abnormal_Information_Statistics_Infos(mydevice_id);
    }

    @Override
    public List<Basic_Information_Of_Equipment> search_get_Exception_Information_List_Infos(String mydevice_id) {
        return infoMapper.search_get_Exception_Information_List_Infos(mydevice_id);
    }

    @Override
    public List<Basic_Information_Of_Equipment> get_Basic_Information_Of_Equipment_Infos_fromData(String startTime, String endTime) {
        return infoMapper.get_Basic_Information_Of_Equipment_Infos_fromData(startTime,endTime);
    }

    @Override
    public List<Exception_Information_List> get_Exception_Information_List_Infos_fromData(String startTime, String endTime) {
        return infoMapper.get_Exception_Information_List_Infos_fromData(startTime,endTime);
    }
}
