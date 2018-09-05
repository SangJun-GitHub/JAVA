package com.sangjun.java_practice;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class ObjectLearning {

    public static class Struct {
        String name;
        int age;
    }

    public static class ClassTemp /* extends Object */{
        String name;
        int age;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "ClassTemp{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
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

        public void sayYourName() {
            System.out.println("My name is " + name);
        }

        @Override
        public boolean equals(Object classTemp) {
            ClassTemp counterPart =((ClassTemp)classTemp);
            return name.equals(counterPart.name);
        }
    }

    public static class School {
        String schoolName;
        int studentNum;

        @Override
        public boolean equals(Object schoolTemp) {
            School counterPart = ((School)schoolTemp);
            return schoolName.equals(counterPart.schoolName);

        }

    }

    public static void main(String[] args) {

        Struct struct1 = new Struct();
        struct1.name = "struct";
        System.out.println("My name is " + struct1.name);


        Struct struct2 = new Struct();
        struct2.name = "struct";
        System.out.println("My name is " + struct2.name);


        ClassTemp classTemp1 = new ClassTemp();
        classTemp1.setName("classTemp1");
        classTemp1.sayYourName();
        System.out.println(classTemp1.getName());

        ClassTemp classTemp2 = new ClassTemp();
        classTemp2.setName("calssTemp2");
        System.out.println(classTemp2.getName());

        classTemp1.equals(classTemp2);//////////
        "dfsdf".equals("dfsdf");///////////////

        classTemp1.setAge(15);
        classTemp2.setAge(50);
        System.out.println(classTemp1.getAge());
        System.out.println(classTemp2.getAge());
        classTemp1.setName("OOP244");
        classTemp2.setName("DBS301");
        System.out.println(classTemp1.getName());
        System.out.println(classTemp2.getName());
        System.out.println(classTemp1);
        System.out.println(classTemp2);

    }

    @Test
    public void test1() {
        ClassTemp classTemp1 = new ClassTemp();
        classTemp1.sayYourName();
        classTemp1.name = "sangjun";
        classTemp1.age = 20;
        ClassTemp classTemp2 = new ClassTemp();
        classTemp2.sayYourName();
        classTemp2.name = "sangjun";
        classTemp2.age = 30;

        assertTrue(classTemp1.equals(classTemp2));
        assertTrue(classTemp1.equals(classTemp1));

        assertFalse(classTemp1 == classTemp2);
        assertTrue(classTemp1 == classTemp1);

        School schoolTemp1 = new School();
        School schoolTemp2 = new School();
        schoolTemp1.schoolName = "Seneca";
        schoolTemp1.studentNum = 50;
        schoolTemp2.schoolName = "Seneca";
        schoolTemp2.studentNum = 5;
        assertTrue(schoolTemp1.equals(schoolTemp2));
        assertTrue(schoolTemp1.studentNum == 50);

        schoolTemp1 = schoolTemp2;
        assertTrue(schoolTemp1.studentNum == 5);
        schoolTemp1.studentNum = 90;
        assertTrue(schoolTemp2.studentNum == 90);
        System.out.println(schoolTemp2.studentNum);
    }

    public static class Person {
        private double salary;
        private String name;

        @Override
        public String toString() {
            return "Person{" +
                    "salary=" + salary +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    public void learningTest2() {
        Object object = new Object();
        System.out.println(object);
        System.out.println(object.toString());

        Person person = new Person();
        System.out.println(person);
        System.out.println(person.toString());

        Person person1 = new Person();
        person1.name = "sangjun";
        person1.salary = 200.2;

        Person person2 = new Person();
        person2.name = "sangjun";
        person2.salary = 5555.2f;

        System.out.println(person1);
        System.out.println(person2);
        assertEquals(person1.name, person2.name);
        assertNotEquals(person1.salary, person2.salary);
        assertFalse(person1.equals(person2));

        System.out.println(new Date().toString());
    }

}