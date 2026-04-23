package com.juaracoding.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContohHashMap {
    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        {
//            "nama":"paul",
//            "email":"paul@gmail.com",
//            "provinsi":"Jakarta"
//        };
//
//        {
//            "nama":"paul",
//            "tanggal_lahir":"paul@gmail.com",
//            "alamat":"Jakarta",
//            "otp":123154,
//            "status":true
//        };

//        JSON -> Jackson -> Object Java
        /** Anonymous Class */
        Map<String, Object> hashMap = new HashMap<>();
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        hashMap.put("nama","paul");
        hashMap.put("alamat","Jakarta");
        hashMap.put("tanggal_lahir","2000-01-01");
        hashMap.put("email","paul@gmail.com");
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }
//        User user = new User();
//        user.setName("paul");
//        user.setPassword("123456");
//        nama email alamat no_hp gol_darah
//                SELECT nama,email,alamat,no_hp,gol_darah from m_user;

    }
}
