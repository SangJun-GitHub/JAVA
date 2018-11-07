package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ParserTest {
    public static void main(String[] args){
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}

interface Parseable {
    public abstract void parse(String fileName);
}

class ParserManager{
    public static Parseable getParser(String type){
        if(type.equals("XML"))
            return new XMLParser();
        else
            return new HTMLParser();
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName){
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName){
        System.out.println(fileName + "- HTML parsing completed.");
    }
}
