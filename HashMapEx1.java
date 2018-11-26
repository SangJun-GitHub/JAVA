package com.sangjun.java_practice;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-11-25
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx1 {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("sang", "1234");
        map.put("jun", "1111");
        map.put("park", "1234");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter ID and Password");
            System.out.print("ID: ");
            String id = scanner.next().trim();

            System.out.print("Password: ");
            String password = scanner.next().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("ID is not exist");
            }else{
                if(!(map.get(id)).equals(password)){
                    System.out.println("ID and Password are not matched");
                }else{
                    System.out.println("ID and Password are matched");
                    break;
                }
            }
        }
    }
}
