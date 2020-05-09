package com.unicompound.demo1.mapper.edc;

import com.unicompound.demo1.model.edc.CmtsServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CmtsServerMapperTest {

    @Autowired
    private CmtsServerMapper cmtsServerMapper;
    @Test
    void getAll() {
        List<CmtsServer> cmtsServers = cmtsServerMapper.getAll();
        if(cmtsServers==null || cmtsServers.size()==0){
            System.out.println("is null");
        }else{
            for (CmtsServer cmtsServer : cmtsServers){
                System.out.println(cmtsServer.toString());
            }
        }

    }
}