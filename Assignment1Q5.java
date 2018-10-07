package com.sangjun.assingment;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-10-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */

public class Assignment1Q5 {
    final static double MINIMUM = 14;
    public static class Employee{
        public enum Level {
            JUNIOR, SENIOR, MANAGER;
        }

        private Long id;
        private String name;
        private double wages;
        private double workingHour;
        private double overTime;
        private Level level;
        private boolean insurance;

        public Level getLevel() {
            return level;
        }

        public void setLevel(Level level) {
            this.level = level;
        }

        public boolean isInsurance() {
            return insurance;
        }

        public double getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWorkingHour() {
            return workingHour;
        }

        public void setWorkingHour(double workingHour) {
            this.workingHour = workingHour;
        }

        public double getOverTime() {
            return overTime;
        }

        public void setOverTime(double overTime) {
            this.overTime = overTime;
        }


        public boolean getInsurance() {
            return insurance;
        }

        public void setInsurance(boolean insurance) {
            this.insurance = insurance;
        }

        public double getWages() {
            return wages;
        }

        public void setWages(double wages) {
            this.wages = wages;
        }

        public void displayEmployPay(){
            double total =0;
            System.out.println("Employee Name                 : " + getName());
            System.out.println("Employee working time         : " + getWorkingHour() + " Hours");
            total += getWages() * getWorkingHour();
            System.out.println("Employee over time            : " + getOverTime() + " Hours");
            total += (getWages() * 1.5 ) * getOverTime();
            System.out.print(  "Employee state of insurance   : ");
            if(getInsurance() == true){
                System.out.println("Have");

            }else{
                System.out.println("Don't Have");
            }
            System.out.println("Total payment is              : " + total + "$");

        }

    }

    public static class EmployeeFunction{

        public static Employee addEmployee(){
            Employee employee = new Employee();
            System.out.println("Enter the Employee number");
            Scanner s = new Scanner(System.in);
            employee.setId(s.nextLong());
            System.out.println("Enter the Employee name");
            employee.setName(s.next());
            System.out.println("Enter the Employee working hour");
            employee.setWorkingHour(s.nextDouble());
            System.out.println("Enter the Employee over time");
            employee.setOverTime(s.nextDouble());
            System.out.println("Enter the Employee level(JUNIOR, SENIOR, MANAGER)");
            employee.setLevel(Employee.Level.valueOf(s.next().toUpperCase()));
            if(employee.getLevel().equals(Employee.Level.JUNIOR)) {
                employee.setWages(MINIMUM);
            }else if(employee.getLevel().equals(Employee.Level.SENIOR)){
                employee.setWages(MINIMUM * 1.2);
            }else if(employee.getLevel().equals(Employee.Level.MANAGER)){
                employee.setWages(MINIMUM * 1.6);
            }
            System.out.println("Enter the state of Employee insurance");
            employee.setInsurance(s.nextBoolean());

            return employee;
        }


        public static void displayEmployee(List<Employee> employees, int index){
            displayEmployee(employees.get(index));
        }
        public static void displayEmployee(Employee employee){
            System.out.println("Employee ID   : " + employee.getId());
            System.out.println("Employee Name : " + employee.getName());
            System.out.println("Employee Level: " +employee.getLevel());
            System.out.println("Employee working Hours: " + employee.getWorkingHour());
            System.out.println("Employee Over Time: " + employee.getOverTime());
        }

        public static void displayAllEmployee(List<Employee> employees){
            for (int i = 0; i < employees.size(); i++){
                displayEmployee(employees.get(i));
            }
        }


        public static int findEmployee(List<Employee> employees){
            System.out.println("Enter Employee Id");
            Long employeeNum = new Scanner(System.in).nextLong();
            int index = 0;
            for(int i = 0; i < employees.size(); i++){
                if(employees.get(i).getId() == employeeNum)
                    index = i;
            }
            return index;
        }
    }

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        String s = new Scanner(System.in).next().toUpperCase();
        while (!s.equals("EXIT")) {
            switch (s) {
                case "ADD":
                    employees.add(EmployeeFunction.addEmployee());
                    break;
                case "ALL":

                case "DISPLAY":
                    break;
                case "CALCULATE":
                    break;
                default:
                    System.out.println("Your enter is wrong");
                    break;

            }

        }

    }

}
