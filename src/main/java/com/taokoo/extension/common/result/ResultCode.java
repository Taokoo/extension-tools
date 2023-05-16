package com.taokoo.extension.common.result;

import java.io.Serializable;

/**
 * @Title ResultCode
 * @Author Taokoo
 * @Date 2022/11/16
 */
public interface ResultCode extends Serializable {
    String getCode();

    String getMessage();
}
