package com.fengli.beanFactorys;

import com.fengli.beans.Bean2;

/**
 * 静态工厂进行实例化bean
 */
public class Bean2Factory {
    public static Bean2 getInstance(){
        return new Bean2();
    }
}
