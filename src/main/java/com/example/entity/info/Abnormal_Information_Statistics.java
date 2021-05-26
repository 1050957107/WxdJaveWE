package com.example.entity.info;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Abnormal_Information_Statistics {
    //    设备ID                    device_id
    //    设备所在的位置              location_of_the_device
    //    异常中断的次数/日           number_of_abnormal_interruptions_day
    //    异常中断的次数/周           number_of_abnormal_interruptions_week
    //    异常中断的次数/月           number_of_abnormal_interruptions_month
    //    异常中断的次数/年           number_of_abnormal_interruptions_year
    //    异常退出次数/日             abnormal_exit_times_day
    //    异常退出次数/周             abnormal_exit_times_week
    //    异常退出次数/月             abnormal_exit_times_month
    //    异常退出次数/年             abnormal_exit_times_year
    private String device_id;
    private String location_of_the_device;
    private String number_of_abnormal_interruptions_day;
    private String number_of_abnormal_interruptions_week;
    private String number_of_abnormal_interruptions_month;
    private String number_of_abnormal_interruptions_year;
    private String abnormal_exit_times_day;
    private String abnormal_exit_times_week;
    private String abnormal_exit_times_month;
    private String abnormal_exit_times_year;
}
