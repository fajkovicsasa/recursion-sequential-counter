package com.kayak.sequential_counter;

import com.kayak.sequential_counter.counter.Counter;

public class App {

    public static void main(String[] args) {

        Counter.countUp(10, 20);

        System.out.println("------------------------------------------------");

        Counter.countUpAndDown(10, 20);
    }
}
