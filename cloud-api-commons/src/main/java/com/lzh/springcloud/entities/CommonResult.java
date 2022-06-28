package com.lzh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lvzhuanghu
 * @Description //TODO commit test
 * @PackageName com.lzh.springcloud.entities
 * @Date 2022-05-17$
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T   data; //范型数据返回

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
