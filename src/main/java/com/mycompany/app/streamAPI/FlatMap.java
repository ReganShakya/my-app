/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author regan
 */
public class FlatMap {
    public static void main(String[] args) {
        String[] arrayOfWords = {"Eazy", "Bytes"};
        Stream<String> stramOfWords = Arrays.stream(arrayOfWords);
        stramOfWords.map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
        
        List<List<String>> list = Arrays.asList(Arrays.asList("Easy"),
            Arrays.asList("Bytes"));
        System.out.println(list);
        list.stream().map(Collection::stream).forEach(System.out::println);
        list.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
