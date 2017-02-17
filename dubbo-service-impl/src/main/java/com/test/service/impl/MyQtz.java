package com.test.service.impl;

import org.springframework.stereotype.Component;

/**
 * Created by 343617 on 2017/2/17.
 */
@Component("myQtz")
public class MyQtz {

    private Integer counter = 0;

    public void myMethod(){
        System.out.println("打印时间："+System.currentTimeMillis()+"\t次数:"+(++counter));
    }
}
