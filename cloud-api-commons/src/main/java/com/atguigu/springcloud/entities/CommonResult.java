package com.atguigu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    //data可能为null，构建两个参数的构造器
    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
