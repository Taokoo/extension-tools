package com.taokoo.extension.common.page;

/**
 * @Title WherePageRequest
 * @Author Taokoo
 * @Date 2022/11/16
 */
public class WherePageRequest<T> {
    private Long pageNum = 1L;
    private Long pageSize = 20L;
    private T where;

    public WherePageRequest() {
    }

    public WherePageRequest(Long pageNum, Long pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public WherePageRequest(Long pageNum, Long pageSize, T where) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.where = where;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WherePageRequest(pageNum=" + this.pageNum + ",pageSize=" + this.pageSize + ",where=");
        if (this.where == null) {
            sb.append("null");
        } else {
            sb.append(this.where);
        }

        sb.append(")");
        return sb.toString();
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public T getWhere() {
        return this.where;
    }

    public WherePageRequest<T> setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public WherePageRequest<T> setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public WherePageRequest<T> setWhere(T where) {
        this.where = where;
        return this;
    }
}
