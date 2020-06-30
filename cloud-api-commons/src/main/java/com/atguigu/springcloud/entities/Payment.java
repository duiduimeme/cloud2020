package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data//省去代码中大量的get()、 set()、 toString()等方法
@AllArgsConstructor//使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor//使用后创建一个无参构造函数
public class Payment implements Serializable {

    private Long id;
    private String serial;
}