package cn.watson.org.service.impl;

import cn.watson.basic.service.impl.BaseServiceImpl;
import cn.watson.org.domain.Employee;
import cn.watson.org.service.IEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {

}
