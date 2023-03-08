package com.xiaowei.bpmn.bpm.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author <a href="https://fengwenyi.com?fs=mpcg">Erwin Feng</a>
 * @since 2023-03-08
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("flow_info_history")
public class FlowInfoHistoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer id;

    @TableField("flow_code")
    private String flowCode;

    @TableField("flow_name")
    private String flowName;

    @TableField("flow_version")
    private String flowVersion;

    @TableField("flow_content")
    private String flowContent;

    @TableField("form_code")
    private String formCode;

    @TableField("type_code")
    private String typeCode;

    @TableField("sort_id")
    private Integer sortId;

    @TableField("status")
    private String status;

    @TableField("remark")
    private String remark;

    @TableField("create_date")
    private Date createDate;

    @TableField("create_by")
    private String createBy;

    @TableField("update_date")
    private Date updateDate;

    @TableField("update_by")
    private String updateBy;


}
