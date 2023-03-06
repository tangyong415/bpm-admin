package com.xiaowei.bpmn.bpm.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 应用信息表
 * </p>
 *
 * @author tangyong
 * @since 2022-05-29
 */
@Data
@TableName("bpmn_app_info")
public class BpmnAppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long appId;

    private String appName;

    private String appDesc;

    private String appAvatarPath;

    private String appRespPerson;

    private String appDevPerson;

    private String appTestPerson;

    private String appPrdPerson;

    private String appGitAddress;

    private String appType;

    private Integer enabled;

    private String createBy;

    private String updateBy;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "BpmnAppInfo{" +
            "id=" + id +
            ", appId=" + appId +
            ", appName=" + appName +
            ", appDesc=" + appDesc +
            ", appAvatarPath=" + appAvatarPath +
            ", appRespPerson=" + appRespPerson +
            ", appDevPerson=" + appDevPerson +
            ", appTestPerson=" + appTestPerson +
            ", appPrdPerson=" + appPrdPerson +
            ", enabled=" + enabled +
            ", createBy=" + createBy +
            ", updateBy=" + updateBy +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
