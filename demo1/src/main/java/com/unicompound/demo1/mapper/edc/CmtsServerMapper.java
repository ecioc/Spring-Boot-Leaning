package com.unicompound.demo1.mapper.edc;

import com.unicompound.demo1.model.edc.CmtsServer;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface CmtsServerMapper {

    @Select("select * from cmts_server")
    @Results({
            @Result(property = "dbSrv", column = "dbsrv"),
            @Result(property = "aliasName", column = "alias_name"),
            @Result(property = "userName", column = "username"),
            @Result(property = "fErrPrefix", column = "FErrPrefix"),
    })
    List<CmtsServer> getAll();



}
