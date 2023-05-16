package com.taokoo.extension.common.eu;

/**
 * @Title YesNoEnum
 * @Author Taokoo
 * @Date 2023/1/12
 */
public enum YesNoEnum {

    /**
     * 否
     */
    NO(0, "no", "否"),
    /**
     * 是
     */
    YES(1, "yes", "是");

    private final Integer code;
    private final String name;
    private final String description;

    private YesNoEnum(Integer code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }


    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
