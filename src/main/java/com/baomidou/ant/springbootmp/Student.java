package com.baomidou.ant.springbootmp;

/**
 * @author PeiDong Yan
 * @date 2020/12/21 10:44
 */
public class Student {
    String lesson;
    int grade;
    Person person;

    public boolean cc() {
        if (1 == 1) return true;
        return true;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Student(String lesson, int grade, Person person) {
        this.lesson = lesson;
        this.grade = grade;
        this.person = person;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String lesson, int grade) {
        this.lesson = lesson;
        this.grade = grade;
    }

}
