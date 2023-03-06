package com.xiaowei.bpmn.bpm.admin.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xiaowei.bpmn.bpm.admin.common.enums.GlobalErrorCodeConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 通用返回
 *
 * @author a
 * @param <T> 数据泛型
 */
@Data
public class CommonResult<T> implements Serializable {

    /**
     * 错误码
     *
     * @see #getCode()
     */
    private Integer code;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 错误提示，用户可阅读
     *
     * @see #getMsg() ()
     */
    private String msg;

    public CommonResult(){
        this.code = 000000;
        this.msg = "成功";

    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = GlobalErrorCodeConstants.SUCCESS.getCode();
        result.data = data;
        result.msg = "";
        return result;
    }

    public static boolean isSuccess(Integer code) {
        return Objects.equals(code, GlobalErrorCodeConstants.SUCCESS.getCode());
    }

    @JsonIgnore // 避免 jackson 序列化
    public boolean isSuccess() {
        return isSuccess(code);
    }

    @JsonIgnore // 避免 jackson 序列化
    public boolean isError() {
        return !isSuccess();
    }



}
