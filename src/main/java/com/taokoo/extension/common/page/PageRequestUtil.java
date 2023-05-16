package com.taokoo.extension.common.page;

/**
 * @Title PageRequestUtil
 * @Author Taokoo
 * @Date 2022/11/16
 */
public class PageRequestUtil {
    public PageRequestUtil() {
    }

    public static long checkPageNum(Long pageNum) {
        return pageNum != null && pageNum >= 1L ? pageNum : 1L;
    }

    public static long checkPageSize(Long pageSize) {
        return pageSize != null && pageSize >= 1L ? pageSize : 20L;
    }

    public static long checkOffset(Long offset) {
        return offset != null && offset >= 0L ? offset : 0L;
    }

    public static long toPageNum(Long offset, Long pageSize) {
        offset = checkOffset(offset);
        pageSize = checkPageSize(pageSize);
        return offset / pageSize + 1L;
    }

    public static long toOffset(Long pageNum, Long pageSize) {
        pageNum = checkOffset(pageNum);
        pageSize = checkPageSize(pageSize);
        return (pageNum - 1L) * pageSize;
    }

    public static void checkPageRequest(PageRequest pageRequest) {
        if (pageRequest != null) {
            pageRequest.setPageNum(checkPageNum(pageRequest.getPageNum()));
            pageRequest.setPageSize(checkPageSize(pageRequest.getPageSize()));
        }

    }

    public static <T> void checkWherePageRequest(WherePageRequest<T> wherePageRequest) {
        if (wherePageRequest != null) {
            wherePageRequest.setPageNum(checkPageNum(wherePageRequest.getPageNum()));
            wherePageRequest.setPageSize(checkPageSize(wherePageRequest.getPageSize()));
        }

    }

    public static PageRequest buildPageRequest(Long pageNum, Long pageSize) {
        pageNum = checkPageNum(pageNum);
        pageSize = checkPageSize(pageSize);
        return new PageRequest(pageNum, pageSize);
    }

    public static <T> WherePageRequest<T> buildWherePageRequest(Long pageNum, Long pageSize) {
        pageNum = checkPageNum(pageNum);
        pageSize = checkPageSize(pageSize);
        return new WherePageRequest(pageNum, pageSize);
    }

    public static <T> WherePageRequest<T> toWherePageRequest(PageRequest pageRequest) {
        return pageRequest == null ? null : buildWherePageRequest(pageRequest.getPageNum(), pageRequest.getPageSize());
    }

    public static <T> PageRequest toPageRequest(WherePageRequest<T> wherePageRequest) {
        return wherePageRequest == null ? null : buildPageRequest(wherePageRequest.getPageNum(), wherePageRequest.getPageSize());
    }

    public static PageRequest buildPageRequestFromOffset(Long offset, Long pageSize) {
        offset = checkOffset(offset);
        pageSize = checkPageSize(pageSize);
        long pageNum = offset / pageSize + 1L;
        return new PageRequest(pageNum, pageSize);
    }

    public static <T> WherePageRequest<T> buildWherePageRequestFromOffset(Long offset, Long pageSize) {
        offset = checkOffset(offset);
        pageSize = checkPageSize(pageSize);
        long pageNum = offset / pageSize + 1L;
        return new WherePageRequest(pageNum, pageSize);
    }
}