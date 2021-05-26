package com.example.entity.info;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Basic_Information_Of_Equipment {
    //    序列号                    serial_number
    //    设备ID                    device_id
    //    设备所在的位置             location_of_the_device
    //    设备开启日期               device_start_date
    //    设备关闭日期               device_shutdown_date
    //    设备激活时间               device_activation_time
    private int id;
    private String serial_number;
    private String device_id;
    private String location_of_the_device;
    private String device_start_date;
    private String device_shutdown_date;
    private String device_activation_time;
    private String create_time;
}
