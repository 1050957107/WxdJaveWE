package com.example.entity.result;


import com.example.entity.info.Game_Information_Statistics;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Game_Information_Statistics_Result {
    String code;
    long time;
    List<Game_Information_Statistics> data;
    String msg;
}
