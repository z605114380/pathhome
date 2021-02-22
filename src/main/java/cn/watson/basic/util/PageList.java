package cn.watson.basic.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页数据类
 */
@Data
public class PageList<T> {
    //总数
    private Integer total = 0;
    //当前页数据
    private List<T> rows = new ArrayList<>();

    public PageList(Integer total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageList() {
    }
}
