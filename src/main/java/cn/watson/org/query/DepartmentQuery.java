package cn.watson.org.query;

import cn.watson.basic.util.BasicQuery;
import lombok.Data;

@Data
public class DepartmentQuery extends BasicQuery {
    private String name;
}
