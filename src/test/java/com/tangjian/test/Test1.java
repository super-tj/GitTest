package com.tangjian.test;

import com.tangjain.Hello.HelloGit;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author 60206
 * @Create 2021/3/16 - 11:20
 * @Description
 */
public class Test1 {

    @Test
    public void test1(){
        int actualInt;
        int expectedInt;
        HelloGit helloGit = new HelloGit();
        actualInt = helloGit.add(5,6);
        expectedInt = 11;
        Assert.assertEquals(actualInt, expectedInt);
    }

}
