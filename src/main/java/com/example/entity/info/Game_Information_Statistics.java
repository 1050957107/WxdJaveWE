package com.example.entity.info;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Game_Information_Statistics {
    //    游戏名称                  game_name
    //    设备ID                   device_id
    //    设备所在的位置             location_of_the_device
    //    游戏运行次数（次）/天       game_runs_day
    //    游戏运行次数（次）/周       game_runs_week
    //    游戏运行次数（次）/月       game_runs_month
    //    游戏运行次数（次）/年       game_runs_year
    //    游戏运行时长(h)/天         game_run_time_day
    //    游戏运行时长（h）/周        game_run_time_week
    //    游戏运行时长（h)/月         game_run_time_month
    //    游戏运行时长（h)/年         game_run_time_year
    //    设备总运行时长（h）         total_operation_time_of_equipment

    private String game_name;
    private String device_id;
    private String game_runs_day;
    private String game_runs_week;
    private String game_runs_month;
    private String game_runs_year;
    private String game_run_time_day;
    private String game_run_time_week;
    private String game_run_time_month;
    private String game_run_time_year;
    private String total_operation_time_of_equipment;
    private String location_of_the_device;
}
