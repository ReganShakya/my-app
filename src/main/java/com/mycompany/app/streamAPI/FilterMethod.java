/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author regan
 */
public class FilterMethod {
    public static void main(String[] args) {
        
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        
        Stream<String> depStream = departmentList.stream();
        depStream.filter(word -> word.startsWith("S"))
                .forEach(System.out::println);
    }
}
