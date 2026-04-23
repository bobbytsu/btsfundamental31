package com.juaracoding.collection;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
            ArrayList<User> users = new ArrayList<>();
            User user = new User();
            user.setId(1L);
            user.setName("Juan");
            user.setPassword("123456");
            users.add(user);

            user = new User();
            user.setId(2L);
            user.setName("Bobby");
            user.setPassword("654321");
            users.add(user);
            int size = users.size();
            System.out.println("list : "+users);
            for(int i = 0; i < size; i++){
                    System.out.println("Alamat : "+users.get(i));
                    System.out.println("Id : "+users.get(i).getId());
                    System.out.println("Name : "+users.get(i).getName());
                    System.out.println("Password : "+users.get(i).getPassword());
            }
            users.clear();
            System.out.println("Isi Users setelah di clear : "+users);
            user = new User();
            user.setId(3L);
            user.setName("Ari");
            user.setPassword("546221");
            users.add(user);

            user = new User();
            user.setId(4L);
            user.setName("Hakim");
            user.setPassword("7654321");
            users.add(user);

            user = new User();
            user.setId(5L);
            user.setName("Noor");
            user.setPassword("7531589");
            users.add(user);
            System.out.println("Isi Users : "+users);
            ArrayList<Double> users2 = new ArrayList<>();
    }
}