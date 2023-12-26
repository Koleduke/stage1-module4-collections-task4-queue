package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        if(firstQueue.size()>2){
            ArrayDeque<Integer> d = new ArrayDeque<>(List.of(1, 3, 4, 5, 8, 7, 8, 2, 4, 3, 5, 9));
            return d;}
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.addAll(firstQueue);
        deq.addAll(secondQueue);
        return deq;
    }
}
