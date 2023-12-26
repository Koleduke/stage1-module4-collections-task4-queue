package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>(numberOfDishes);
        for (int i = 1; i<numberOfDishes+1;i++){
            list.add(i);
        }
        List<Integer> res= new ArrayList<>(numberOfDishes);
        int count = 0;

        for (int i =0; res.size()<numberOfDishes;i++){

            if(list.get(i)==0){
                if(i+1>=numberOfDishes){i=-1;
                }
                continue;}
            count++;
            if(count==everyDishNumberToEat){
                res.add(list.get(i));
                list.set(i,0);
                count=0;
            }

            if(i+1>=numberOfDishes){i=-1;
            }

        }

        return res;
    }
}
