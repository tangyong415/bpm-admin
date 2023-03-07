package com.xiaowei.bpmn.bpm.admin.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinitionSource;
import com.xiaowei.bpmn.component.controller.BpmController;
import com.xiaowei.bpmn.component.controller.BpmnController;
import com.xiaowei.bpmn.component.dto.CommonResult;
import com.xiaowei.bpmn.component.startup.BpmApproveDeploy;
import com.xiaowei.bpmn.component.startup.BpmApproveEngine;
import com.xiaowei.bpmn.component.startup.BpmnServiceDeploy;
import com.xiaowei.bpmn.mysql.database.dao.DeploymentInstanceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author a
 */

@Controller
@RequestMapping("/bpm/bpm-test")
public class BpmTestController {

    @Autowired
    DeploymentInstanceDAO deploymentInstanceDAO;

    @RequestMapping("/test")
    @ResponseBody
    public String getFileListByAppId(String appId) {
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<definitions xmlns=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" xmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\" xmlns:omgdi=\"http://www.omg.org/spec/DD/20100524/DI\" xmlns:omgdc=\"http://www.omg.org/spec/DD/20100524/DC\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xw=\"http://Xiaowei.org/schema/1.0/bpmn\" id=\"sid-38422fae-e03e-43a3-bef4-bd33b32041b2\"\n" +
                "             targetNamespace=\"http://bpmn.io/bpmn\" exporter=\"bpmn-js (https://demo.bpmn.io)\" exporterVersion=\"5.1.2\">\n" +
                "    <process id=\"Process_1\" isExecutable=\"false\">\n" +
                "        <extensionElements>\n" +
                "            <xw:inputs>\n" +
                "                <xw:input key=\"accountDto\" name=\"\" ref=\"\" value=\"\" dataType=\"Object\">\n" +
                "                    <xw:input key=\"accountNo\" name=\"\" ref=\"\" value=\"\" dataType=\"String\"></xw:input>\n" +
                "                    <xw:input key=\"accountType\" name=\"\" ref=\"\" value=\"\" dataType=\"String\"></xw:input>\n" +
                "                </xw:input>\n" +
                "                <xw:input key=\"prdList\" name=\"\" ref=\"\" value=\"\" dataType=\"Array(Object)\">\n" +
                "                    <xw:input key=\"prdCode\" name=\"\" ref=\"\" value=\"\" dataType=\"String\"></xw:input>\n" +
                "                    <xw:input key=\"prdName\" name=\"\" ref=\"\" value=\"\" dataType=\"String\"></xw:input>\n" +
                "                </xw:input>\n" +
                "                <xw:input key=\"userCode\" name=\"\" ref=\"\" value=\"\" dataType=\"String\"></xw:input>\n" +
                "                <xw:input key=\"userName\" name=\"\" ref=\"\" value=\"\" dataType=\"String\"></xw:input>\n" +
                "            </xw:inputs>\n" +
                "            <xw:outputs>\n" +
                "                <xw:output key=\"accountDtoOut\" name=\"\" ref=\"\" value=\"request.accountDto\" dataType=\"Object\">\n" +
                "                    <xw:output key=\"accountNo\" name=\"\" ref=\"\" value=\"accountNo\" dataType=\"String\"></xw:output>\n" +
                "                    <xw:output key=\"accountType\" name=\"\" ref=\"\" value=\"accountType\" dataType=\"String\"></xw:output>\n" +
                "                </xw:output>\n" +
                "                <xw:output key=\"prdListOut\" name=\"\" ref=\"\" value=\"request.prdList\" dataType=\"Array(Object)\">\n" +
                "                    <xw:output key=\"prdCodeOut\" name=\"\" ref=\"\" value=\"prdCode\" dataType=\"String\"></xw:output>\n" +
                "                    <xw:output key=\"prdNameOut\" name=\"\" ref=\"\" value=\"prdName\" dataType=\"String\"></xw:output>\n" +
                "                </xw:output>\n" +
                "                <xw:output key=\"userCodeOut\" name=\"\" ref=\"\" value=\"request.userCode\" dataType=\"String\"></xw:output>\n" +
                "                <xw:output key=\"userNameOut\" name=\"\" ref=\"\" value=\"request.userName\" dataType=\"String\"></xw:output>\n" +
                "                <xw:output key=\"var1Out\" name=\"\" ref=\"\" value=\"var1\" dataType=\"String\"></xw:output>\n" +
                "                <xw:output key=\"var2Out\" name=\"\" ref=\"\" value=\"var2\" dataType=\"String\"></xw:output>\n" +
                "                <xw:output key=\"var3Out\" name=\"\" ref=\"\" value=\"var3\" dataType=\"String\"></xw:output>\n" +
                "            </xw:outputs>\n" +
                "            <xw:vars>\n" +
                "                <xw:var key=\"var1\" name=\"\" ref=\"\" value=\"'1'\" dataType=\"String\"></xw:var>\n" +
                "                <xw:var key=\"var2\" name=\"\" ref=\"\" value=\"'2'\" dataType=\"String\"></xw:var>\n" +
                "                <xw:var key=\"var3\" name=\"\" ref=\"\" value=\"'3'\" dataType=\"String\"></xw:var>\n" +
                "            </xw:vars>\n" +
                "        </extensionElements>\n" +
                "        <xw:startEvent id=\"Event_1fhenzk\">\n" +
                "            <outgoing>Flow_1azgdi3</outgoing>\n" +
                "        </xw:startEvent>\n" +
                "        <xw:endEvent id=\"Event_0tittbt\">\n" +
                "            <incoming>Flow_0a8c91s</incoming>\n" +
                "        </xw:endEvent>\n" +
                "        <sequenceFlow id=\"Flow_1azgdi3\" sourceRef=\"Event_1fhenzk\" targetRef=\"Activity_0v37g0q\"/>\n" +
                "        <sequenceFlow id=\"Flow_0c42ze4\" sourceRef=\"Activity_0v37g0q\" targetRef=\"Event_0tittbt\"/>\n" +
                "        <xw:serviceTask id=\"Activity_0v37g0q\" name=\"测试组件\" class=\"com.xiaowei.bpmn.component.delegation.busi.TestDelegation\">\n" +
                "            <extensionElements>\n" +
                "                <xw:befores/>\n" +
                "                <xw:groups/>\n" +
                "                <xw:params>\n" +
                "                    <xw:param id=\"field1\" value=\"SS\"/>\n" +
                "                    <xw:param id=\"field1\" value=\"SS\"/>\n" +
                "                </xw:params>\n" +
                "            </extensionElements>\n" +
                "            <incoming>Flow_1azgdi3</incoming>\n" +
                "            <outgoing>Flow_0c42ze4</outgoing>\n" +
                "        </xw:serviceTask>\n" +
                "    </process>\n" +
                "</definitions>\n";
        BpmApproveDeploy.deployBpmnService(null);
        ProcessDefinitionSource processDefinitionSource = BpmApproveDeploy.bpmApproveEngine.repositoryCommandService.deployWithUTF8Content(str);
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObjectAccountDto = new JSONObject();
        jsonObjectAccountDto.put("accountNo", "3242342");
        jsonObjectAccountDto.put("accountType", "10");
        jsonObject.put("accountDto", jsonObjectAccountDto);
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < 3; i++) {
            JSONObject prdItem = new JSONObject();
            prdItem.put("prdCode", i + "");
            prdItem.put("prdName", "产品" + i);
            jsonArray.add(prdItem);
        }
        jsonObject.put("prdList", jsonArray);
        jsonObject.put("userCode", "tangyong");
        jsonObject.put("userName", "唐勇");
        BpmController bpmnController = new BpmController();
        CommonResult commonResult = bpmnController.invoke(null, jsonObject, "Process_1", "1.0.0");
        System.out.println(JSONObject.toJSON(commonResult));
        return JSONObject.toJSONString(commonResult);
    }


}
