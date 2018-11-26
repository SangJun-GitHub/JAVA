package com.sangjun.java_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by bobsang89@gmail.com on 2018-11-25
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    static void addPhoneNumber(String groupName, String name, String number){
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(number,name);
    }

    static void addPhoneNumber(String name, String number){
        addPhoneNumber("Etc", name, number);
    }

    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }

    static void printPhoneBook(){
        Set set = phoneBook.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();

            Set subSet = ((HashMap)entry.getValue()).entrySet();
            Iterator subIterator = subSet.iterator();

            System.out.println(" * " + entry.getKey() + " [" + subSet.size() + "]");

            while(subIterator.hasNext()){
                Map.Entry subEntry = (Map.Entry)subIterator.next();
                String number = (String)subEntry.getKey();
                String name = (String)subEntry.getValue();
                System.out.println(name + " " + number);
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
        addPhoneNumber("friend", "sang" , "111-111-1111");
        addPhoneNumber("friend", "jun", "222-222-2222");
        addPhoneNumber("friend", "park", "333-333-3333");
        addPhoneNumber("friend", "java", "333-333-3333");
        addPhoneNumber("company", "sang", "111-111-111");
        addPhoneNumber("company","jun","444-444-4444");
        addPhoneNumber("company", "park", "555-555-5555");
        addPhoneNumber("java", "666-666-6666");

        printPhoneBook();
    }
}
