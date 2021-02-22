package cn.watson.basic.service.impl;

import cn.watson.basic.mapper.BaseMapper;
import cn.watson.basic.service.IBaseService;
import cn.watson.basic.util.PageList;
import cn.watson.org.query.DepartmentQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BaseServiceImpl <T> implements IBaseService<T> {

    @Autowired
    private BaseMapper<T>  mapper;

    @Override
    @Transactional
    public void save(T t) {
        mapper.save(t);
    }

    @Override
    @Transactional
    public void update(T t) {
        mapper.update(t);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        mapper.delete(id);
    }

    @Override
    public PageList getPageData(DepartmentQuery query) {
        Integer count = mapper.getCount(query);
        if(query.getName() != null){
            query.setName(query.getName().trim());
        }
        ArrayList<T> pageData = mapper.getPageData(query);
        return new PageList<T>(count,pageData);
    }

    @Override
    @Transactional
    public void batchRemove(List ids) {
        mapper.batchRemove(ids);
    }
}
