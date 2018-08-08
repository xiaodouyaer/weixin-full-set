package com.liuchaoya.common.bean;

/**
 * Created by LiuChaoya on 2018/8/2 0002 16:31.
 * email  1090969255@qq.com
 */

public class ResponseBean {

    private int resultCode;
    private String resultMsg;
    private Object data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "resultCode=" + resultCode +
                ", resultMsg='" + resultMsg + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}
