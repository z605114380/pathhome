package cn.watson.basic.util;

import lombok.Data;

@Data
public class BasicQuery {
    private Integer cruntPage;
    private Integer pageSize;

    public Integer getStartPage(){
        return (cruntPage - 1) * pageSize;
    }

}
