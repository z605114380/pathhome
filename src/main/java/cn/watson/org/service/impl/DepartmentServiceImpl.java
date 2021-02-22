package cn.watson.org.service.impl;

import cn.watson.basic.service.impl.BaseServiceImpl;
import cn.watson.basic.util.PageList;
import cn.watson.org.domain.Department;
import cn.watson.org.mapper.DepartmentMapper;
import cn.watson.org.query.DepartmentQuery;
import cn.watson.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements IDepartmentService {

}
