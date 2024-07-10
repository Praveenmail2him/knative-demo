package com.ibm.isdl.knative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Knativecontroller {

    private int count =0;

    @GetMapping("/")
   public String hello(){

        count ++;

        if (count %2 ==0)
        {
            return "<!DOCTYPE html><html><head><style>body{background-color:red}</style></head><body><h1>Hello from Spring Boot for KNative!!</h1></body></html>";
        }
        else {
            return "<!DOCTYPE html><html><head><style>body{background-color:blue}</style></head><body><h1>Hello from Spring Boot for KNative!!</h1></body></html>";
        }
       
    }
    
}
