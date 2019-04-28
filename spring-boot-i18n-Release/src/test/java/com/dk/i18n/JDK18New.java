package com.dk.i18n;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @title: JDK18New
 * @projectName spring-boot-learnning
 * @Description: Stream是Java 8 提供的高效操作集合类（Collection）数据的API。流式编程
 * @Author Cheri
 * @Date: 2019/4/28 19:52
 */
public class JDK18New {

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("regular", "expression", "specified", "as", "a", "string", "must");

        int countByIterator = 0;
        for (String word: wordList) {
            if (word.length() > 7) {
                countByIterator++;
            }
        }
        System.out.println(countByIterator);

        //用Stream实现：
        long countByStream= wordList.stream().filter(a -> a.length() > 7).count();
        System.out.println(countByStream);

        long countByParallelStream = wordList.parallelStream().filter(w -> w.length() > 7).count();
        System.out.println(countByParallelStream);


        Stream<String> distinctStream = Stream.of("a", "b", "a","f","c","h").distinct();
        Stream<String> sortedStream = Stream.of("Beijing", "Shanghai", "Chengdu").sorted(Comparator.comparing
                (String::length).reversed());
        System.out.println(Arrays.toString(distinctStream.sorted().distinct().toArray()));

        System.out.println("**********************************************--》");

        List<Integer> list =  Arrays.asList();
        //通过reduce方法得到一个Optional类
        int a =  list.stream().reduce(Integer::sum).orElse(get("a"));
        int b =  list.stream().reduce(Integer::sum).orElseGet(() -> get("b"));
        System.out.println("a  "+a);
        System.out.println("b  "+b);
    }

    public static int get(String name){
        System.out.println(name+"执行了方法");
        return 1;
    }


}
