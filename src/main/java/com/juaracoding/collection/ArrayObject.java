package com.juaracoding.collection;

public class ArrayObject {

    public static void main(String[] args) {
        User [] userArr = new User[2];
        User user = new User();
        user.setId(1L);
        user.setName("Juan");
        user.setPassword("123456");
        user.setEmail("juan@gmail.com");
        System.out.println("ID : "+user.getId());
        System.out.println("Nama : "+user.getName());
        System.out.println("---------------------------------");
        userArr[0]=user;

        user = new User();
        user.setId(2L);
        user.setName("Andika");
        user.setPassword("654321");
        user.setEmail("andi@gmail.com");
        userArr[1]=user;
        System.out.println("ID : "+user.getId());
        System.out.println("Nama : "+user.getName());
        for (User u :
             userArr) {
            System.out.println("Alamat : "+u);
            System.out.println("ID : "+u.getId());
            System.out.println("Nama : "+u.getName());
            System.out.println("Email : "+u.getEmail());
            System.out.println("Password : "+u.getPassword());
            System.out.println("===============");
        }
        userArr = null;
        userArr = new User[50];

    }
}
