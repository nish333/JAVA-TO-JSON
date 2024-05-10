package com.TeleApps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TeleApps.demo.domain.MyObject;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("/objects")
    public List<MyObject> getObjects() {
        List<MyObject> objects = new ArrayList<>();
        
       MyObject obj1 = new MyObject();
       obj1.setName("Nishanth");
       obj1.setAge(23);
       obj1.setDepartment("CSE");
       obj1.setAddress("T.V.Malai");
       objects.add(obj1);

       MyObject obj2 = new MyObject();
       obj2.setName("Ribash");
       obj2.setAge(23);
       obj2.setDepartment("ECE");
       obj2.setAddress("Singapore");
       objects.add(obj2);

       MyObject obj3 = new MyObject();
       obj3.setName("Sankar");
       obj3.setAge(23);
       obj3.setDepartment("CIVIL");
       obj3.setAddress("Chennai");
       objects.add(obj3);

       MyObject obj4 = new MyObject();
       obj4.setName("Arun");
       obj4.setAge(23);
       obj4.setDepartment("IT");
       obj4.setAddress("Dubai");
       objects.add(obj4);

       MyObject obj5 = new MyObject();
       obj5.setName("Yuvi");
       obj5.setAge(26);
       obj5.setDepartment("ECE");
       obj5.setAddress("Thanjavur");
       objects.add(obj5);

 
        return objects;
    }
}
