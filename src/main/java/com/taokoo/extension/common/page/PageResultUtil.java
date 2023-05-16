package com.taokoo.extension.common.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Title PageResultUtil
 * @Author Taokoo
 * @Date 2022/11/16
 */
public class PageResultUtil {
    public PageResultUtil() {
    }

    public static <T, K> PageResult<K> convert(PageResult<T> page, Function<T, K> function) {
        PageResult<K> pageResult = new PageResult();
        if (page != null) {
            pageResult.setPageNum(page.getPageNum());
            pageResult.setPageSize(page.getPageSize());
            pageResult.setTotal(page.getTotal());
            List<K> rows = (List)((List) Optional.ofNullable(page.getRows()).orElse(new ArrayList())).stream().map(function).collect(Collectors.toList());
            pageResult.setRows(rows);
        }

        return pageResult;
    }
}

