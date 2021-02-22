package cn.watson.org.controller;

import cn.watson.basic.util.AjaxResult;
import cn.watson.org.domain.Employee;
import cn.watson.org.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService service;

    /**
     * 保存数据
     * @param employee
     * @return
     */
    @PutMapping
    public AjaxResult save(@RequestBody Employee employee){
        try {
            if(employee.getId() != null){
                service.save(employee);
            }else {
                service.update(employee);
            }
            return AjaxResult.me().setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败"+e.getMessage());
        }
    }


}
