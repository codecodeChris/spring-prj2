package cn.edu.zjut.app;

import cn.edu.zjut.bean.IItem;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.ItemOrder;
import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.event.EmailEvent;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Date;
import java.util.Locale;

public class SpringEnvTest {
    public static void main(String args[]){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("web/WEB-INF/spring-config.xml");
        //XmlBeanFactory factory = new XmlBeanFactory(ctx);
        //IItemOrder itemorder1 = (IItemOrder) factory.getBean("itemorder2");
        //FileSystemXmlApplicationContext可以使用相对路径和绝对路径
        //ClassPathXmlApplicationContext脱离resource之后只能通过file：+绝对路径来访问
        //IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder1");
        //ctx.close();




        /*Object[] objects = new Object[]{"HelloWorld",new Date()};
        String message= ctx.getMessage("HelloWorld",objects, Locale.US); // String message= // ctx.getMessage("HelloWorld",objects,Locale.US);
         System.out.println(message);*/


        EmailEvent ele = new EmailEvent("hello", "spring_test@zjut.edu.cn", "this is a test");
        ctx.publishEvent(ele);
        //ooooooooooooo
        //55555

    }
}
