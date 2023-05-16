package com.taokoo.extension.common.page;

import java.io.Serializable;

/**
 * @Title PageRequest
 * @Author Taokoo
 * @Date 2022/11/16
 */
public class PageRequest implements Serializable {
    private static final long serialVersionUID = 3609723876492977690L;
    private Long pageNum = 1L;
    private Long pageSize = 20L;

    public PageRequest() {
    }

    public PageRequest(Long pageNum, Long pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public String toString() {
        return "PageRequest(pageNum=" + this.pageNum + ",pageSize=" + this.pageSize + ")";
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public PageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public PageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
