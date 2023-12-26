package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> newList = new ArrayList<>(List.copyOf(firstList));
        newList.addAll(secondList);
        Comparator<String> rev = Comparator.reverseOrder();
        PriorityQueue <String> q = new PriorityQueue<>(rev);
        q.addAll(newList);
        return q;

    }
}
