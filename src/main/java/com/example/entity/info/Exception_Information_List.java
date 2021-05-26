package com.example.entity.info;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Exception_Information_List {
    //    设备ID                    device_id
    //    设备所在的位置                    location_of_the_device
    //    pad端设备发生故障后信息反馈             information_feedback_after_pad_device_failure
    //    树莓派端设备发生故障后信息反馈               feedback_of_information_after_the_failure_of_raspberry_dispatching_equipment
    //    windows端控件引起故障后信息反馈               device_shutdown_information_feedback_after_failure_caused_by_windows_controldate
    private String device_id;
    private String location_of_the_device;
    private String information_feedback_after_pad_device_failure;
    private String feedback_of_information_after_the_failure_of_smp;
    private String device_shutdown_information_feedback_after_failure_window;
    private String create_time;
}
