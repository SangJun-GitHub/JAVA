package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx1 {
    public static void main(String[] args){
        try{
            try{

            }catch(Exception e){

            }
        }catch (Exception e){
            try {
                //            }catch (Exception e){  Exception e is duplicate
            }catch (Exception e2){

            }
        }

        try{}catch (Exception e){}
    }

}
