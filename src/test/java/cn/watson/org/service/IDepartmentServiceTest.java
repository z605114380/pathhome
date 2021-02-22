package cn.watson.org.service;

import cn.watson.org.domain.Department;
import cn.watson.org.mapper.DepartmentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IDepartmentServiceTest extends BaseTest {
    @Autowired
    IDepartmentService service;
    @Autowired
    DepartmentMapper mapper;

    @Test
    public void save() {
        Department byId = mapper.getById(45L);
        service.save(byId);
    }

    @Test
    public void update() {
        Department byId = mapper.getById(45L);
        byId.setName("部门-测试");
        byId.setId(46L);
        service.update(byId);
    }

    @Test
    public void delete() {
    }

    @Test
    public void getPageData() {

    }
}