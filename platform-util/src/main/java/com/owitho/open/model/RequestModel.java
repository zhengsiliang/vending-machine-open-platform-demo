package com.owitho.open.model;

import com.owitho.open.util.validate.annotation.Max;
import com.owitho.open.util.validate.annotation.Min;
import com.owitho.open.util.validate.annotation.NotNull;

import java.util.List;

/**
 * @author young
 * @date 2018/5/23
 */
public class RequestModel {

    /**
     * 第三方平台appId
     */
    @NotNull
    private String appId;

    /**
     * 1000-9999内随机数
     */
    @NotNull
    @Max(9999)
    @Min(1000)
    private int salt;

    /**
     * 签名
     */
    @NotNull
    private List<String> signatures;

    /**
     * 请求时间
     */
    @NotNull
    private long utc;

    /**
     * 请求参数内容
     */
    private String data;

    public RequestModel() {
    }

    public RequestModel(String appId, int salt, List<String> signatures, long utc) {
        this.appId = appId;
        this.salt = salt;
        this.signatures = signatures;
        this.utc = utc;
    }

    public RequestModel(String appId, int salt, List<String> signatures, long utc, String data) {
        this.appId = appId;
        this.salt = salt;
        this.signatures = signatures;
        this.utc = utc;
        this.data = data;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public long getUtc() {
        return utc;
    }

    public void setUtc(long utc) {
        this.utc = utc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestModel{" +
                "appId='" + appId + '\'' +
                ", salt=" + salt +
                ", signatures=" + signatures +
                ", utc=" + utc +
                ", data='" + data + '\'' +
                '}';
    }
}
