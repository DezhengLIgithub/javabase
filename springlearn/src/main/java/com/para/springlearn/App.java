package com.para.springlearn;

import com.para.springlearn.entity.Car;
import com.para.springlearn.entity.User;
import com.para.springlearn.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) throws InterruptedException {
        // 用我们的配置文件来启动一个 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        System.out.println("context 启动成功");

        System.out.println(App.class.getClassLoader().getResource("application.xml"));

        // 从 context 中取出我们的 Bean，而不是用 new MessageServiceImpl() 这种方式
//        MessageService messageService = context.getBean(MessageService.class);
        // 这句将输出: hello world
//        System.out.println(messageService.getMessage());
//        User user = context.getBean(User.class);
//        Thread th1 = new Thread(()->{
//            user.setId(111);
//            user.setUserName("lidz");
//            user.setAge(20);
//        });
//
//        Thread th2 = new Thread(()->{
//            User user2 = context.getBean(User.class);
//            System.out.println(user2.toString());
//        });
//
//        th1.start();
//        th2.start();
//        th1.join();
//        th2.join();

        Car car1 = (Car) context.getBean("car1");
        Car car2 = (Car) context.getBean("car2");
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());
    }
}
