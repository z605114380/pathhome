package cn.watson.org.controller;

import cn.watson.basic.util.AjaxResult;
import cn.watson.basic.util.PageList;
import cn.watson.org.domain.Department;
import cn.watson.org.query.DepartmentQuery;
import cn.watson.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")

public class DepartmentController {
    @Autowired
    private IDepartmentService service;

    /**
     * 保存数据
     * @param department
     * @return
     */
    @PutMapping
    public AjaxResult save(@RequestBody Department department){
        try {
            if(department.getId() != null){
                service.save(department);
            }else {
                service.update(department);
            }
            return AjaxResult.me().setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败"+e.getMessage());
        }
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @DeleteMapping("/id")
    public AjaxResult del(@PathVariable("id") Long id){
        try {
            service.delete(id);
            return AjaxResult.me().setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败"+e.getMessage());
        }
    }

    /**
     * 获取列表数据
     * @param query
     * @return
     */
    @PostMapping
    public PageList<Department> getPageList(@RequestBody DepartmentQuery query){
        return service.getPageData(query);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @PatchMapping
    public AjaxResult batchRemove(@RequestBody List<Long> ids){
        try {
            service.batchRemove(ids);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("服务器繁忙,请稍后重试"+e.getMessage());
        }
    }
}
