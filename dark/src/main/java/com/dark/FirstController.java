package com.dark;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
//    @GetMapping("/hello")
//    String sayHello(){
//        return "HE";
//    }
   @PostMapping("/post")
    String post(@RequestBody Order order){
     return "oreder is "+order.toString();
   }
    @GetMapping("/order")
    Order getOrder(){
        return new Order("AK","GPIX","2");
    }
    @PostMapping("/postRec")
    String postOrder(@RequestBody ORDERRECORD order){
        return order.toString();
    }
    //hello/ali
    @GetMapping("/hello/{user-name}")
    String pathVar(
            @PathVariable("user-name")  String username){

        return "My val ="+username;
    }
    //hello?paramVar=paramval && paramNam2=va2
    @GetMapping("/hello")
    String paramVar(
            @RequestParam("user-name")  String username

    ){

        return "My val ="+username;
    }

}
