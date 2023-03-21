package Lezione;

import java.util.*;

public class CollectionsLesson {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();

        l.add("A");
        l.add("B");

        Iterator<String> i = l.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Queue<String> coda = new PriorityQueue<String>();

        coda.add("primo");
        coda.add("secondo");

        Iterator<String> priorita = coda.iterator();

        while (priorita.hasNext()) {
            System.out.println(priorita.next());
        }


    }
}
