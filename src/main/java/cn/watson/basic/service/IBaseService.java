package cn.watson.basic.service;

import cn.watson.basic.util.PageList;
import cn.watson.org.domain.Department;
import cn.watson.org.query.DepartmentQuery;

import java.util.List;

public interface IBaseService <T> {
    /**
     * 保存数据
     * @param t
     * @return
     */
    void save(T t);

    /**
     * 修改数据
     * @param t
     */
    void update(T t);

    /**
     * 删除数据
     * @param id
     */
    void delete(Long id);

    /**
     * 获取分页数据
     * @param query
     * @return
     */
    PageList<T> getPageData(DepartmentQuery query);

    /**
     * 批量删除
     * @param ids
     */
    void batchRemove(List<Long> ids);

}
