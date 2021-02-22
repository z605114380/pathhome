package cn.watson.basic.util;

import jdk.nashorn.api.scripting.AbstractJSObject;
import lombok.Data;

/**
 * 增删改返回结果的封装，最终会通过SpringMVc转换为json数据放回
 */
@Data
public class AjaxResult {
    private boolean success = true;
    private String message = "操作成功!";
    //返回一些额外的数据到前台
    private Object resultObj = null;

    //成功的调用
    public AjaxResult() {
    }


    //失败的调用
    public AjaxResult(String message) {
        this.success = false;
        this.message = message;
    }


    //不需要new
    public static  AjaxResult me(){
        return new AjaxResult();
    }


    //链式编程
    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    //链式编程 设置完了吧自己返回继续设置
    public AjaxResult setMessage(String message) {
        this.success = false;
        this.message = message;
        return this;
    }


    //链式编程
    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }




}
