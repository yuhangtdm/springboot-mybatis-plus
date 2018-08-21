package com.dity.mybatisplus.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 请求日志信息表
 * </p>
 *
 * @author yuhang
 * @since 2018-08-21
 */
@TableName("t_logger_infos")
public class LoggerInfos implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ali_id", type = IdType.AUTO)
    private Integer aliId;
    /**
     * 客户端请求IP地址
     */
    @TableField("ali_client_ip")
    private String aliClientIp;
    /**
     * 日志请求地址
     */
    @TableField("ali_uri")
    private String aliUri;
    /**
     * 终端请求方式,普通请求,ajax请求
     */
    @TableField("ali_type")
    private String aliType;
    /**
     * 请求方式method,post,get等
     */
    @TableField("ali_method")
    private String aliMethod;
    /**
     * 请求参数内容,json
     */
    @TableField("ali_param_data")
    private String aliParamData;
    /**
     * 请求接口唯一session标识
     */
    @TableField("ali_session_id")
    private String aliSessionId;
    /**
     * 请求时间
     */
    @TableField("ali_time")
    private Date aliTime;
    /**
     * 接口返回时间
     */
    @TableField("ali_returm_time")
    private String aliReturmTime;
    /**
     * 接口返回数据json
     */
    @TableField("ali_return_data")
    private String aliReturnData;
    /**
     * 请求时httpStatusCode代码，如：200,400,404等
     */
    @TableField("ali_http_status_code")
    private String aliHttpStatusCode;
    /**
     * 请求耗时（毫秒单位）
     */
    @TableField("ali_time_consuming")
    private Integer aliTimeConsuming;
    @TableField("error_msg")
    private String errorMsg;


    public Integer getAliId() {
        return aliId;
    }

    public void setAliId(Integer aliId) {
        this.aliId = aliId;
    }

    public String getAliClientIp() {
        return aliClientIp;
    }

    public void setAliClientIp(String aliClientIp) {
        this.aliClientIp = aliClientIp;
    }

    public String getAliUri() {
        return aliUri;
    }

    public void setAliUri(String aliUri) {
        this.aliUri = aliUri;
    }

    public String getAliType() {
        return aliType;
    }

    public void setAliType(String aliType) {
        this.aliType = aliType;
    }

    public String getAliMethod() {
        return aliMethod;
    }

    public void setAliMethod(String aliMethod) {
        this.aliMethod = aliMethod;
    }

    public String getAliParamData() {
        return aliParamData;
    }

    public void setAliParamData(String aliParamData) {
        this.aliParamData = aliParamData;
    }

    public String getAliSessionId() {
        return aliSessionId;
    }

    public void setAliSessionId(String aliSessionId) {
        this.aliSessionId = aliSessionId;
    }

    public Date getAliTime() {
        return aliTime;
    }

    public void setAliTime(Date aliTime) {
        this.aliTime = aliTime;
    }

    public String getAliReturmTime() {
        return aliReturmTime;
    }

    public void setAliReturmTime(String aliReturmTime) {
        this.aliReturmTime = aliReturmTime;
    }

    public String getAliReturnData() {
        return aliReturnData;
    }

    public void setAliReturnData(String aliReturnData) {
        this.aliReturnData = aliReturnData;
    }

    public String getAliHttpStatusCode() {
        return aliHttpStatusCode;
    }

    public void setAliHttpStatusCode(String aliHttpStatusCode) {
        this.aliHttpStatusCode = aliHttpStatusCode;
    }

    public Integer getAliTimeConsuming() {
        return aliTimeConsuming;
    }

    public void setAliTimeConsuming(Integer aliTimeConsuming) {
        this.aliTimeConsuming = aliTimeConsuming;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "LoggerInfos{" +
        ", aliId=" + aliId +
        ", aliClientIp=" + aliClientIp +
        ", aliUri=" + aliUri +
        ", aliType=" + aliType +
        ", aliMethod=" + aliMethod +
        ", aliParamData=" + aliParamData +
        ", aliSessionId=" + aliSessionId +
        ", aliTime=" + aliTime +
        ", aliReturmTime=" + aliReturmTime +
        ", aliReturnData=" + aliReturnData +
        ", aliHttpStatusCode=" + aliHttpStatusCode +
        ", aliTimeConsuming=" + aliTimeConsuming +
        ", errorMsg=" + errorMsg +
        "}";
    }
}
