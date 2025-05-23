package com.NaimulHasanSabbir.Greedy;

public class Tester {
    public static void main(String[] args) {
        int[][] events = { {1,2}, {2,3}, {3,4} };
        Maximum_Number_of_Events_That_can_be_Attended t = new Maximum_Number_of_Events_That_can_be_Attended();
        System.out.println(t.maxEvents(events));
    }
}
//[[1,4],[4,4],[2,2],[3,4],[1,1]]
