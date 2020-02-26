package com.guoliang.springboot.controller;

import com.guoliang.springboot.model.Dash;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("stream")
public class StreamController {

    @RequestMapping("test")
    public Object test(){
      //  String res = "";

        List<Dash> menu = Arrays.asList(
                new Dash("Pork",false,800,Dash.Type.FISH),
                new Dash("Pork2",false,700,Dash.Type.FISH),
                new Dash("Pork3",false,400,Dash.Type.FISH),
                new Dash("Pork4",true,530,Dash.Type.FISH),
                new Dash("Pork5",false,350,Dash.Type.MEAT),
                new Dash("Pork6",true,120,Dash.Type.FISH),
                new Dash("Pork7",false,550,Dash.Type.MEAT),
                new Dash("Pork8",true,300,Dash.Type.MEAT),
                new Dash("Pork9",false,450,Dash.Type.OTHER),
                new Dash("Pork10",false,100,Dash.Type.MEAT),
                new Dash("Pork11",false,200,Dash.Type.OTHER),
                new Dash("Pork12",false,300,Dash.Type.MEAT)
        );

       List <String> threeHighCaloricDishNames =
               menu.stream()
               .filter(d -> d.getCalories()>300)
                       .filter(d -> d.getType().equals(Dash.Type.FISH))
               .map(Dash::getName)
                       .skip(2)
               //.limit(3)
               //.forEach(System.out::println)
               .collect(toList());


        return threeHighCaloricDishNames;

    }

    @RequestMapping("test2")
    public Object test2(){
        List<String> str = new ArrayList<String>();
        str.add("Hello");
        str.add("World");

        List<String> str2 = str.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        return str2;
    }

}
