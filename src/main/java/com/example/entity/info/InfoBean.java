package com.example.entity.info;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoBean {
    //    游戏名称                  game_name
    //    设备编号                  equipment_number
    //    设备所在位置            location_of_equipment
    //    游戏运行次数（次）   game_running_times
    //    游戏运行时长(h)         running_times
    //    是否属于市场受欢迎的游戏     popular_game
    //    硬件原因游戏异常退出的报错信息及时间 error_hardware_reasons
    //    游戏自身原因游戏异常退出的报错信息及时间  error_game_itself
    private int id;
    private String game_name;
    private String equipment_number;
    private String location_of_equipment;
}
