package com.juaracoding.collection;

import java.util.ArrayList;

public class Coba {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        users.add(user);
        users.add(user);
        users.add(user);
        System.out.println("list : "+users);
    }
}
