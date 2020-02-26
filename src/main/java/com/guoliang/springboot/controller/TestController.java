package com.guoliang.springboot.controller;


import com.guoliang.springboot.model.Book;
import com.guoliang.springboot.model.Person;
import com.guoliang.springboot.model.TestStatic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;


@RestController
@RequestMapping("test")
public class TestController {

    public void print(Object object){
        System.out.println(object);
    }

    @RequestMapping("person")
    public void person() {
        Person p = new Person();
        p.head = "guoliang";
        p.age  = "12";
        p.hand = "guoliang hand";
        System.out.println("head"+p.hand+p.age+p.hand);

    }

    @RequestMapping("hello2")
    public String sayHello2() {
        return String.valueOf(1/0);

    }
    @RequestMapping("hello3")
    public Object sayHello3() {
        TestStatic a = new TestStatic();
        TestStatic b = new TestStatic();
        a.setTest("testa");
        b.setTest("testa");
        char tc = 'b';

        int ti = 1;

        System.out.println(tc+ti);


        System.out.println(TestStatic.i);
        return a.getTest().equals(b.getTest());

    }
    @RequestMapping("hello")
    public String sayHello(){

        Integer a = 123;

        System.out.println(a.byteValue());

        String b = "abc ";

        System.out.println(b.matches("\\w*"));

        String bb = b.trim();

        String str = "Hello word , ms yang";
        String[] strs = str.split(" ");
        for(String s : strs){
            System.out.println(s);
        }

        char[] strs2 = str.toCharArray();

        for(char s2 : strs2){
            System.out.println(s2);
        }

        System.out.println(str.replaceAll("\\w+","*"));

        System.out.println(str.equals("yang"));

        System.out.println(str.equalsIgnoreCase("yang"));

        System.out.println(str.indexOf("y"));

        System.out.println(str.substring(1,3));

        System.out.println(str.contains("yang"));

        System.out.println(str.startsWith("hello"));

        StringBuffer sb = new StringBuffer("cccc");

        System.out.println(sb.append("ssss"));

        System.out.println(sb.capacity());

        System.out.println(sb.lastIndexOf("ssss"));

        double fl = 4.43;
        System.out.println(Math.ceil(fl));

        System.out.println(Math.floor(fl));

        System.out.println((int)(Math.ceil(100*Math.random())));


        System.out.println(Math.ceil(100*Math.random()));

        System.out.println(Math.ceil(100*Math.random()));

        print("aa");

        List<String> list = new ArrayList<String>();
        list.add("abcd");
        list.add("abcd23");
        list.add("abcd33");
        list.add("abcd44");
        list.add("abcd55");

        shuffle(list);


        return bb;

    }

    @RequestMapping("book")
    public List<Book> getBook(){
        List<Book> book = new ArrayList<>();
//        Book bookone = new Book();
//        bookone.setName("yao");
//        bookone.setPulisher("beijing");

        book.add(new Book("guoliang","Shandong   "));
        return book;

    }









}
