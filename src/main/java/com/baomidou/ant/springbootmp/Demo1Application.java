package com.baomidou.ant.springbootmp;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//@ComponentScan("com.baomidou.ant")
//@EnableConfigurationProperties({Demo1Application.class})
//@SpringBootApplication
@EnableScheduling
@EnableAsync
@Log4j2
public class Demo1Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Demo1Application.class, args);
//        double random = 32.33;
//        long l = new Double(random).longValue();
//        long t1=270000000L;
        System.out.println(11);
//        System.out.println(l);
//        System.out.println(t1*3333);
//        Person p=new Person();
//        System.out.println(p);
//        p.setAge(10);
//        System.out.println(p);
//        LocalDate ll1=LocalDate.now();
//        System.out.println(ll1);
//        System.out.println(ll1.getDayOfMonth());
//        System.out.println(ll1.getDayOfWeek());
//        System.out.println(ll1.getDayOfYear());
//        System.out.println(ll1.getMonth());
//        System.out.println(ll1.getMonthValue());
//        System.out.println(ll1.getYear());

    }



}
