package cn.watson.org.domain;

import lombok.Data;

/**
 * 部门domain
 */
@Data //编译时会加上
public class Department {
    private Long id;
    private String sn;
    private String name;
    private String dirPath;
    private Integer state;
    private Long manager_id;
    //关联对象
    private Employee manager;
    private Long parent_id;
    //关联对象
    private Department parent;

}
