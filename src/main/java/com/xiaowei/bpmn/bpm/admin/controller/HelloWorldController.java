package com.xiaowei.bpmn.bpm.admin.controller;

import com.xiaowei.bpmn.bpm.admin.common.CommonResult;
import com.xiaowei.bpmn.mysql.database.dao.DeploymentInstanceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author a
 */

@Controller
@RequestMapping("/bpm/bpm-hellow-world")
public class HelloWorldController {

    @Autowired
    DeploymentInstanceDAO deploymentInstanceDAO;

    @RequestMapping("/helloworld")
    @ResponseBody
    public String getFileListByAppId(String appId) {
        deploymentInstanceDAO.findOne(1000L);
        return "Hello World";
    }


}
