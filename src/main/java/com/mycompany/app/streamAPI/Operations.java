/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.streamAPI;

import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author regan
 */
public class Operations {
    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt).
                limit(10).forEach(System.out::println);
    }
}
