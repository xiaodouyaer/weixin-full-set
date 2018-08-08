package com.liuchaoya.common.utils;

import com.liuchaoya.common.bean.ResponseBean;
import com.liuchaoya.common.type.ResultCode;

/**
 * Created by LiuChaoya on 2018/8/2 0002 16:58.
 * email  1090969255@qq.com
 */

public class HttpResult {

    public static ResponseBean result(ResultCode resultCode) {
        return HttpResult.result(resultCode, null);
    }

    public static ResponseBean result(ResultCode resultCode, String resultMsg) {
        return HttpResult.result(resultCode, resultMsg, null);
    }

    public static ResponseBean result(ResultCode resultCode, Object data) {
        return HttpResult.result(resultCode, resultCode == ResultCode.SUCCESS ? "操作成功" : "操作失败", data);
    }

    public static ResponseBean result(ResultCode resultCode, String resultMsg, Object data) {
        ResponseBean bean = new ResponseBean();
        bean.setResultCode(resultCode.getCode());
        bean.setResultMsg(resultMsg);
        bean.setData(data);
        return bean;
    }
}
