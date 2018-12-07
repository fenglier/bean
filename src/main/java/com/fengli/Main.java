package com.fengli;

import com.fengli.beans.Bean1;
import com.fengli.beans.Bean2;
import com.fengli.beans.Bean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;



    public static void main(String argc[]){
        /**
         * 构造器实例化，使用默认构造函数。
         */

        context=new ClassPathXmlApplicationContext("SpringBeans.xml");
        Bean1 bean1= (Bean1) context.getBean("bean1");
        bean1.eatBean();

        /**
         * 使用静态工厂方式进行bean实例化
         */
        Bean2 bean2= (Bean2) context.getBean("bean2");
        bean2.bean2DoSomething();

        /**
         * 使用工厂方式进行bean
         */
        Bean3 bean3= (Bean3) context.getBean("bean3");
        bean3.bean3Want();
    }
}
