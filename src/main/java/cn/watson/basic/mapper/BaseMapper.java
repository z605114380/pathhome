package cn.watson.basic.mapper;

import cn.watson.org.domain.Department;
import cn.watson.org.query.DepartmentQuery;

import java.util.ArrayList;
import java.util.List;

public interface BaseMapper <T> {
    /**
     * 保存数据
     * @param t
     * @return
     */
    Integer save(T t);

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
     * 查询所有数据
     * @return
     */
    ArrayList<T> show();

    /**
     * 根据id获取数据
     * @param id
     * @return
     */
    Department getById(Long id);

    /**
     * 获取分页数据
     * @param query
     * @return
     */
    ArrayList<T> getPageData(DepartmentQuery query);

    /**
     * 获取总条数
     * @param query
     * @return
     */
    Integer getCount(DepartmentQuery query);

    /**
     * 批量删除
     * @param ids
     */
    void batchRemove(List ids);
}
