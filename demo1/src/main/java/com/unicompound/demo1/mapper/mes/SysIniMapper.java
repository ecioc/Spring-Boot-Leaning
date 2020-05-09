package com.unicompound.demo1.mapper.mes;

import com.unicompound.demo1.model.SysIni;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysIniMapper {

    @Select("Select * from sys_ini")
    @Results({
            @Result(property = "sysIniSerial", column = "sys_ini_serial"),
            @Result(property = "sysIniType", column = "sys_ini_type"),
            @Result(property = "sysIniName", column = "sys_ini_name"),
            @Result(property = "sysIniInfo", column = "sys_ini_info"),
            @Result(property = "sysIniStatus", column = "sys_ini_status"),
    })
    List<SysIni> getAll();
}
