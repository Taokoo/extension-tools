package com.taokoo.extension.common.page;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title PageResult
 * @Author Taokoo
 * @Date 2022/11/16
 */
public class PageResult<T> {
    private long total = 0L;
    private long pageSize = 20L;
    private long pageNum = 1L;
    private List<T> rows = new ArrayList();

    public PageResult() {
    }

    public PageResult(long pageNum, long pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public PageResult(long pageNum, long pageSize, List<T> rows) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.rows = rows;
    }

    public long getPageCount() {
        long count = 0L;
        if (this.total > 0L && this.pageSize > 0L) {
            long remain = this.total % this.pageSize;
            count = (this.total - remain) / this.pageSize;
            if (remain > 0L) {
                ++count;
            }
        }

        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PageResult(pageNum=" + this.pageNum + ",pageSize=" + this.pageSize + ",total=" + this.total + ",rows=");
        if (this.rows != null && !this.rows.isEmpty()) {
            sb.append(this.rows);
        } else {
            sb.append("null");
        }

        sb.append(")");
        return sb.toString();
    }

    public long getTotal() {
        return this.total;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public long getPageNum() {
        return this.pageNum;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public PageResult<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    public PageResult<T> setPageSize(long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public PageResult<T> setPageNum(long pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public PageResult<T> setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }
}
