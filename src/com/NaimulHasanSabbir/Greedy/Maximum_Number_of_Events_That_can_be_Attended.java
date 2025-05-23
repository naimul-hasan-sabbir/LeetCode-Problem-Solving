package com.NaimulHasanSabbir.Greedy;

import java.util.*;

public class Maximum_Number_of_Events_That_can_be_Attended {
    public int maxEvents(int[][] events){
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int result = 0, eventsIndex = 0;
        int currentStartTime = 0;

        while(!pq.isEmpty() || eventsIndex < events.length){
            if(pq.isEmpty()){
                currentStartTime = events[eventsIndex][0];
            }
            while(eventsIndex < events.length && events[eventsIndex][1] >= currentStartTime){
                pq.offer(events[eventsIndex++][0]);
            }
            pq.poll();
            ++result;
            ++currentStartTime;

            while(!pq.isEmpty() && pq.peek() < currentStartTime){
                pq.poll();
            }
        }
        return result;
    }
}
