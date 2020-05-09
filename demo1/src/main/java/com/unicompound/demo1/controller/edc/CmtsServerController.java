package com.unicompound.demo1.controller.edc;

import com.unicompound.demo1.mapper.edc.CmtsServerMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
@Slf4j
@Api(tags = "EDC中间层连接数据库信息")
public class CmtsServerController  {

    @Autowired
    CmtsServerMapper cmtsServerMapper;

    @RequestMapping("/cmtsServers")
    @ApiOperation(value = "数据库列表", notes = "显示当前中间层所可连接的数据库", httpMethod = "GET")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
//            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
//    }
//    )
    public ModelAndView list(){
        ModelAndView view = new ModelAndView();
        view.setViewName("cmtsServer");
        view.addObject("cmtsServers", cmtsServerMapper.getAll());
        return view;
    }
}
