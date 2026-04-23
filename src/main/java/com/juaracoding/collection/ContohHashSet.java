package com.juaracoding.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ContohHashSet {
    public static void main(String[] args) {
//        HashSet<Long> hashSet = new HashSet<>();
        Set hashSet = new HashSet<>();
        User user = new User();
        hashSet.add(user);
        hashSet.add(1);
        hashSet.add("2");
        System.out.println("HashSet : "+hashSet);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("HashSet : "+iterator.next());
        }

    }
}
