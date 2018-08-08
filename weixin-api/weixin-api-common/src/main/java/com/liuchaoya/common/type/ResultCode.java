package com.liuchaoya.common.type;

/**
 * Created by LiuChaoya on 2018/8/2 0002 17:15.
 * email  1090969255@qq.com
 */

public enum ResultCode {
    SUCCESS(0),FAILURE(1);

    private int code;
    ResultCode(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
