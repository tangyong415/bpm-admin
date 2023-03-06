package com.xiaowei.bpmn.bpm.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaowei.bpmn.bpm.admin.model.BpmnFileInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 流程文件信息表 Mapper 接口
 * </p>
 *
 * @author tangyong
 * @since 2022-05-29
 */
public interface BpmnFileInfoMapper extends BaseMapper<BpmnFileInfo> {
    //通过应用id获取文件列表
    @Select("select * from bpmn_file_info where app_id = #{appId} and enabled=1")
    List<BpmnFileInfo> getFileListByAppId(String appId);
}
