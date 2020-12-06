package com.itxh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description TODO
 * @Author 93524
 * @Date 2020/12/2 16:58
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//传给前端的结果
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
