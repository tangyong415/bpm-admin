package com.xiaowei.bpmn.bpm.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 流程文件信息表
 * </p>
 *
 * @author tangyong
 * @since 2022-05-29
 */
@Data
@TableName("bpmn_file_info")
public class BpmnFileInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long parentId;

    private Long appId;

    private String isDirectory;

    private String fileType;

    private String fileName;

    private String fileVersion;

    private String fileContent;

    private String fileJsonContent;

    private String fileAvatarPath;

    private Integer enabled;

    private String createBy;

    private String updateBy;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "BpmnFileInfo{" +
            "id=" + id +
            ", parentId=" + parentId +
            ", appId=" + appId +
            ", isDirectory=" + isDirectory +
            ", fileType=" + fileType +
            ", fileName=" + fileName +
            ", fileVersion=" + fileVersion +
            ", fileContent=" + fileContent +
            ", fileJsonContent=" + fileJsonContent +
            ", fileAvatarPath=" + fileAvatarPath +
            ", enabled=" + enabled +
            ", createBy=" + createBy +
            ", updateBy=" + updateBy +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
