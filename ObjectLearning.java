package com.sangjun.java_practice;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

import static junit.framework.TestCase.*;

public class ObjectLearning {

    public static class Struct {
        String name;
        int age;
    }

    public static class ClassTemp /* extends Object */{
        String name;
        int age;

        public void sayYourName() {
            System.out.println("My name is " + name);
        }

        @Override
        public boolean equals(Object classTemp) {
            ClassTemp counterPart =((ClassTemp)classTemp);////////////////////////////
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
        classTemp1.sayYourName();

        ClassTemp classTemp2 = new ClassTemp();
        classTemp2.sayYourName();

        classTemp1.equals(classTemp2);

        "dfsdf".equals("dfsdf");

    }

    @Test
    public void test1() {
        ClassTemp classTemp1 = new ClassTemp();
        classTemp1.sayYourName();
        classTemp1.name = "siwoo";
        classTemp1.age = 20;
        ClassTemp classTemp2 = new ClassTemp();
        classTemp2.sayYourName();
        classTemp2.name = "siwoo";
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
        person1.name = "siwoo";
        person1.salary = 200.2;

        Person person2 = new Person();
        person2.name = "sangjun";
        person2.salary = 5555.2f;

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(new Date().toString());
    }


    @Test
    public void hMartTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException, FileNotFoundException {
        Hmart hmartFinch = new Hmart();
        System.out.println(hmartFinch.toString());
        //  assertTrue(hmartFinch.getName().equals("DEFAULT_NAME"));

        Class hmartClass = hmartFinch.getClass();//Hmart.class;
        System.out.println(hmartClass.getName());
        Hmart hmart = (Hmart) Class.forName("com.studygroup.lang.Hmart")
                .newInstance();

        Scanner scanner = new Scanner(new FileReader(Paths.get(".","src/main/resources","class.info").toString()));
        Class patClass = Class.forName( scanner.nextLine() );
        PAT pat = (PAT) patClass.newInstance();
        assertNotNull(pat);

    }
}