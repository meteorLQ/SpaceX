package com.lq.spacex.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author LQ
 */
public enum StatusCode {

	 // 启用
     VALID_IND_YES("1"),
    // 禁用
    VALID_IND_NO("0");

    private String code;

    StatusCode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
