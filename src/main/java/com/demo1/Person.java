package com.demo1;

import java.io.Serializable;

/**
 * @author PeiDong Yan
 * @date 2020/12/08 9:45
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -716266700077384042L;
    private String name;
    private int age  ;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
